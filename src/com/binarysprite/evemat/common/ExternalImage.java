package com.binarysprite.evemat.common;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.WebComponent;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.IModel;

public class ExternalImage extends WebComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8897513982588861200L;

	public ExternalImage(String id, final String url) {
		
		this(id, new AbstractReadOnlyModel<String>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 8407028441710235045L;

			@Override
			public String getObject() {
				return url;
			}
		});
	}

	public ExternalImage(String id, IModel<String> model) {
		super(id, model);
	}

	protected void onComponentTag(ComponentTag tag) {
		super.onComponentTag(tag);
		checkComponentTag(tag, "img");
		tag.put("src", getDefaultModelObjectAsString());
	}

}
