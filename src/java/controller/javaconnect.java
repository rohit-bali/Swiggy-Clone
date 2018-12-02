/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class javaconnect {
    private javaconnect(){}
    static Connection conn;
    public static Connection connectDb(){
    
        try {
            //step 1:
            Class.forName("com.mysql.jdbc.Driver");
        String myUrl="jdbc:mysql://localhost/acadview";
            conn=DriverManager.getConnection(myUrl,"root","");
        } catch (Exception ex) {
            System.out.print(ex);
        }
        return conn;
      		//
}
}
