package oop.srp.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager
{
	private Connection conn;
	private static DatabaseConnectionManager connectionInstance = null;
	
	private DatabaseConnectionManager(){
		// Left empty
	}
	
	// Singleton pattern to keep track of single database connection
	public static DatabaseConnectionManager getManagerInstance(){
		if(connectionInstance == null){
			connectionInstance = new DatabaseConnectionManager();
		}
		return connectionInstance;
	}
	
	public void connect() throws SQLException{
		conn = DriverManager.getConnection("Database/URL");
		System.out.println("Connecting to datbase....");
	}
	
	public Connection getConnectionObject(){
		return conn;
	}
	
	public void disconnect() throws SQLException{
		System.out.println("Disconnected from database");
		connectionInstance = null;
		conn.close();
	}
}
