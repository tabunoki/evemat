package com.binarysprite.evemat.sync;

import com.beimin.eveapi.core.ApiException;

public interface EveSynchronizer {

	/**
	 * 同期処理を実装して下さい。
	 * @throws ApiException 
	 */
	public abstract void synchronize() throws ApiException;
}
