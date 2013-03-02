package com.binarysprite.evemat.update;

import java.util.EventObject;

/**
 * 同期処理のイベントオブジェクトです。
 * @author Tabunoki
 *
 */
public class UpdateEvent extends EventObject {
	
	public static enum Status {
		
		success,
		failure;
	}

	/**
	 * 同期処理のイベントメッセージです。
	 */
	private final String message;

	/**
	 * 
	 * @param source
	 * @param message
	 */
	public UpdateEvent(Object source, String message) {
		super(source);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
