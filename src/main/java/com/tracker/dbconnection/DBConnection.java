package com.tracker.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static Connection conn=null;
    public static Connection getConnection(){
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/task_manager","root","kiran12345");
           
       }catch(Exception e){
           e.printStackTrace();
       }
       return conn;
}
}
