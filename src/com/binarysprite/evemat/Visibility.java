package com.binarysprite.evemat;

import org.apache.wicket.Page;
import org.apache.wicket.RuntimeConfigurationType;
import org.apache.wicket.guice.GuiceComponentInjector;
import org.apache.wicket.protocol.http.WebApplication;

import com.binarysprite.evemat.page.blueprint.BlueprintAddPage;
import com.binarysprite.evemat.page.blueprint.BlueprintPage;
import com.binarysprite.evemat.page.blueprint.GroupAddPage;
import com.binarysprite.evemat.page.character.CharacterAddPage;
import com.binarysprite.evemat.page.character.CharacterPage;
import com.binarysprite.evemat.page.product.ProductPage;
import com.binarysprite.evemat.page.transaction.TransactionPage;

/**
 * Wicket によるアプリケーションクラスです。
 * 
 * @author Tabunoki
 * 
 */
public class Visibility extends WebApplication {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RuntimeConfigurationType getConfigurationType() {
		return RuntimeConfigurationType.DEVELOPMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void init() {
		super.init();

		getRequestCycleSettings().setResponseRequestEncoding("UTF-8");
		getMarkupSettings().setDefaultMarkupEncoding("UTF-8");

		mountPage("/character", CharacterPage.class);
		mountPage("/character/new", CharacterAddPage.class);
		mountPage("/blueprint", BlueprintPage.class);
		mountPage("/blueprint/new", BlueprintAddPage.class);
		mountPage("/blueprint/group/new", GroupAddPage.class);
		mountPage("/product", ProductPage.class);
		mountPage("/transaction", TransactionPage.class);

		getComponentInstantiationListeners().add(new GuiceComponentInjector(this));
		
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Class<? extends Page> getHomePage() {
		return CharacterPage.class;
	}

}
