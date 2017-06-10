package org.seleniumhq.selenium.login.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Locators {

	static Properties prop = new Properties();
	static FileInputStream fis = null;
	static {

		try (FileInputStream fis = new FileInputStream("Locators.properties")) {
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

	public static final String LOGIN_USERNME = getProperty("login.username");
	public static final String LOGIN_PASSWORD = getProperty("login.password");
	public static final String LOGIN_BUTTON = getProperty("login.loginButton");
	
	
}
