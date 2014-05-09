/**
 * 
 */
package com.binarysprite.evemat.panel;

import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.markup.html.panel.Panel;

/**
 * @author Tabunoki
 * 
 */
public class AlertPanel extends Panel {

	/**
	 * 
	 */
	public static final String WICKET_ID_ALERT_FEEDBACK_PANEL = "alertFeedbackPanel";

	/**
	 * 
	 * @param id
	 */
	public AlertPanel(String id) {
		super(id);

		final FeedbackPanel feedbackPanel = new FeedbackPanel(WICKET_ID_ALERT_FEEDBACK_PANEL);

		add(feedbackPanel);
		
		/*
		 * Default hidden.
		 */
		this.setVisible(false);
	}
}
