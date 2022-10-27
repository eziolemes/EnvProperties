package main;

import util.EnvProperties;

public class Main {
	public static void main(String[] args) {
		System.out.println(EnvProperties.getValue("FTP_ADDRESS"));
		System.out.println(EnvProperties.getValue("FTP_USER"));
		System.out.println(EnvProperties.getValue("FTP_PASSWORD"));
		System.out.println(EnvProperties.getValue("DB_ADDRESS"));
		System.out.println(EnvProperties.getValue("DB_PORT"));
		System.out.println(EnvProperties.getValue("DB_NAME"));
		System.out.println(EnvProperties.getValue("DB_USER"));
		System.out.println(EnvProperties.getValue("DB_PASSWORD"));
	}
}
