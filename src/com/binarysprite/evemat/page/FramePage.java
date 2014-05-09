package com.binarysprite.evemat.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

import com.beimin.eveapi.core.ApiException;
import com.beimin.eveapi.server.ServerStatusParser;
import com.beimin.eveapi.server.ServerStatusResponse;
import com.binarysprite.evemat.panel.AlertPanel;
import com.binarysprite.evemat.panel.InfomationPanel;

@SuppressWarnings("serial")
public abstract class FramePage extends WebPage {

	/**
	 * 
	 */
	public static final String WICKET_ID_PAGE_TITLE_LABEL = "pageTitleLabel";

	/**
	 * 
	 */
	public static final String WICKET_ID_ALERT_PANEL = "alertPanel";

	/**
	 * 
	 */
	public static final String WICKET_ID_INFOMATION_PANEL = "infomationPanel";

	/**
	 * 
	 */
	protected final AlertPanel alertPanel = new AlertPanel(WICKET_ID_ALERT_PANEL);

	/**
	 * 
	 */
	protected final InfomationPanel infomationPanel = new InfomationPanel(WICKET_ID_INFOMATION_PANEL);

	/**
	 * フレームページのコンストラクタです。
	 */
	public FramePage() {
		super();

		/*
		 * 
		 */
		ServerStatusResponse response = null;
		try {
			response = ServerStatusParser.getInstance().getServerStatus();
		} catch (ApiException e) {
			e.printStackTrace();
		}

		/*
		 * 
		 */
		final Label serverOpenLabel = new Label("serverOpen", response.isServerOpen() ? "Open" : "Close");
		final Label onlinePlayersLabel = new Label("onlinePlayers", Integer.toString(response.getOnlinePlayers()));

		/*
		 * 
		 */
		this.add(serverOpenLabel);
		this.add(onlinePlayersLabel);

		this.add(alertPanel);
		this.add(infomationPanel);
	}

}
