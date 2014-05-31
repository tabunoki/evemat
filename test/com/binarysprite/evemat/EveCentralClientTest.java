package com.binarysprite.evemat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.binarysprite.evemat.util.evecentral.EveCentralClient;
import com.binarysprite.evemat.util.evecentral.EveCentralMarketOrder;
import com.binarysprite.evemat.util.evecentral.EveCentralMarketStat;

public class EveCentralClientTest {

	@Test
	public void testGetMarketStatCollectionOfIntegerCollectionOfIntegerIntIntInt() {
		
		
		EveCentralClient client = new EveCentralClient();
		
		final List<Integer> typeIDs = new ArrayList<Integer>();
		final List<Integer> regionIDs = new ArrayList<Integer>();
		final int hours = 24;
		final int minQuantity = 0;
		final int system =0;
		
		typeIDs.add(34);
		typeIDs.add(35);
		
		regionIDs.add(10000002);
		
		final List<EveCentralMarketStat> stats = client.getMarketStat(typeIDs, regionIDs, hours, minQuantity, system);
		
		
		for (EveCentralMarketStat stat : stats) {
			System.out.println(stat);
		}
	}

	@Test
	public void testGetMarketOrderIntCollectionOfIntegerIntIntInt() {
		
		EveCentralClient client = new EveCentralClient();
		
		final int typeID = 34;
		final List<Integer> regionIDs = new ArrayList<Integer>();
		final int hours = 24;
		final int minQuantity = 0;
		final int system =0;
		
		regionIDs.add(10000002);
		
		final List<EveCentralMarketOrder> orders = client.getMarketOrder(typeID, regionIDs, hours, minQuantity, system);
		
		for (EveCentralMarketOrder order : orders) {
			System.out.println(order);
		}
	}

}
