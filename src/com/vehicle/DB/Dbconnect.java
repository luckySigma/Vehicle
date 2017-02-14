/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vehicle.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sanjeewa
 */
public class Dbconnect {
    
    public static Connection getconnection() throws ClassNotFoundException, SQLException{
    
        
        
    Class.forName("com.mysql.jdbc.Driver");
     Connection conn = null;
    
        try {
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicleservice","root","1234");
             
             
        } catch (Exception e) {
            
            
            e.printStackTrace();
        }
   
   
    return conn;
    
    }
    
    
}
