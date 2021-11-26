package com.anncode.amazoneviewer.db;

import java.sql.Connection;
import java.sql.DriverManager;
import static com.anncode.amazoneviewer.db.Database.*;

public interface IDBConnection {
	
	default Connection connectToDB() {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL+DB, USER, PASSWORD);
			
			if (connection != null) {
				System.out.println("La conexión se estableció a la DB =)");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return connection;
		
	}
}

