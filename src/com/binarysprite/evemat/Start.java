package com.binarysprite.evemat;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

import javax.imageio.ImageIO;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import org.seasar.doma.jdbc.tx.LocalTransaction;

import com.binarysprite.evemat.entity.AccountCharacterDao;
import com.binarysprite.evemat.entity.AccountCharacterDaoImpl;
import com.binarysprite.evemat.entity.BlueprintDao;
import com.binarysprite.evemat.entity.BlueprintDaoImpl;
import com.binarysprite.evemat.entity.IconDao;
import com.binarysprite.evemat.entity.IconDaoImpl;
import com.binarysprite.evemat.entity.MaterialDao;
import com.binarysprite.evemat.entity.MaterialDaoImpl;
import com.binarysprite.evemat.entity.ProductBlueprintDao;
import com.binarysprite.evemat.entity.ProductBlueprintDaoImpl;
import com.binarysprite.evemat.entity.ProductGroupDao;
import com.binarysprite.evemat.entity.ProductGroupDaoImpl;
import com.binarysprite.evemat.entity.ProductPriceDao;
import com.binarysprite.evemat.entity.ProductPriceDaoImpl;
import com.binarysprite.evemat.entity.RequirementDao;
import com.binarysprite.evemat.entity.RequirementDaoImpl;
import com.binarysprite.evemat.entity.TypeDao;
import com.binarysprite.evemat.entity.TypeDaoImpl;
import com.binarysprite.evemat.entity.UnitDao;
import com.binarysprite.evemat.entity.UnitDaoImpl;
import com.binarysprite.evemat.entity.WalletJournalDao;
import com.binarysprite.evemat.entity.WalletJournalDaoImpl;
import com.binarysprite.evemat.entity.WalletTransactionDao;
import com.binarysprite.evemat.entity.WalletTransactionDaoImpl;

/**
 * アプリケーションのスタートポイントクラスです。
 * @author Tabunoki
 *
 */
public class Start {
	
	private static final int SERVER_PORT = 8080;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {

			if (isExecuted()) {
				return;
			}
			
			initDB();

			stationTaskTray();
			startServer();
			startBrowser();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * ローカルサーバーを起動します。
	 * @throws Exception
	 */
	private static void startServer() throws Exception {

		Server server = new Server(SERVER_PORT);

		WebAppContext context = new WebAppContext();
		context.setContextPath("/");
		context.setWar("war");
		context.setParentLoaderPriority(true);
		server.setHandler(context);

		server.start();
	}

	/**
	 * ブラウザを起動します。
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	private static void startBrowser() throws IOException, URISyntaxException {

		Desktop desktop = Desktop.getDesktop();

		desktop.browse(new URI("http://localhost:" + SERVER_PORT));
	}

	/**
	 * デスクトップのシステムトレイにトレイアイコンを登録します。
	 * @throws IOException
	 * @throws AWTException
	 */
	private static void stationTaskTray() throws IOException, AWTException {
		
		if (SystemTray.isSupported() == false) {
			return;
		}

		Image image = ImageIO.read(Start.class.getClassLoader()
				.getResourceAsStream("META-INF/img/icon_tasktray.png"));

		final TrayIcon icon = new TrayIcon(image);
		final PopupMenu menu = new PopupMenu();
		final MenuItem updateData = new MenuItem("Update Data");
		final MenuItem startBrowserItem = new MenuItem("Start Browser");
		final MenuItem exitItem = new MenuItem("Exit");

		startBrowserItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					startBrowser();
				} catch (IOException exception) {
					exception.printStackTrace();
				} catch (URISyntaxException exception) {
					exception.printStackTrace();
				}
			}
		});
		exitItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		icon.setToolTip("EVE MAT Local Server");

		menu.add(updateData);
		menu.add(startBrowserItem);
		menu.add(exitItem);
		icon.setPopupMenu(menu);

		SystemTray.getSystemTray().add(icon);
		
		icon.displayMessage(
				"EVE MAT Local Server",
				"Start Server. (http://localhost:" + SERVER_PORT + ")",
				MessageType.INFO);
	}

	/**
	 * 多重起動をチェックします。
	 * アプリケーションが既に起動している場合、true を返し、それ以外は false を返します。
	 * @return
	 * @throws IOException
	 */
	private static boolean isExecuted() throws IOException {

		final FileOutputStream outStream = new FileOutputStream(Constants.APP_LOCK_FILE);
		final FileChannel channel = outStream.getChannel();
		final FileLock lock = channel.tryLock();
		
		if (lock == null) {
			return true;
		}

		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				if (lock != null && lock.isValid()) {
					try {
						lock.release();
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							channel.close();
							outStream.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		});

		return false;
	}
	
	/**
	 * DBファイルが存在しない場合、DBファイルを生成します。
	 * テーブルを作成し、スタティックデータ（マスタ）を追加します。
	 */
	private static void initDB() {
		
		if (Constants.APP_DB_FILE_WITH_EXTENSION.exists()) {
			return;
		} else {
			Constants.LOGGER.info("Database file is not found. Initialize database.");
		}
		
		
		LocalTransaction transaction = DB.getLocalTransaction();
		
		try {
			transaction.begin();
			
			{
				AccountCharacterDao dao = new AccountCharacterDaoImpl();
				dao.createTable();
			}
			{
				BlueprintDao dao = new BlueprintDaoImpl();
				dao.createTable();
			}
			{
				IconDao dao = new IconDaoImpl();
				dao.createTable();
			}
			{
				MaterialDao dao = new MaterialDaoImpl();
				dao.createTable();
			}
			{
				/*
				 * PRODUCT_GROUP は PRODUCT_BLUEPRINT から参照されるため
				 * PRODUCT_BLUEPRINT より先に CREATE しなければなりません。
				 */
				ProductGroupDao dao = new ProductGroupDaoImpl();
				dao.createTable();
			}
			{
				ProductBlueprintDao dao = new ProductBlueprintDaoImpl();
				dao.createTable();
			}
			{
				ProductPriceDao dao = new ProductPriceDaoImpl();
				dao.createTable();
			}
			{
				RequirementDao dao = new RequirementDaoImpl();
				dao.createTable();
			}
			{
				TypeDao dao = new TypeDaoImpl();
				dao.createTable();
			}
			{
				UnitDao dao = new UnitDaoImpl();
				dao.createTable();
			}
			{
				WalletJournalDao dao = new WalletJournalDaoImpl();
				dao.createTable();
			}
			{
				WalletTransactionDao dao = new WalletTransactionDaoImpl();
				dao.createTable();
			}
			
			transaction.commit();
			
		} catch (Exception e) {
			transaction.rollback();
			
			Constants.LOGGER.severe(e.getMessage());
			e.printStackTrace();
		}
	}
}
