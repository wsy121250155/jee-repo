package com.j2ee.ejbServer.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnect {
	private static String url="jdbc:mysql://127.0.0.1:3306/jee";
	private static String user="wsy";
	private static String password="123";
	private static Connection connection;
	private Dbconnect(){}
	public static void init(){
		try {
			connection=DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	public Dbconnect(String url, String user, String pw){
//		this.url=url;
//		this.user=user;
//		this.password=pw;
//	}
	public static Connection getConnection(){
		return connection;
	}
}
