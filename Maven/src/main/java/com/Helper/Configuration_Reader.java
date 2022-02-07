package com.Helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;
	
	public Configuration_Reader() {
		
	}

	public String getUrl() throws Throwable {

		File f = new File(
				"C:\\Users\\Kamali\\eclipse-workspace\\Maven\\src\\main\\java\\com\\properties\\Configuration.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

		String Url = p.getProperty("Url");

		return Url;
	}

	public String getEmail() throws Throwable {

		File f = new File(
				"C:\\Users\\Kamali\\eclipse-workspace\\Maven\\src\\main\\java\\com\\properties\\Configuration.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

		String Email = p.getProperty("Email");

		return Email;

	}

	public String getPassword() throws Throwable {

		File f = new File(
				"C:\\Users\\Kamali\\eclipse-workspace\\Maven\\src\\main\\java\\com\\properties\\Configuration.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

		String Password = p.getProperty("Password");

		return Password;

	}

}
