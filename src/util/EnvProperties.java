package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EnvProperties {
	private static Properties config = new Properties();
	private static String arquivo = "env.properties";
	
	public static String getValue(String attribute) {
		try {
			config.load(new FileInputStream(arquivo));
			return config.getProperty(attribute);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
