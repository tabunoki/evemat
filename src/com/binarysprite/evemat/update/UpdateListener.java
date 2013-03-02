package com.binarysprite.evemat.update;

/**
 * 同期処理のイベントを通知するリスナーです。
 * @author Tabunoki
 *
 */
public interface UpdateListener {

	/**
	 * 同期処理が開始することを通知します。
	 * @param event イベントオブジェクト
	 */
	public abstract void updateWillStart(UpdateEvent event);
	
	/**
	 * 同期処理が完了したことを通知します。
	 * @param event イベントオブジェクト
	 */
	public abstract void updatePerformed(UpdateEvent event);
}
