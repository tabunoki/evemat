package com.binarysprite.evemat.page;

import java.util.List;

import org.junit.Test;

public class ProductPageTest {

	@Test
	public void testGetGroupDisplays() {
		
		final List<GroupDisplay> groupDisplays = ProductPage.getGroupDisplays();
		for (GroupDisplay groupDisplay : groupDisplays) {
			
			System.out.println("-" + groupDisplay);
			
			for (ProductDisplay productDisplay : groupDisplay.productDisplays) {
				
				System.out.println("  -" + productDisplay);
			}
			for (MaterialDisplay materialDisplay : groupDisplay.materialDisplays) {
				
				System.out.println("    -" + materialDisplay);
			}
		}
		
	}

}
