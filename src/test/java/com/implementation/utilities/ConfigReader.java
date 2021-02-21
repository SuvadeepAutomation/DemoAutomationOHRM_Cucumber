package com.implementation.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;

	public Properties int_prop() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("./src/test/java/com/implementation/Config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

		}
		return prop;

	}

}
