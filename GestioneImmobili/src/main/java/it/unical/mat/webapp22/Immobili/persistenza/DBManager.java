package it.unical.mat.webapp22.Immobili.persistenza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBManager {
	private static DBManager instance = null;
	
	public static DBManager getInstance() {
		if (instance == null) {
			instance = new DBManager();
		}
		return instance;
	}
	
	private DBManager() {
	}
	
	Connection conn = null;
	
	public Connection getConnection() {
		if (conn == null) {
			try {
				conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/", "postgres", "Internazionale99");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	
}