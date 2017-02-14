/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vehicle.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sanjeewa
 */
public class Dbaccess {
    
     Dbconnect dbconn=new Dbconnect();
     
    public void insertData(String query) {
    
   
         try {
             Connection conn=dbconn.getconnection();
             PreparedStatement s = conn.prepareStatement(query);
             
             s.execute();
             
//   if(s.execute(query)){
//        System.out.println("inserted");
//        conn.close();
//   
//   } else
//   {
//       System.out.println("fail");
//   
//   }
         } catch (SQLException ex) {
             Logger.getLogger(Dbaccess.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Dbaccess.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    
    
         
   
   
   
   
    
    
    }

    public ResultSet getData(String query) throws ClassNotFoundException, SQLException {
        ResultSet result = null;
        
        try {
            Connection conn = dbconn.getconnection();
            Statement s = conn.prepareStatement(query);
            
              result = s.executeQuery(query);
        } catch ( SQLException e) {
            e.printStackTrace();
        }
            
            
          
        
        
        return result;
    }
    
    
    
    
 
    
}
