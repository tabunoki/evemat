package com.binarysprite.evemat.sync;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.seasar.doma.jdbc.tx.LocalTransaction;

import com.binarysprite.evemat.Constants;
import com.binarysprite.evemat.DB;
import com.binarysprite.evemat.EveCentralClient;
import com.binarysprite.evemat.EveCentralMarketStat;
import com.binarysprite.evemat.entity.ProductBlueprintDao;
import com.binarysprite.evemat.entity.ProductBlueprintDaoImpl;
import com.binarysprite.evemat.entity.ProductPrice;
import com.binarysprite.evemat.entity.ProductPriceDao;
import com.binarysprite.evemat.entity.ProductPriceDaoImpl;

public class TypePriceSync implements EveSynchronizer {

	@Override
	public void synchronize() {

		final List<Integer> typeIDs = new ArrayList<Integer>();
		final List<Integer> regionIDs = new ArrayList<Integer>();
		final int hours = 24;
		final int minQuantity = 0;
		final int system = 0;
		
		final long updateTime = Calendar.getInstance(Constants.EVE_TIME_ZONE).getTimeInMillis();

		{
			LocalTransaction transaction = DB.getLocalTransaction();
			try {
				transaction.begin();
				
				final ProductBlueprintDao dao = new ProductBlueprintDaoImpl();
				
				typeIDs.addAll(dao.selectProductAndMaterialIdList());

			} finally {
				transaction.rollback();
			}
		}

		/*
		 * default: 10000002 (The Forge)
		 */
		regionIDs.add(10000002);

		final EveCentralClient client = new EveCentralClient();
		final List<EveCentralMarketStat> stats = client.getMarketStat(typeIDs,
				regionIDs, hours, minQuantity, system);


		{
			LocalTransaction transaction = DB.getLocalTransaction();
			try {
				// トランザクションの開始
				transaction.begin();

				ProductPriceDao dao = new ProductPriceDaoImpl();
				
				boolean isInsert;

				for (EveCentralMarketStat stat : stats) {
					
					isInsert = false;
					
					ProductPrice price = dao.selectById(stat.getTypeID());
					
					if (price == null) {
						price = new ProductPrice();
						isInsert = true;
					}
					
					price.setTypeId(stat.getTypeID());
					price.setUpdateTime(new Timestamp(updateTime));
					
					price.setAllVolume(stat.getAllVolume());
					price.setAllAverage(stat.getAllAvg());
					price.setAllMax(stat.getAllMax());
					price.setAllMin(stat.getAllMin());
					price.setAllMedian(stat.getAllMedian());
					price.setAllStandardDeviation(stat.getAllStdDev());
					
					price.setSellVolume(stat.getSellVolume());
					price.setSellAverage(stat.getSellAvg());
					price.setSellMax(stat.getSellMax());
					price.setSellMin(stat.getSellMin());
					price.setSellMedian(stat.getSellMedian());
					price.setSellStandardDeviation(stat.getSellStdDev());
					
					price.setBuyVolume(stat.getBuyVolume());
					price.setBuyAverage(stat.getBuyAvg());
					price.setBuyMax(stat.getBuyMax());
					price.setBuyMin(stat.getBuyMin());
					price.setBuyMedian(stat.getBuyMedian());
					price.setBuyStandardDeviation(stat.getBuyStdDev());

					if (isInsert) {
						dao.insert(price);
					} else {
						dao.update(price);
					}
					
				}

				transaction.commit();

			} finally {
				transaction.rollback();
			}
		}
	}

}
