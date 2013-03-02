package com.binarysprite.evemat.update;

import com.beimin.eveapi.core.ApiException;

public interface Updater {

	/**
	 * 同期処理を実装して下さい。
	 * @throws ApiException 
	 */
	public abstract void update() throws ApiException;
}
