package com.binarysprite.evemat.entity;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.seasar.doma.jdbc.tx.LocalTransaction;

import com.binarysprite.evemat.DB;

public class ProductPriceDaoTest {

	@Test
	public void testSelectManufactureTable() {
		
		ProductPriceDao dao = new ProductPriceDaoImpl();
		
		LocalTransaction transaction = DB.getLocalTransaction();
		try {
			transaction.begin();
			final List<Map<String, Object>> maps = dao.selectManufactureTable();
			
			for (Map<String, Object> productOrMaterial : maps) {
				
				System.out.println(productOrMaterial);
			}
			
		} finally {
			transaction.rollback();
		}
	}

}
