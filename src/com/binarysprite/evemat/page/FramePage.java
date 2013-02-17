package com.binarysprite.evemat.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

import com.beimin.eveapi.core.ApiException;
import com.beimin.eveapi.server.ServerStatusParser;
import com.beimin.eveapi.server.ServerStatusResponse;

@SuppressWarnings("serial")
public abstract class FramePage extends WebPage {

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
	}

}
