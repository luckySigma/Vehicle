/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vehicle.DB;

import java.awt.Container;
import java.sql.DriverManager;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Sanjeewa
 */
public class ReportView extends JFrame {
    
        public ReportView(String fileName)
    {
        this(fileName, null);
    }
    public ReportView(String fileName, HashMap para)
    {
        super("Vehicle Management System (Report Viewer)");

        try{
        Dbaccess dba = new Dbaccess();
        java.sql.Connection con = null;
       // con = (java.sql.Connection) DriverManager.getConnection(dba.url, dba.username, dba.password);
        
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicleservice","root","1234");
              

        try
        {
            JasperPrint print = JasperFillManager.fillReport(fileName, para, con);
            JRViewer viewer = new JRViewer(print);
            Container c = getContentPane();
            c.add(viewer);            
        } 
        catch (JRException jRException)
        {
            
        }
        setBounds(10, 10, 900, 700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    
                }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e );
           // ve.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }
}
    


