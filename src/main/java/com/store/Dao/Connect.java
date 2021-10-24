package com.store.Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {

	static String db="store";
	static String login="root";
	static String pass="gtfo";
	static String url="jdbc:mysql://localhost:3306/"+db;
	
	Connection conn=null;
	
	public Connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conn=DriverManager.getConnection(url,login,pass);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public Connection getConnection() {
		return this.conn;
	}
	
	public void disconnect () {
		conn=null;
	}
}
