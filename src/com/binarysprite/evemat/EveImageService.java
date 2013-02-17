package com.binarysprite.evemat;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.wicket.util.file.File;

public class EveImageService {

	public static enum CharacterPortraitSize {
		PIXEL_30(30), PIXEL_32(32), PIXEL_64(64), PIXEL_128(128), PIXEL_200(200),
		PIXEL_256(256), PIXEL_512(512), PIXEL_1024(1024);

		private final int integer;

		/**
		 * @param integer
		 */
		private CharacterPortraitSize(int integer) {
			this.integer = integer;
		}

		/**
		 * @return the integer
		 */
		public int getInteger() {
			return integer;
		}
	}

	public static enum CorporationLogoSize {
		PIXEL_30(30), PIXEL_32(32), PIXEL_64(64), PIXEL_128(128), PIXEL_200(200),
		PIXEL_256(256);

		private final int integer;

		/**
		 * @param integer
		 */
		private CorporationLogoSize(int integer) {
			this.integer = integer;
		}

		/**
		 * @return the integer
		 */
		public int getInteger() {
			return integer;
		}
	}

	public static enum AllianceLogoSize {
		PIXEL_30(30), PIXEL_32(32), PIXEL_64(64), PIXEL_128(128);

		private final int integer;

		/**
		 * @param integer
		 */
		private AllianceLogoSize(int integer) {
			this.integer = integer;
		}

		/**
		 * @return the integer
		 */
		public int getInteger() {
			return integer;
		}
	}

	public static enum TypeIconSize {
		PIXEL_32(32), PIXEL_64(64);

		private final int integer;

		/**
		 * @param integer
		 */
		private TypeIconSize(int integer) {
			this.integer = integer;
		}

		/**
		 * @return the integer
		 */
		public int getInteger() {
			return integer;
		}
	}

	public static enum RenderSize {
		PIXEL_32(32), PIXEL_64(64), PIXEL_128(128), PIXEL_256(256), PIXEL_512(
				512);

		private final int integer;

		/**
		 * @param integer
		 */
		private RenderSize(int integer) {
			this.integer = integer;
		}

		/**
		 * @return the integer
		 */
		public int getInteger() {
			return integer;
		}
	}

	/**
	 * インスタンスの生成は制限されています。
	 */
	private EveImageService() {
		super();
	}

	/**
	 * 画像ファイルへのパスを取得します。
	 * キャッシュとしてファイルが存在すればそのパスを、存在しなければ EVE API を利用してキャッシュファイルを作成します。
	 * このメソッドは内部的に利用されるメソッドです。
	 * @param objects
	 * @return
	 * @throws IOException
	 */
	private static String getImagePath(String dir, long id, int size,
			String extension) throws IOException {

		Object[] objects = new Object[] { dir, id, size, extension };
		
		String staticPath = String.format(
				"./war/cache/%s/%d_%d.%s", objects);
		String dynamicPath = String.format(
				"/cache/%s/%d_%d.%s", objects);

		File iconFile = new File(staticPath);

		if (iconFile.exists() && iconFile.isFile()) {
			return dynamicPath;
		} else {
			iconFile.getParentFile().mkdirs();
			iconFile.createNewFile();
		}

		URL url = null;
		try {
			url = new URL(String.format(
					"http://image.eveonline.com/%s/%d_%d.%s", objects));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		BufferedInputStream inputStream = null;
		BufferedOutputStream outputStream = null;
		try {

			inputStream = new BufferedInputStream(url.openStream());
			outputStream = new BufferedOutputStream(new FileOutputStream(
					iconFile));

			int len;
			byte[] buf = new byte[1024];
			while ((len = inputStream.read(buf)) > 0) {
				outputStream.write(buf, 0, len);
			}

		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}

		return dynamicPath;
	}

	/**
	 * キャラクターのポートレート画像のパスを取得します。
	 * 
	 * @param characterID
	 *            キャラクターID
	 * @param size
	 *            ポートレート画像のサイズ
	 * @return
	 */
	public static String getCharacterPortrait(long characterID,
			CharacterPortraitSize size) {

		try {
			return getImagePath("Character", characterID, size.getInteger(),
					"jpg");
		} catch (IOException e) {
			e.printStackTrace();

			return null;
		}
	}

	/**
	 * コーポレーションのロゴ画像のパスを取得します。
	 * 
	 * @param corporationID
	 * @param size
	 * @return
	 */
	public static String getCorporationLogo(long corporationID,
			CorporationLogoSize size) {

		try {
			return getImagePath("Corporation", corporationID,
					size.getInteger(), "png");
		} catch (IOException e) {
			e.printStackTrace();

			return null;
		}
	}

	/**
	 * アライアンスのロゴ画像のパスを取得します。
	 * 
	 * @param allianceID
	 * @param size
	 * @return
	 */
	public static String getAllianceLogo(long allianceID,
			AllianceLogoSize size) {

		try {
			return getImagePath("Alliance", allianceID, size.getInteger(),
					"png");
		} catch (IOException e) {
			e.printStackTrace();

			return null;
		}
	}

	/**
	 * タイプアイコンのパスを取得します。
	 * 
	 * @param typeID
	 * @param size
	 * @return
	 */
	public static String getTypeIcon(long typeID, TypeIconSize size) {

		try {
			return getImagePath("InventoryType", typeID, size.getInteger(),
					"png");
		} catch (IOException e) {
			e.printStackTrace();

			return null;
		}
	}

	/**
	 * レンダー画像のパスを取得します。
	 * 
	 * @param typeID
	 * @param size
	 * @return
	 */
	public static String getRender(long typeID, RenderSize size) {

		try {
			return getImagePath("Render", typeID, size.getInteger(), "png");
		} catch (IOException e) {
			e.printStackTrace();

			return null;
		}
	}
}
