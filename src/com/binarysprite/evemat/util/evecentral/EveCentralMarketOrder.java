package com.binarysprite.evemat.util.evecentral;

import java.util.Date;

/**
 * EVE Central のマーケットオーダークラスです。
 * @author Tabunoki
 *
 */
public class EveCentralMarketOrder {
	
	/**
	 * Type ID です。
	 */
	private int typeID;
	
	/**
	 * Type 名です。
	 */
	private String typeName;
	
	/**
	 * フィルタリングに使用される情報の作成時間範囲です。
	 */
	private int hours;
	
	/**
	 * フィルタリングに使用される最小取引数です。
	 */
	private int minQuantity;
	
	/**
	 * 買いオーダーの場合 true、それ以外の場合 false です。
	 */
	private boolean bid;
	
	/**
	 * オーダー ID です。
	 */
	private long orderID;
	
	/**
	 * リージョン ID です。
	 */
	private int regionID;
	
	/**
	 * ステーション ID です。
	 */
	private int stationID;
	
	/**
	 * ステーション名です。
	 */
	private String stationName;
	
	/**
	 * システムのセキュリティレベルです。
	 */
	private double security;
	
	/**
	 * 取引可能範囲です。
	 * For sell orders, this is always 32767.
	 * For buy orders, allowed values are: -1 = station, 0 = solar system, 5/10/20/40 Jumps, 32767 = region.
	 */
	private int range;
	
	/**
	 * 取引価格です。
	 */
	private double price;
	
	/**
	 * オーダーの残数です。
	 */
	private long volumeRemain;
	
	/**
	 * 最小取引数です。
	 */
	private long minVolume;
	
	/**
	 * オーダーの期限です。
	 */
	private Date expires;
	
	/**
	 * 情報の作成日時です。
	 */
	private Date reportedTime;

	/**
	 * 
	 */
	public EveCentralMarketOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param typeID
	 * @param typeName
	 * @param hours
	 * @param minQuantity
	 * @param bid
	 * @param orderID
	 * @param regionID
	 * @param stationID
	 * @param stationName
	 * @param security
	 * @param range
	 * @param price
	 * @param volumeRemain
	 * @param minVolume
	 * @param expires
	 * @param reportedTime
	 */
	public EveCentralMarketOrder(int typeID, String typeName, int hours,
			int minQuantity, boolean bid, long orderID, int regionID,
			int stationID, String stationName, double security, int range,
			double price, long volumeRemain, long minVolume, Date expires,
			Date reportedTime) {
		super();
		this.typeID = typeID;
		this.typeName = typeName;
		this.hours = hours;
		this.minQuantity = minQuantity;
		this.bid = bid;
		this.orderID = orderID;
		this.regionID = regionID;
		this.stationID = stationID;
		this.stationName = stationName;
		this.security = security;
		this.range = range;
		this.price = price;
		this.volumeRemain = volumeRemain;
		this.minVolume = minVolume;
		this.expires = expires;
		this.reportedTime = reportedTime;
	}

	/**
	 * @return the typeID
	 */
	public int getTypeID() {
		return typeID;
	}

	/**
	 * @param typeID the typeID to set
	 */
	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}

	/**
	 * @return the typeName
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * @param typeName the typeName to set
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	/**
	 * @return the hours
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * @param hours the hours to set
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}

	/**
	 * @return the minQuantity
	 */
	public int getMinQuantity() {
		return minQuantity;
	}

	/**
	 * @param minQuantity the minQuantity to set
	 */
	public void setMinQuantity(int minQuantity) {
		this.minQuantity = minQuantity;
	}

	/**
	 * @return the bid
	 */
	public boolean isBid() {
		return bid;
	}

	/**
	 * @param bid the bid to set
	 */
	public void setBid(boolean bid) {
		this.bid = bid;
	}

	/**
	 * @return the orderID
	 */
	public long getOrderID() {
		return orderID;
	}

	/**
	 * @param orderID the orderID to set
	 */
	public void setOrderID(long orderID) {
		this.orderID = orderID;
	}

	/**
	 * @return the regionID
	 */
	public int getRegionID() {
		return regionID;
	}

	/**
	 * @param regionID the regionID to set
	 */
	public void setRegionID(int regionID) {
		this.regionID = regionID;
	}

	/**
	 * @return the stationID
	 */
	public int getStationID() {
		return stationID;
	}

	/**
	 * @param stationID the stationID to set
	 */
	public void setStationID(int stationID) {
		this.stationID = stationID;
	}

	/**
	 * @return the stationName
	 */
	public String getStationName() {
		return stationName;
	}

	/**
	 * @param stationName the stationName to set
	 */
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	/**
	 * @return the security
	 */
	public double getSecurity() {
		return security;
	}

	/**
	 * @param security the security to set
	 */
	public void setSecurity(double security) {
		this.security = security;
	}

	/**
	 * @return the range
	 */
	public int getRange() {
		return range;
	}

	/**
	 * @param range the range to set
	 */
	public void setRange(int range) {
		this.range = range;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the volumeRemain
	 */
	public long getVolumeRemain() {
		return volumeRemain;
	}

	/**
	 * @param volumeRemain the volumeRemain to set
	 */
	public void setVolumeRemain(long volumeRemain) {
		this.volumeRemain = volumeRemain;
	}

	/**
	 * @return the minVolume
	 */
	public long getMinVolume() {
		return minVolume;
	}

	/**
	 * @param minVolume the minVolume to set
	 */
	public void setMinVolume(long minVolume) {
		this.minVolume = minVolume;
	}

	/**
	 * @return the expires
	 */
	public Date getExpires() {
		return expires;
	}

	/**
	 * @param expires the expires to set
	 */
	public void setExpires(Date expires) {
		this.expires = expires;
	}

	/**
	 * @return the reportedTime
	 */
	public Date getReportedTime() {
		return reportedTime;
	}

	/**
	 * @param reportedTime the reportedTime to set
	 */
	public void setReportedTime(Date reportedTime) {
		this.reportedTime = reportedTime;
	}

}
