package com.binarysprite.evemat.util.evecentral;

/**
 * EVE Central の API marketstat_xml のデータ管理クラスです。
 * @author Tabunoki
 *
 */
public class EveCentralMarketStat {
	
	/**
	 * Type ID です。
	 */
	private int typeID;
	
	/**
	 * 全オーダーの総数です。
	 */
	private long allVolume;
	
	/**
	 * 全オーダーの平均価格です
	 */
	private double allAvg;
	
	/**
	 * 全オーダーの最高価格です。
	 */
	private double allMax;
	
	/**
	 * 全オーダーの最低価格です。
	 */
	private double allMin;
	
	/**
	 * 全オーダーの価格の標準偏差です。
	 */
	private double allStdDev;
	
	/**
	 * 全オーダーの中間価格です。
	 */
	private double allMedian;
	
	/**
	 * 買いオーダーの総数です。
	 */
	private long buyVolume;
	
	/**
	 * 買いオーダーの平均価格です。
	 */
	private double buyAvg;
	
	/**
	 * 買いオーダーの最高価格です。
	 */
	private double buyMax;
	
	/**
	 * 買いオーダーの最低価格です。
	 */
	private double buyMin;
	
	/**
	 * 買いオーダーの価格の標準偏差です。
	 */
	private double buyStdDev;
	
	/**
	 * 買いオーダーの中間価格です。
	 */
	private double buyMedian;
	
	/**
	 * 売りオーダーの総数です。
	 */
	private long sellVolume;
	
	/**
	 * 売りオーダーの平均価格です
	 */
	private double sellAvg;
	
	/**
	 * 売りオーダーの最高価格です。
	 */
	private double sellMax;
	
	/**
	 * 売りオーダーの最低価格です。
	 */
	private double sellMin;
	
	/**
	 * 売りオーダーの価格の標準偏差です。
	 */
	private double sellStdDev;
	
	/**
	 * 売りオーダーの中間価格です。
	 */
	private double sellMedian;
	
	/**
	 * 
	 */
	public EveCentralMarketStat() {
		
	}
	
	/**
	 * @param typeID
	 * @param allVolume
	 * @param allAvg
	 * @param allMax
	 * @param allMin
	 * @param allStdDev
	 * @param allMedian
	 * @param buyVolume
	 * @param buyAvg
	 * @param buyMax
	 * @param buyMin
	 * @param buyStdDev
	 * @param buyMedian
	 * @param sellVolume
	 * @param sellAvg
	 * @param sellMax
	 * @param sellMin
	 * @param sellStdDev
	 * @param sellMedian
	 */
	public EveCentralMarketStat(int typeID, long allVolume, double allAvg,
			double allMax, double allMin, double allStdDev, double allMedian,
			long buyVolume, double buyAvg, double buyMax, double buyMin,
			double buyStdDev, double buyMedian, long sellVolume,
			double sellAvg, double sellMax, double sellMin, double sellStdDev,
			double sellMedian) {
		super();
		this.typeID = typeID;
		this.allVolume = allVolume;
		this.allAvg = allAvg;
		this.allMax = allMax;
		this.allMin = allMin;
		this.allStdDev = allStdDev;
		this.allMedian = allMedian;
		this.buyVolume = buyVolume;
		this.buyAvg = buyAvg;
		this.buyMax = buyMax;
		this.buyMin = buyMin;
		this.buyStdDev = buyStdDev;
		this.buyMedian = buyMedian;
		this.sellVolume = sellVolume;
		this.sellAvg = sellAvg;
		this.sellMax = sellMax;
		this.sellMin = sellMin;
		this.sellStdDev = sellStdDev;
		this.sellMedian = sellMedian;
	}

	@Override
	public String toString() {
		return "EveCentralMarketStat [typeID=" + typeID + ", allVolume="
				+ allVolume + ", allAvg=" + allAvg + ", allMax=" + allMax
				+ ", allMin=" + allMin + ", allStdDev=" + allStdDev
				+ ", allMedian=" + allMedian + ", buyVolume=" + buyVolume
				+ ", buyAvg=" + buyAvg + ", buyMax=" + buyMax + ", buyMin="
				+ buyMin + ", buyStdDev=" + buyStdDev + ", buyMedian="
				+ buyMedian + ", sellVolume=" + sellVolume + ", sellAvg="
				+ sellAvg + ", sellMax=" + sellMax + ", sellMin=" + sellMin
				+ ", sellStdDev=" + sellStdDev + ", sellMedian=" + sellMedian
				+ "]";
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
	 * @return the allVolume
	 */
	public long getAllVolume() {
		return allVolume;
	}

	/**
	 * @param allVolume the allVolume to set
	 */
	public void setAllVolume(long allVolume) {
		this.allVolume = allVolume;
	}

	/**
	 * @return the allAvg
	 */
	public double getAllAvg() {
		return allAvg;
	}

	/**
	 * @param allAvg the allAvg to set
	 */
	public void setAllAvg(double allAvg) {
		this.allAvg = allAvg;
	}

	/**
	 * @return the allMax
	 */
	public double getAllMax() {
		return allMax;
	}

	/**
	 * @param allMax the allMax to set
	 */
	public void setAllMax(double allMax) {
		this.allMax = allMax;
	}

	/**
	 * @return the allMin
	 */
	public double getAllMin() {
		return allMin;
	}

	/**
	 * @param allMin the allMin to set
	 */
	public void setAllMin(double allMin) {
		this.allMin = allMin;
	}

	/**
	 * @return the allStdDev
	 */
	public double getAllStdDev() {
		return allStdDev;
	}

	/**
	 * @param allStdDev the allStdDev to set
	 */
	public void setAllStdDev(double allStdDev) {
		this.allStdDev = allStdDev;
	}

	/**
	 * @return the allMedian
	 */
	public double getAllMedian() {
		return allMedian;
	}

	/**
	 * @param allMedian the allMedian to set
	 */
	public void setAllMedian(double allMedian) {
		this.allMedian = allMedian;
	}

	/**
	 * @return the buyVolume
	 */
	public long getBuyVolume() {
		return buyVolume;
	}

	/**
	 * @param buyVolume the buyVolume to set
	 */
	public void setBuyVolume(long buyVolume) {
		this.buyVolume = buyVolume;
	}

	/**
	 * @return the buyAvg
	 */
	public double getBuyAvg() {
		return buyAvg;
	}

	/**
	 * @param buyAvg the buyAvg to set
	 */
	public void setBuyAvg(double buyAvg) {
		this.buyAvg = buyAvg;
	}

	/**
	 * @return the buyMax
	 */
	public double getBuyMax() {
		return buyMax;
	}

	/**
	 * @param buyMax the buyMax to set
	 */
	public void setBuyMax(double buyMax) {
		this.buyMax = buyMax;
	}

	/**
	 * @return the buyMin
	 */
	public double getBuyMin() {
		return buyMin;
	}

	/**
	 * @param buyMin the buyMin to set
	 */
	public void setBuyMin(double buyMin) {
		this.buyMin = buyMin;
	}

	/**
	 * @return the buyStdDev
	 */
	public double getBuyStdDev() {
		return buyStdDev;
	}

	/**
	 * @param buyStdDev the buyStdDev to set
	 */
	public void setBuyStdDev(double buyStdDev) {
		this.buyStdDev = buyStdDev;
	}

	/**
	 * @return the buyMedian
	 */
	public double getBuyMedian() {
		return buyMedian;
	}

	/**
	 * @param buyMedian the buyMedian to set
	 */
	public void setBuyMedian(double buyMedian) {
		this.buyMedian = buyMedian;
	}

	/**
	 * @return the sellVolume
	 */
	public long getSellVolume() {
		return sellVolume;
	}

	/**
	 * @param sellVolume the sellVolume to set
	 */
	public void setSellVolume(long sellVolume) {
		this.sellVolume = sellVolume;
	}

	/**
	 * @return the sellAvg
	 */
	public double getSellAvg() {
		return sellAvg;
	}

	/**
	 * @param sellAvg the sellAvg to set
	 */
	public void setSellAvg(double sellAvg) {
		this.sellAvg = sellAvg;
	}

	/**
	 * @return the sellMax
	 */
	public double getSellMax() {
		return sellMax;
	}

	/**
	 * @param sellMax the sellMax to set
	 */
	public void setSellMax(double sellMax) {
		this.sellMax = sellMax;
	}

	/**
	 * @return the sellMin
	 */
	public double getSellMin() {
		return sellMin;
	}

	/**
	 * @param sellMin the sellMin to set
	 */
	public void setSellMin(double sellMin) {
		this.sellMin = sellMin;
	}

	/**
	 * @return the sellStdDev
	 */
	public double getSellStdDev() {
		return sellStdDev;
	}

	/**
	 * @param sellStdDev the sellStdDev to set
	 */
	public void setSellStdDev(double sellStdDev) {
		this.sellStdDev = sellStdDev;
	}

	/**
	 * @return the sellMedian
	 */
	public double getSellMedian() {
		return sellMedian;
	}

	/**
	 * @param sellMedian the sellMedian to set
	 */
	public void setSellMedian(double sellMedian) {
		this.sellMedian = sellMedian;
	}
	
	
}
