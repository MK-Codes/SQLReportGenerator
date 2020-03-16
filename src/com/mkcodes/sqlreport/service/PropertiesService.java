package com.mkcodes.sqlreport.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesService {
	private Properties prop;
	private String propertiesFile;
	private String propertiesValue;

	public PropertiesService() {

	}

	public PropertiesService(String propertiesFile) {
		this.propertiesFile = propertiesFile;
	}

	public void setPropertiesFile(String propertiesFile) {
		this.propertiesFile = propertiesFile;
	}

	public String getPropertiesFile() {
		return propertiesFile;
	}

	public String getProperty(String key) {
		prop = new Properties();
		propertiesValue = "";
		try (InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream(propertiesFile)) {
			prop.load(input);
			propertiesValue = prop.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return propertiesValue;
	}
}
