package com.binarysprite.evemat.page.transaction.data;

import java.io.Serializable;

import com.binarysprite.evemat.entity.WalletTransaction;

/**
 * 取引情報のモデルオブジェクトです。 WalletTransaction クラスをシリアライズするためのサブクラスです。 モデルオブジェクトは
 * Seirializable である必要がありますが、 WalletTransaction は Doma が管理し生成するクラスのため
 * Serializable を実装できないためです。
 * 
 * @author Tabunoki
 * 
 */
public class WalletTransactionModelObject extends WalletTransaction implements Serializable {

	/**
	 * 
	 */
	public WalletTransactionModelObject(WalletTransaction walletTransaction) {
		
		this.setAccountKey(walletTransaction.getAccountKey());
		this.setCharacterId(walletTransaction.getCharacterId());
		this.setClientId(walletTransaction.getClientId());
		this.setClientName(walletTransaction.getClientName());
		this.setJournalTransactionId(walletTransaction.getJournalTransactionId());
		this.setPrice(walletTransaction.getPrice());
		this.setQuantity(walletTransaction.getQuantity());
		this.setStationId(walletTransaction.getStationId());
		this.setStationName(walletTransaction.getStationName());
		this.setTransactionDateTime(walletTransaction.getTransactionDateTime());
		this.setTransactionFor(walletTransaction.getTransactionFor());
		this.setTransactionId(walletTransaction.getJournalTransactionId());
		this.setTransactionType(walletTransaction.getTransactionType());
		this.setTypeId(walletTransaction.getTypeId());
		this.setTypeName(walletTransaction.getTypeName());
	}

}