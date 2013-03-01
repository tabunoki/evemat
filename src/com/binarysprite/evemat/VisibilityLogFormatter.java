package com.binarysprite.evemat;

import java.text.Format;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

import org.apache.commons.lang3.time.FastDateFormat;

/**
 * アプリケーションのログフォーマッターです。
 * 以下の様な出力フォーマットです。
 * 
 * <pre>
 * <code>
 * 2013/02/24 20:47:34.310 +0900 EVE-MAT com.binarysprite.evemat.Start initDB [INFO]
 * Database file is already exists.
 * </code>
 * </pre>
 * 
 * @author Tabunoki
 *
 */
public class VisibilityLogFormatter extends Formatter {
	
	Format logDateTimeFormat = FastDateFormat.getInstance("yyyy/MM/dd HH:mm:ss.SSS Z");
	

	@Override
	public String format(LogRecord record) {
		
		final StringBuffer buffer = new StringBuffer();
		
		buffer.append(logDateTimeFormat.format(record.getMillis()));
		buffer.append(" ").append(record.getLoggerName());
		buffer.append(" ").append(record.getSourceClassName());
		buffer.append(" ").append(record.getSourceMethodName());
		buffer.append(" [").append(record.getLevel().toString()).append("]");
		buffer.append("\n");
		buffer.append(record.getMessage());
		buffer.append("\n");
		
		
		return buffer.toString();
	}

}
