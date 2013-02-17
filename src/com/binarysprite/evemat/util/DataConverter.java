package com.binarysprite.evemat.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataConverter {
	
	private static File SRC = new File("W:/pleiades/ddl");
	
	private static File DST = new File("res");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (File srcFile : SRC.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				if (pathname.getAbsolutePath().endsWith(".csv")) {
					return true;
				} else {
					return false;
				}
			}
		})) {
			convertFile(srcFile);
		}
		
	}
	
	static void convertFile(File srcFile) {
		
		File dstFile = new File(DST, srcFile.getName());
		
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try {
			reader = new BufferedReader(new FileReader(srcFile));
			writer = new BufferedWriter(new FileWriter(dstFile));
			
			System.out.println("R: " + srcFile.getAbsolutePath());
			System.out.println("W: " + dstFile.getAbsolutePath());
			
			String line;
			while ((line = reader.readLine()) != null) {
				
				line = line.replaceAll("\"", "\"\"");
				line = line.replaceAll("\t", "\",\"");
				line = line.replaceAll("^", "\"");
				line = line.replaceAll("$", "\"");
				line = line.replaceAll("\"NULL\"", "");
				
				writer.write(line);
				writer.newLine();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
