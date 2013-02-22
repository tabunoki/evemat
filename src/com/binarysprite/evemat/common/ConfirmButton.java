package com.binarysprite.evemat.common;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.form.Button;

/**
 * 押下時に確認を促すボタンコンポーネントです。
 * @author Tabunoki
 *
 */
public class ConfirmButton extends Button {
	
	private final String message;

	public ConfirmButton(String id, String message) {
		super(id);
		
		this.message = message;
	}

	@Override
	protected void onComponentTag(ComponentTag tag) {
		super.onComponentTag(tag);
		
        String confirm = " if (!confirm('" + message + "')) {return false;} ";
        tag.put("onclick", confirm);
	}

}
