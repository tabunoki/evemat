package com.binarysprite.evemat.page.transaction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.extensions.markup.html.repeater.util.SortableDataProvider;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.navigation.paging.PagingNavigator;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

import com.binarysprite.evemat.Constants;
import com.binarysprite.evemat.entity.WalletTransaction;
import com.binarysprite.evemat.page.FramePage;
import com.binarysprite.evemat.page.transaction.data.WalletTransactionModelObject;
import com.binarysprite.evemat.panel.PaginationPanel;
import com.binarysprite.evemat.service.transaction.TransactionCountService;
import com.binarysprite.evemat.service.transaction.TransactionSelectService;
import com.google.inject.Inject;

/**
 * 取引情報を表示するウェブページクラスです。
 * 
 * @author Tabunoki
 * 
 */
public class TransactionPage extends FramePage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1086855179809928708L;

	/**
	 * 
	 */
	public static final String WICKET_ID_TRANSACTION_DATA_VIEW = "transactionDataView";

	/**
	 * 
	 */
	public static final String WICKET_ID_WHEN_LABEL = "whenLabel";

	/**
	 * 
	 */
	public static final String WICKET_ID_TYPE_NAME_LABEL = "typeNameLabel";

	/**
	 * 
	 */
	public static final String WICKET_ID_PRICE_LABEL = "priceLabel";

	/**
	 * 
	 */
	public static final String WICKET_ID_QUANTITY_LABEL = "quantityLabel";

	/**
	 * 
	 */
	public static final String WICKET_ID_CLIENT_LABEL = "clientLabel";

	/**
	 * 
	 */
	public static final String WICKET_ID_STATION_LABEL = "stationLabel";

	/**
	 * 
	 */
	public static final String WICKET_ID_PAGING_NAVIGATOR = "pagingNavigator";

	/**
	 * トランザクションのデータプロバイダです。
	 */
	private final SortableDataProvider<WalletTransactionModelObject, String> transactionDataProvider =
			new SortableDataProvider<WalletTransactionModelObject, String>() {

				/**
				 * {@inheritDoc}
				 */
				@Override
				public Iterator<? extends WalletTransactionModelObject> iterator(long first, long count) {

					List<WalletTransaction> walletTransactions = transactionSelectService.select(first, count);

					List<WalletTransactionModelObject> walletTransactionsModelObjects = new ArrayList<WalletTransactionModelObject>();

					for (WalletTransaction walletTransaction : walletTransactions) {
						walletTransactionsModelObjects.add(new WalletTransactionModelObject(walletTransaction));
					}

					return walletTransactionsModelObjects.iterator();
				}

				/**
				 * {@inheritDoc}
				 */
				@Override
				public IModel<WalletTransactionModelObject> model(WalletTransactionModelObject walletTransaction) {

					return new Model<WalletTransactionModelObject>(walletTransaction);
				}

				/**
				 * {@inheritDoc}
				 */
				@Override
				public long size() {

					return transactionCountService.count();
				}

			};

	/**
	 * トランザクションのデータビューです。
	 */
	private final DataView<WalletTransactionModelObject> transactionDataView = new DataView<WalletTransactionModelObject>(
			WICKET_ID_TRANSACTION_DATA_VIEW, transactionDataProvider, 100) {

		/**
		 * {@inheritDoc}
		 */
		@Override
		protected void populateItem(Item<WalletTransactionModelObject> item) {

			final WalletTransactionModelObject object = item.getModelObject();

			/*
			 * コンポーネントの生成
			 */
			final Label whenLabel = new Label(
					WICKET_ID_WHEN_LABEL,
					Constants.DATE_TIME_FORMAT.format(object.getTransactionDateTime().getTime()));
			final Label typeNameLabel = new Label(
					WICKET_ID_TYPE_NAME_LABEL,
					object.getTypeName());
			final Label priceLabel = new Label(
					WICKET_ID_PRICE_LABEL,
					Constants.PRICE_FORMAT.format(object.getPrice()));
			final Label quantityLabel = new Label(
					WICKET_ID_QUANTITY_LABEL,
					Constants.QUANTITY_FORMAT.format(object.getQuantity()));
			final Label clientLabel = new Label(
					WICKET_ID_CLIENT_LABEL,
					object.getClientName());
			final Label stationLabel = new Label(
					WICKET_ID_STATION_LABEL,
					object.getStationName());

			/*
			 * コンポーネントの編集
			 */
			if (object.getTransactionType().equals("sell")) {
				priceLabel.add(new AttributeModifier("class", "sell-price"));
			} else {
				priceLabel.add(new AttributeModifier("class", "buy-price"));
			}

			quantityLabel.add(new AttributeModifier("class", "quantity"));

			/*
			 * コンポーネントの組立
			 */
			item.add(whenLabel);
			item.add(typeNameLabel);
			item.add(priceLabel);
			item.add(quantityLabel);
			item.add(clientLabel);
			item.add(stationLabel);
		}
	};

	/**
	 * 
	 */
	@Inject
	private TransactionSelectService transactionSelectService;

	/**
	 * 
	 */
	@Inject
	private TransactionCountService transactionCountService;

	/**
	 * 
	 */
	public TransactionPage() {
		super();

		/*
		 * コンポーネントの生成
		 */

		final Label title = new Label(WICKET_ID_PAGE_TITLE_LABEL, "Transaction");

		final PagingNavigator pagingNavigator = new PaginationPanel(WICKET_ID_PAGING_NAVIGATOR, transactionDataView);

		/*
		 * コンポーネントの編集
		 */

		/*
		 * コンポーネントの組立
		 */
		add(title);
		add(transactionDataView);
		add(pagingNavigator);
	}

}