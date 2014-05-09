package com.binarysprite.evemat;

import org.apache.wicket.Page;
import org.apache.wicket.RuntimeConfigurationType;
import org.apache.wicket.protocol.http.WebApplication;

import com.binarysprite.evemat.page.blueprint.BlueprintPage;
import com.binarysprite.evemat.page.character.CharacterAddPage;
import com.binarysprite.evemat.page.character.CharacterPage;
import com.binarysprite.evemat.page.product.ProductPage;
import com.binarysprite.evemat.page.transaction.TransactionPage;

/**
 * Wicket によるアプリケーションクラスです。
 * @author Tabunoki
 *
 */
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
		mountPage("/character/new", CharacterAddPage.class);
		mountPage("/blueprint", BlueprintPage.class);
		mountPage("/product", ProductPage.class);
		mountPage("/transaction", TransactionPage.class);
	}

	@Override
	public Class<? extends Page> getHomePage() {
		return CharacterPage.class;
	}

}
