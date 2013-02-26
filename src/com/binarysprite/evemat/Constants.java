package com.binarysprite.evemat;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.apache.commons.lang3.time.FastDateFormat;

/**
 * アプリケーションの定数を管理するクラスです。
 * @author Tabunoki
 *
 */
public class Constants {
	
	/**
	 * 基本ロガーです。
	 */
	public static final Logger LOGGER = Logger.getLogger("EVE-MAT");
	
	/**
	 * 価格表示用のフォーマットです。
	 */
	public static final DecimalFormat PRICE_FORMAT = new DecimalFormat("###,##0.00");
	
	/**
	 * 個数表示用のフォーマットです。
	 */
	public static final DecimalFormat QUANTITY_FORMAT = new DecimalFormat("###,##0");
	
	/**
	 * 割合表示用のフォーマットです。
	 */
	public static final DecimalFormat PERCENT_FORMAT = new DecimalFormat("###%");
	
	/**
	 * セキュリティレベル表示用のフォーマットです。
	 */
	public static final DecimalFormat SECURITY_FORMAT = new DecimalFormat("0.0");
	
	/**
	 * EVEのゲーム内時間です。
	 */
	public static final TimeZone EVE_TIME_ZONE = new SimpleTimeZone(0, "UTC");
	
	/**
	 * 標準的な日付のパターンです。
	 */
	public static final String DATE_PATTERN = "yyyy-MM-dd";
	
	/**
	 * 標準的な日付のフォーマットです。
	 * このフォーマットは EVE 時間のタイムゾーンであることに注意して下さい。
	 */
	public static final FastDateFormat DATE_FORMAT =
			FastDateFormat.getInstance(DATE_PATTERN, EVE_TIME_ZONE);
	
	/**
	 * 標準的な時間のパターンです。
	 */
	public static final String TIME_PATTERN = "HH:mm:ss";
	
	/**
	 * 標準的な時間のフォーマットです。
	 * このフォーマットは EVE 時間のタイムゾーンであることに注意して下さい。
	 */
	public static final FastDateFormat TIME_FORMAT =
			FastDateFormat.getInstance(TIME_PATTERN, EVE_TIME_ZONE);
	
	/**
	 * 標準的な日付と時間のパターンです。
	 */
	public static final String DATE_TIME_PATTERN = DATE_PATTERN + " " + TIME_PATTERN;
	
	/**
	 * 標準的な日付と時間のフォーマットです。
	 * このフォーマットは EVE 時間のタイムゾーンであることに注意して下さい。
	 */
	public static final FastDateFormat DATE_TIME_FORMAT =
			FastDateFormat.getInstance(DATE_TIME_PATTERN, EVE_TIME_ZONE);
	
	/**
	 * アプリケーションのユーザーデータを管理するディレクトリです。
	 */
	public static final File APP_DATA_DIR = new File(System.getProperty("user.home"), ".evemat");
	
	/**
	 * アプリケーションのデータベースファイルです。
	 */
	public static final File APP_DB_FILE = new File(APP_DATA_DIR, "evemat");
	
	/**
	 * アプリケーションのデータベースファイルの拡張子です。
	 */
	public static final File APP_DB_FILE_WITH_EXTENSION = new File(APP_DB_FILE.getAbsolutePath() + ".h2.db");
	
	/**
	 * アプリケーションのロックファイルです。
	 */
	public static final File APP_LOCK_FILE = new File(APP_DATA_DIR, "lock");
	
	/**
	 * イニシャライザーです。
	 * 設定値をログに出力します。
	 */
	static {
		
		try {
			LogManager.getLogManager().readConfiguration(Constants.class.getClassLoader().getResourceAsStream(
					"META-INF/properties/logging.properties"));
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		LOGGER.info("App Data Directory: " + APP_DATA_DIR.getAbsolutePath());
	}

	/**
	 * インスタンスの生成は制御されています。
	 */
	private Constants() {
		super();
	}

}
