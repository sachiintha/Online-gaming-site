package com.Payments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PaymentsDBUtil {
	
	public static List<Payments>validate(String accountNo,String userName){

	ArrayList<Payments> cus = new ArrayList<>();
	
	//create database connection
	String url = "jdbc:mysql://localhost:3306/game";
	String user = "root";
	String pass = "user";
	 
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement stat = con.createStatement();
		String sql = "select * from payment_details where AccountNo='"+accountNo+"' and UserName='"+userName+"'";
		ResultSet rs = stat.executeQuery(sql);
		
		//rs = stmt.executeQuery(sql);
		
		 
		if (rs.next()) {
			int accountNo1 = rs.getInt(1);
			String userName1 = rs.getString(2);
			String CardNo = rs.getString(3);
			String CVV = rs.getString(4);
			String ExpYear = rs.getString(5);
			String CardType = rs.getString(6);
			
			Payments c = new Payments(accountNo1,userName1,CardNo,CVV,ExpYear,CardType);
			cus.add(c);
			
			} 
		
	    }
	catch (Exception e) {
		e.printStackTrace();
	}
	
	return cus;
	
}
	
 
//PaymentInsert
public static boolean PaymentInsert(String name, String cardno, String cvV,String expdate,String cardtyp) {
    	
    	boolean isSuccess = false;
    	
    	//create database connection
    			String url = "jdbc:mysql://localhost:3306/game";
    			String user = "root";
    			String pass = "user";
    	
		try {
    		Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stat = con.createStatement();
			String sql = "insert into payment_details values (0,'"+name+"','"+cardno+"','"+cvV+"','"+expdate+"','"+cardtyp+"')";
			int rs = stat.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return isSuccess;
    }	
//updatePayment
public static boolean updatePayment(String accountno,String username,String cardno,String cvv,String expyear,String cardtype) {
	
	boolean isSuccess = false;
	
			//create database connection
			String url = "jdbc:mysql://localhost:3306/game";
			String user = "root";
			String pass = "user";
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement stat = con.createStatement();
		String sql = "update payment_details set UserName='"+username+"',CardNo='"+cardno+"',CVV='"+cvv+"',ExpYear='"+expyear+"',CardType='"+cardtype+"'"+ "where AccountNo='"+accountno+"'";
		int rs = stat.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
		} else {
			isSuccess = false;
		}
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}


//deletePayment
public static boolean deletePayment(String id){
	
	int convid = Integer.parseInt(id);
	
	boolean isSuccess = false;
	
	//create database connection
			String url = "jdbc:mysql://localhost:3306/game";
			String user = "root";
			String pass = "user";
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement stat = con.createStatement();
		String sql = "delete from payment_details where AccountNo='"+convid+"'";
		int rs = stat.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
		} else {
			isSuccess = false;
		}
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
	
}


//getCustomerDetails
public static List<Payments> getCustomerDetails(String id) {
	
	int convertedid = Integer.parseInt(id);
	//boolean isSuccess = false;
	
	ArrayList<Payments> cus = new ArrayList<>();
	
			//create database connection
			String url = "jdbc:mysql://localhost:3306/game";
			String user = "root";
			String pass = "user";
			
	     try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, user, pass);
				Statement stat = con.createStatement();
				String sql = "select * from payment_details where AccountNo='"+convertedid+"'";
				ResultSet rs = stat.executeQuery(sql);
				
				while(rs.next()) {
					int accountNo1 = rs.getInt(1);
					String userName1 = rs.getString(2);
					String CardNo = rs.getString(3);
					String CVV = rs.getString(4);
					String ExpYear = rs.getString(5);
					String CardType = rs.getString(6);
					
	    			
	    			Payments c = new Payments(accountNo1,userName1,CardNo,CVV,ExpYear,CardType);
	    			cus.add(c);
	    		}
				
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
	     return cus;
	
}
}
