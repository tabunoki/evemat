package com.binarysprite.evemat;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

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
		fail("まだ実装されていません");
	}

}
