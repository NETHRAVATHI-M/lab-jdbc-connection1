package controller;

import java.io.IOException;
import java.sql.SQLException;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws ClassNotFoundException, IOException, SQLException {
		
	// Fill your code
		
		
		if(ConnectionManager.getConnection()!=null) {
			System.out.println("Connection established");
		}
		else {
			System.out.println("connection not established");
		}
		
	}
}
