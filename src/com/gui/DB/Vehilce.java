/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui.DB;

import com.vehicle.DB.Dbaccess;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sanjeewa
 */
public class Vehilce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        
         Dbaccess dba = new Dbaccess();
        
       // String query = "INSERT INTO login values('eytr6u','rheryr','ppppp');";
       // System.out.println(query);
        try {
      //      dba.insertData(query);
        } catch (Exception ex) {
            Logger.getLogger(Vehilce.class.getName()).log(Level.SEVERE, null, ex);
        }
     //   System.out.println(query);
     //  ResultSet rs = dba.getData(query);
        
     
    }
    
}
