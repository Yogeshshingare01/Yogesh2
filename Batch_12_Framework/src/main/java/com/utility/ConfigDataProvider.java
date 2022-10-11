package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider() throws Exception {
		
		String path="C:\\Users\\Sagar\\eclipse-workspace\\Batch_12_Framework\\config\\Config.Properties";
		FileInputStream fis=new FileInputStream(path);
	   pro=new Properties();
		pro.load(fis);
		
	}
	public String get_BaseUrl_QA1() {
		return pro.getProperty("BaseUrl_QA");
	}

}
