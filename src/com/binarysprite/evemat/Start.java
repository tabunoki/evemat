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
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

import javax.imageio.ImageIO;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

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

		final FileOutputStream outStream = new FileOutputStream(new File(
				"./lock"));
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
}
