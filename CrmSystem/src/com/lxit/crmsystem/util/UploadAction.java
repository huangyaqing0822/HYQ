package com.lxit.crmsystem.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class UploadAction {
   
	public static String readExcelFile(File file) {
		StringBuffer data = new StringBuffer();
		InputStreamReader isr=null;
		BufferedReader br = null;
		try {
			isr=new InputStreamReader(new FileInputStream(file), "UTF-8");
			br = new BufferedReader(isr);
			String str = null;
			while (null != (str = br.readLine())) {
				System.out.println(str);
				data.append(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return data.toString();
	}
	
}
