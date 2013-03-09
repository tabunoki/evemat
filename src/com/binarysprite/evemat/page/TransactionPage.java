package com.binarysprite.evemat.page;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.datetime.PatternDateConverter;
import org.apache.wicket.datetime.markup.html.basic.DateLabel;
import org.apache.wicket.extensions.markup.html.repeater.data.grid.ICellPopulator;
import org.apache.wicket.extensions.markup.html.repeater.data.table.DataTable;
import org.apache.wicket.extensions.markup.html.repeater.data.table.DefaultDataTable;
import org.apache.wicket.extensions.markup.html.repeater.data.table.IColumn;
import org.apache.wicket.extensions.markup.html.repeater.data.table.NavigationToolbar;
import org.apache.wicket.extensions.markup.html.repeater.data.table.PropertyColumn;
import org.apache.wicket.extensions.markup.html.repeater.util.SortableDataProvider;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.seasar.doma.jdbc.SelectOptions;
import org.seasar.doma.jdbc.tx.LocalTransaction;

import com.binarysprite.evemat.Constants;
import com.binarysprite.evemat.DB;
import com.binarysprite.evemat.entity.WalletTransaction;
import com.binarysprite.evemat.entity.WalletTransactionDao;
import com.binarysprite.evemat.entity.WalletTransactionDaoImpl;

/**
 * 取引情報を表示するウェブページクラスです。
 * @author Tabunoki
 *
 */
public class TransactionPage extends FramePage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1086855179809928708L;

	public TransactionPage() {
		super();

		/*
		 * データテーブルで使用するデータプロバイダの生成
		 */
		final SortableDataProvider<WalletTransactionModelObject, String> dataProvider =
				new SortableDataProvider<WalletTransactionModelObject, String>() {

					@Override
					public Iterator<? extends WalletTransactionModelObject> iterator(
							long first, long count) {
						
						WalletTransactionDao dao = new WalletTransactionDaoImpl();
						
						LocalTransaction transaction = DB.getLocalTransaction();
						
						transaction.begin();
						
						List<WalletTransactionModelObject> walletTransactions =
								WalletTransactionModelObjectFactory.getInstance().createWalletTransactionModelObjects(
										dao.selectAll(SelectOptions.get().offset((int) first).limit((int) count)));
						
						transaction.rollback();
						
						return walletTransactions.iterator();
					}

					@Override
					public IModel<WalletTransactionModelObject> model(
							WalletTransactionModelObject walletTransaction) {
						
						return new Model<WalletTransactionModelObject>(walletTransaction);
					}

					@Override
					public long size() {
						
						WalletTransactionDao dao = new WalletTransactionDaoImpl();

						LocalTransaction transaction = DB.getLocalTransaction();
						
						transaction.begin();
						
						long size = dao.count();
						
						transaction.rollback();
						
						return size;
					}
		};

		/*
		 * データテーブルで使用するカラムの生成
		 */
		List<IColumn<WalletTransactionModelObject, String>> columns = new ArrayList<IColumn<WalletTransactionModelObject, String>>();

		columns.add(new PropertyColumn<WalletTransactionModelObject, String>(
				new Model<String>("When"), "transactionDateTime") {

			@Override
			public void populateItem(
					Item<ICellPopulator<WalletTransactionModelObject>> item,
					String componentId,
					IModel<WalletTransactionModelObject> rowModel) {
				
				item.add(new DateLabel(
						componentId,
						new PropertyModel<Date>(rowModel.getObject(), super.getPropertyExpression()),
						new PatternDateConverter(Constants.DATE_TIME_PATTERN, false)));
			}
			
		});
		columns.add(new PropertyColumn<WalletTransactionModelObject, String>(new Model<String>("Type Name"), "typeName"));
		columns.add(new PropertyColumn<WalletTransactionModelObject, String>(new Model<String>("Price"), "price") {

			@Override
			public void populateItem(
					Item<ICellPopulator<WalletTransactionModelObject>> item,
					String componentId,
					IModel<WalletTransactionModelObject> rowModel) {
				
				final double price = rowModel.getObject().getPrice();
				
				if (rowModel.getObject().getTransactionType().equals("sell")) {
					item.add(new AttributeModifier("class", "sell-price"));
				} else {
					item.add(new AttributeModifier("class", "buy-price"));
				}
				
				item.add(new Label(componentId, Constants.PRICE_FORMAT.format(price)));
			}
		});
		columns.add(new PropertyColumn<WalletTransactionModelObject, String>(new Model<String>("Quantity"), "quantity") {

			@Override
			public void populateItem(
					Item<ICellPopulator<WalletTransactionModelObject>> item,
					String componentId,
					IModel<WalletTransactionModelObject> rowModel) {
				
				item.add(new AttributeModifier("class", "quantity"));
				item.add(new Label(componentId, Constants.QUANTITY_FORMAT.format(rowModel.getObject().getQuantity())));
			}
		});
		columns.add(new PropertyColumn<WalletTransactionModelObject, String>(new Model<String>("Client"), "clientName"));
		columns.add(new PropertyColumn<WalletTransactionModelObject, String>(new Model<String>("Station"), "stationName"));
		
		/*
		 * データテーブルの生成
		 */
		DataTable<WalletTransactionModelObject, String> table =
				new DefaultDataTable<WalletTransactionModelObject, String>(
						"transactions", columns, dataProvider, 100);
		table.addBottomToolbar(new NavigationToolbar(table));
		table.setVisibilityAllowed(true);
		this.add(table);

		Label title = new Label("title", "Transaction");
		this.add(title);
	}

}


/**
 * 取引情報のモデルオブジェクトです。
 * WalletTransaction クラスをシリアライズするためのサブクラスです。
 * モデルオブジェクトは Seirializable である必要がありますが、
 * WalletTransaction は Doma が管理し生成するクラスのため Serializable を実装できないためです。
 * 
 * @author Tabunoki
 *
 */
class WalletTransactionModelObject extends WalletTransaction implements Serializable {
	
}

/**
 * 取引情報のモデルオブジェクトを生成するファクトリークラスです。
 * @author Tabunoki
 *
 */
class WalletTransactionModelObjectFactory {
	
	private static final WalletTransactionModelObjectFactory INSTANCE = new WalletTransactionModelObjectFactory();
	
	/**
	 * インスタンスの生成は制限されています。
	 */
	private WalletTransactionModelObjectFactory() {
		super();
	}
	
	/**
	 * 唯一のインスタンスを取得します。
	 * @return
	 */
	public static WalletTransactionModelObjectFactory getInstance() {
		return INSTANCE;
	}

	/**
	 * トランザクションのモデルオブジェクトを生成します。
	 * @param walletTransactions
	 * @return
	 */
	public List<WalletTransactionModelObject> createWalletTransactionModelObjects(List<WalletTransaction> walletTransactions) {
		
		List<WalletTransactionModelObject> objects = new ArrayList<WalletTransactionModelObject>();
		
		for (WalletTransaction walletTransaction : walletTransactions) {
			
			WalletTransactionModelObject object = new WalletTransactionModelObject();
			
			object.setAccountKey(walletTransaction.getAccountKey());
			object.setCharacterId(walletTransaction.getCharacterId());
			object.setClientId(walletTransaction.getClientId());
			object.setClientName(walletTransaction.getClientName());
			object.setJournalTransactionId(walletTransaction.getJournalTransactionId());
			object.setPrice(walletTransaction.getPrice());
			object.setQuantity(walletTransaction.getQuantity());
			object.setStationId(walletTransaction.getStationId());
			object.setStationName(walletTransaction.getStationName());
			object.setTransactionDateTime(walletTransaction.getTransactionDateTime());
			object.setTransactionFor(walletTransaction.getTransactionFor());
			object.setTransactionId(walletTransaction.getJournalTransactionId());
			object.setTransactionType(walletTransaction.getTransactionType());
			object.setTypeId(walletTransaction.getTypeId());
			object.setTypeName(walletTransaction.getTypeName());
			
			objects.add(object);
		}
		
		return objects;
	}
}