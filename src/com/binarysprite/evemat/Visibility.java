package com.binarysprite.evemat;

import org.apache.wicket.Page;
import org.apache.wicket.RuntimeConfigurationType;
import org.apache.wicket.protocol.http.WebApplication;

import com.binarysprite.evemat.page.BlueprintPage;
import com.binarysprite.evemat.page.CharacterPage;
import com.binarysprite.evemat.page.ProductPage;
import com.binarysprite.evemat.page.TransactionPage;

public class Visibility extends WebApplication {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.wicket.protocol.http.WebApplication#getConfigurationType()
	 */
	@Override
	public RuntimeConfigurationType getConfigurationType() {
		return RuntimeConfigurationType.DEVELOPMENT;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.wicket.protocol.http.WebApplication#init()
	 */
	@Override
	protected void init() {
		super.init();

		getRequestCycleSettings().setResponseRequestEncoding("UTF-8");
		getMarkupSettings().setDefaultMarkupEncoding("UTF-8");
		
		mountPage("/character", CharacterPage.class);
		mountPage("/blueprint", BlueprintPage.class);
		mountPage("/product", ProductPage.class);
		mountPage("/transaction", TransactionPage.class);
	}

	@Override
	public Class<? extends Page> getHomePage() {
		return CharacterPage.class;
	}

}
