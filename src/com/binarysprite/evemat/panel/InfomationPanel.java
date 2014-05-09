/**
 * 
 */
package com.binarysprite.evemat.panel;

import org.apache.wicket.markup.html.basic.MultiLineLabel;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

/**
 * @author Tabunoki
 * 
 */
public class InfomationPanel extends Panel {

	/**
	 * 
	 * @author Tabunoki
	 * 
	 */
	public static enum Kind {

		/**
		 * 
		 */
		SUCCESS,

		/**
		 * 
		 */
		INFO,

		/**
		 * 
		 */
		WARNING;
	}

	/**
	 * 
	 */
	public static final String WICKET_ID_INFOMATION_PANEL = "infomationPanel";

	/**
	 * 
	 */
	private final IModel<String> messageModel = new Model<String>();

	/**
	 * 
	 */
	private final MultiLineLabel messsageLabel;

	/**
	 * 
	 * @param id
	 */
	public InfomationPanel(String id) {
		super(id);

		messsageLabel = new MultiLineLabel(WICKET_ID_INFOMATION_PANEL, messageModel);

		add(messsageLabel);

		/*
		 * Default hidden.
		 */
		this.setVisible(false);
	}

	/**
	 * 
	 * @param message
	 */
	public void setMessage(String message) {
		messageModel.setObject(message);
	}
}
