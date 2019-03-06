package com.utile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBInteraction {
	
	static String url = "jdbc:mysql://localhost/marcher";
	static String utilisateur = "root";
	static String motDePasse = "";
	static Connection connection ;
	static Statement statement ;
	
	public static  void connect()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection( url, utilisateur, motDePasse);
		statement = connection.createStatement();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	public static void disconnect()
	{
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	public static int modifier(String sql)
	{
		int n = 0;
		try {
			n = statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			n= -1;
		}
		return n;
	}
	
	public static ResultSet select(String sql)
	{
		ResultSet resulta = null;
		try {
			resulta = statement.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resulta;
	}

}
