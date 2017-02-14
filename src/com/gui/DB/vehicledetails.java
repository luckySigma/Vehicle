/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui.DB;

import com.vehicle.DB.Dbaccess;
import com.vehicle.DB.Dbconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Sanjeewa
 */
public class vehicledetails extends javax.swing.JInternalFrame {

    Connection con=null;
    PreparedStatement ps=null;
   
    
    public vehicledetails()  {
        initComponents();               
        //con=Dbconnect.getconnection();
        clear();
               tableload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ccondition = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        lblid = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtvmodel = new javax.swing.JTextField();
        txtmillage = new javax.swing.JTextField();
        txtowner = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("VEHICLE DETAILS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setForeground(new java.awt.Color(0, 255, 255));

        jLabel5.setText("condition");

        ccondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brand New", "Second Hand" }));

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        jLabel6.setText("Address");

        lblid.setText("ID");

        jLabel1.setText("Vehicle model");

        jLabel2.setText("Milage");

        jLabel4.setText("owner");

        txtvmodel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvmodelActionPerformed(evt);
            }
        });

        jLabel7.setText("Vid");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/java/1458923365_vector_66_12.png"))); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/java/1458923466_interact.png"))); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/java/1458923755_edit-delete.png"))); // NOI18N
        jButton4.setText("delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/java/1458923639_search_magnifying_glass_find.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/java/1459615138_edit-clear.png"))); // NOI18N
        jButton5.setText("CLEAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel8.setText("Date");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(27, 27, 27)
                .addComponent(jButton3)
                .addGap(29, 29, 29)
                .addComponent(jButton4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel2))
                                        .addGap(33, 33, 33))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtmillage)
                                    .addComponent(ccondition, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtaddress)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtowner, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblid)
                                        .addGap(74, 74, 74))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(txtvmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(603, 603, 603))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(583, 583, 583))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtvmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtowner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtmillage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ccondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)))
        );

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Vehicle Id", "Vehicle Model", "Milage", "Year", "Owner", "Condition", "Address"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 447, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(403, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
//        
//        String vmodel=txtvmodel.getText();
//        String millage=txtmillage.getText();
//       String year=txtyear.getText();
//       String owner=txtowner.getText();
//       String condition=ccondition.getSelectedItem().toString();
//       String address=txtaddress.getText();
//       
//       
//       
//         ResultSet  rs;
//        try {
//            
//            String q="',";
//           // ps=con.prepareStatement(q);
//          //  ps.execute();
//           Dbaccess da=new Dbaccess();
//           da.insertData(q);
//            
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(vehicledetails.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(vehicledetails.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        
        
clear();
           
        try {
            
             String search=txtsearch.getText();
            
            String q="SELECT * FROM vehicledetails WHERE vmodel like '%"+search+"%' ";
            Dbaccess da=new Dbaccess();
            
            
            
           
          
            jTable1.setModel(DbUtils.resultSetToTableModel( da.getData(q)));
            
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(vehicledetails.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(vehicledetails.class.getName()).log(Level.SEVERE, null, ex);
        }














        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void tableload(){
    
    
        try {
            String q= "SELECT *FROM vehicledetails";
            
            Dbaccess da=new Dbaccess();
            
            jTable1.setModel(DbUtils.resultSetToTableModel( da.getData(q)));
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(vehicledetails.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(vehicledetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
    
    
    public void clear(){
    
    
//    txtvid.setText("");
    lblid.setText("");
    txtvmodel.setText("");
    txtmillage.setText("");
    jDateChooser1.setDate(null);
    txtowner.setText("");
    ccondition.setSelectedItem(null);
    txtaddress.setText("");
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        
//    String  id=txtvid.getText();
//    String  model=txtvmodel.getText();
//    String  millage=txtmillage.getText();
//    String year=txtyear.getText();
//    String owner=txtowner.getText();
//    
//     String condition=ccondition.getSelectedItem().toString();
//     String address=txtaddress.getText();
//            
//        
//        try {
//            
//            String qu="INSERT INTO vehicledetails VALUES( vid='"+id+"',vmodel='"+model+"',vmillage='"+millage+"',vyear='"+year+"',vowner='"+owner+"',condition='"+condition+"',vaddrees='"+address+"') ";
//    
//            Dbaccess da=new Dbaccess();
//              da.insertData(qu);
//              
//              tableload();
//            
//            
//            
//            
//        } catch (Exception e) {
//        }
//        
//        
//        
        
        
        
//          
//     String  id=txtvid.getText().toString();
//    String  model=txtvmodel.getText().toString();
//    String  millage=txtmillage.getText();
//    String year=txtyear.getText();
//    String owner=txtowner.getText();
//    
//     String condition=ccondition.getSelectedItem().toString();
//     String address=txtaddress.getText();
//        
//        
//        
//        
//        try {
//            
//            
//            
//               String q="INSERT INTO vehicledetails VALUES( vid ='"+id+"',vmodel='"+model+"',vmillage='"+millage+"',vyear='"+year+"',vowner='"+owner+"',vcondition='"+condition+"',vaddress='"+address+"'  )";
//    
//                    Dbaccess da=new Dbaccess();
//            
//            
//            
//            
//            da.insertData(q);
//            
//            tableload();
//            
//            
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(vehicledetails.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(vehicledetails.class.getName()).log(Level.SEVERE, null, ex);
//        }
////              
//             
//        

     

    
      int x=  JOptionPane.showConfirmDialog(rootPane,"Do you want to insert");
        
        if (x==0){
    
    
               SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");  
            
//     String  id=txtvid.getText();
     String ids=lblid.getText();
    String  model=txtvmodel.getText();
    String  millage=txtmillage.getText();
    String year=date.format(jDateChooser1.getDate());
   // String year=txtyear.getText();
    String owner=txtowner.getText();
    
     String condition=ccondition.getSelectedItem().toString();
     String address=txtaddress.getText();
            
    
    
   
   
     String sql = "INSERT INTO `vehicleservice`.`vehicledetails` (  `vmodel`, `vmillage`, `vyear`, `vowner`, `vcondition`, `vaddress`) VALUES ( '"+model+"', '"+millage+"', '"+year+"', '"+owner+"', '"+condition+"', '"+address+"');";
  //  String q="INSERT INTO vehicledetails VALUES(vid ='"+id+"',vmodel='"+model+"',vmillage='"+millage+"',vyear='"+year+"',vowner='"+owner+"',vcondition='"+condition+"',vaddress='"+address+"' )";
    

     Dbaccess da=new Dbaccess();
     da.insertData(sql);
     tableload();
     
     clear();
    
    
    }
































        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtvmodelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvmodelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvmodelActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        
        
      int x=  JOptionPane.showConfirmDialog(rootPane,"Do you want to update");
        
        if (x==0){
    
       SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");  
///     String  id=txtvid.getText();
      String ids=lblid.getText();
    String  model=txtvmodel.getText();
    String  millage=txtmillage.getText();
   // String year=txtyear.getText();
   String year=date.format(jDateChooser1.getDate());
    String owner=txtowner.getText();
    
     String condition=ccondition.getSelectedItem().toString();
     String address=txtaddress.getText();
            
    
    
   
   
     String q="UPDATE vehicledetails SET vmodel='"+model+"',vmillage='"+millage+"',vyear='"+year+"',vowner='"+owner+"',vcondition='"+condition+"',vaddress='"+address+"' WHERE vid ='"+ids+"'";
     Dbaccess da=new Dbaccess();
     da.insertData(q);
     tableload();
    
    
    }
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
    
     
        
        
        
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
           int r=jTable1.getSelectedRow();
        
        
        String id=jTable1.getValueAt(r,0).toString();
        String model=jTable1.getValueAt(r, 1).toString();
        String  millage=jTable1.getValueAt(r, 2).toString();
        String year=jTable1.getValueAt(r, 3).toString();
        String owner=jTable1.getValueAt(r, 4).toString();
        String condition=jTable1.getValueAt(r, 5).toString();
        String address=jTable1.getValueAt(r,6).toString();
        
        
        
//        txtvid.setText(id);
    lblid.setText(id);
        txtvmodel.setText(model);
        txtmillage.setText(millage);
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");  
        try {
            jDateChooser1.setDate(format.parse(year));
        } catch (ParseException ex) {
            Logger.getLogger(vehicledetails.class.getName()).log(Level.SEVERE, null, ex);
        }

        //txtyear.setText(year);
         txtowner.setText(owner);
        ccondition.setSelectedItem(condition);
      
        txtaddress.setText(address);
        
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        int x=JOptionPane.showConfirmDialog(rootPane,"Do you want to delete");
        
        if(x==0){
        
//        String id=txtvid.getText();
        String ids=lblid.getText();
        
        
        String q="DELETE FROM vehicledetails WHERE vid='"+ids+"' ";
        
        
        Dbaccess da=new Dbaccess();
        
        da.insertData(q);
        
        tableload();
        
            clear();
        }
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        clear();
        txtsearch.setText("");
        
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ccondition;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblid;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtmillage;
    private javax.swing.JTextField txtowner;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtvmodel;
    // End of variables declaration//GEN-END:variables
}
