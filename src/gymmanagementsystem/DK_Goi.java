/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagementsystem;

import Connect.Connect_data;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Truong
 */
public class DK_Goi extends javax.swing.JFrame {

    /**
     * 
     */
    public DK_Goi(){
        initComponents();
        GiaGoi.setEditable(false);
        NgDK.setEditable(false);
        NHH.setEditable(false);
//        this.showSelected();    
        this.date();
        try { 
            Connection con = Connect_data.mysql_Connection(); 
            String query = "select * from goitap"; 
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(query); 
            while(res.next()) {
                CB_tengoi.addItem(res.getString("TenGoi"));
                CB_magoi.addItem(res.getString("MaG"));
            }
          
            // close the connection
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        } 
       
    }
    public void date(){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
        String formattedDate = myDateObj.format(myFormatObj);
        NgDK.setText(formattedDate);
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CB_tengoi = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NgDK = new javax.swing.JTextField();
        NHH = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        GiaGoi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TongTien = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CB_makh = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CB_magoi = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("????NG K?? G??I T???P");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/online-payment.png"))); // NOI18N
        jButton4.setText("Thanh to??n ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("T??n g??i:");

        CB_tengoi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CB_tengoi.setForeground(new java.awt.Color(0, 153, 255));
        CB_tengoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_tengoiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Ng??y ????ng k??:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("Ng??y h???t h???n:");

        NgDK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NgDK.setForeground(new java.awt.Color(0, 153, 255));

        NHH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NHH.setForeground(new java.awt.Color(0, 153, 255));
        NHH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NHHActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("Gi?? g??i:");

        GiaGoi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        GiaGoi.setForeground(new java.awt.Color(0, 153, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setText("T???ng s??? ti???n ph???i thanh to??n :");

        TongTien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TongTien.setForeground(new java.awt.Color(0, 153, 255));
        TongTien.setText("00000");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 255));
        jLabel8.setText("?????ng");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 255));
        jLabel9.setText("M?? kh??ch h??ng:");

        CB_makh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CB_makh.setForeground(new java.awt.Color(0, 153, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 255));
        jLabel10.setText("M?? G??i:");

        CB_magoi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CB_magoi.setForeground(new java.awt.Color(0, 153, 255));
        CB_magoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_magoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CB_makh, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(412, 412, 412))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(104, 104, 104)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(CB_tengoi, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(CB_magoi, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NgDK, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GiaGoi, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NHH, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jButton1))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_makh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_magoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_tengoi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GiaGoi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NgDK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4))
                    .addComponent(NHH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TongTien)
                    .addComponent(jLabel8))
                .addGap(32, 32, 32)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 624, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    //Luu
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String Makh= CB_makh.getText();
        String NgayLap= NgDK.getText();
        String han = NHH.getText();
        String MaGoi= (String) CB_magoi.getSelectedItem();
        String tong = TongTien.getText(); 
        String ID = "";
        String MaHD="";
        Connection con = Connect_data.mysql_Connection(); 
        
        try {
            
            Statement stmt = con.createStatement(); 
            ResultSet rs = stmt.executeQuery("select Id from admin"); 
            if(rs.next()) {
            
                ID = rs.getString("Id"); 
            }
        } catch(SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        int Ma=1; 
        String strID = String.valueOf(Ma); 
        try {
            
            Statement stmt = con.createStatement(); 
            ResultSet rs = stmt.executeQuery("select MAX(MaHD) from hoadon"); 
            if(rs.next()) {
            Ma = rs.getInt(1);
            Ma += 1; 
            strID = String.valueOf(Ma); 
            }
            MaHD = strID;
        } catch(SQLException e) {
            JOptionPane.showConfirmDialog(null, e); 
        }
            try {
                PreparedStatement ps = con.prepareStatement("insert into hoadon values (?,?,?,?,?,?,?)");
                ps.setString(1,MaHD);
                ps.setString(2,NgayLap);
                ps.setString(3,han  );
                ps.setString(4,tong);
                ps.setString(5,Makh);
                ps.setString(6,MaGoi);
                ps.setString(7,ID);
                ps.executeUpdate(); 
                
                JOptionPane.showMessageDialog(null, "THANH TO??N TH??NH C??NG "); 
                  
                this.setVisible(false); 
                new NewMembers().setVisible(true); 
            }catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e); 
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void CB_magoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_magoiActionPerformed
        int checkMaG = 0;
        String magoi = (String)CB_magoi.getSelectedItem();
        try { 
            Connection con = Connect_data.mysql_Connection(); 
            Statement stmt = con.createStatement();
            ResultSet res=stmt.executeQuery("select * from goitap where MaG= '"+magoi+"'");
            while(res.next()) {
                checkMaG = 1;
                CB_tengoi.setSelectedItem(new String(res.getString(2)));
                GiaGoi.setText(res.getString(3));
            }
               if(checkMaG == 0){
                JOptionPane.showMessageDialog(null,"M?? Goi kh??ng t???n t???i");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        } 
        this.showSelected();
    }//GEN-LAST:event_CB_magoiActionPerformed

    private void CB_tengoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_tengoiActionPerformed
        int checkMaG = 0;
        String tengt = (String)CB_tengoi.getSelectedItem();
        try { 
            Connection con = Connect_data.mysql_Connection(); 
            Statement stmt = con.createStatement();
            ResultSet res=stmt.executeQuery("select * from goitap where TenGoi= '"+tengt+"'");
            while(res.next()) {
                checkMaG = 1;
                CB_magoi.setSelectedItem(new String(res.getString(1)));
                GiaGoi.setText(res.getString(3));
            }
               if(checkMaG == 0){
                JOptionPane.showMessageDialog(null,"T??n Goi kh??ng t???n t???i");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        } 
            this.showSelected();
    }//GEN-LAST:event_CB_tengoiActionPerformed

    private void NHHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NHHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NHHActionPerformed
    
    private String showSelected() {
        // Choisir les frais d'inscription 
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        cal.setTime(date);       
        String newngay ="";
        int selectedItem = CB_tengoi.getSelectedIndex();
        
        switch (selectedItem) {
            case 0:
                cal.roll(Calendar.MONTH, 1);
                break;
            case 1:
                cal.roll(Calendar.MONTH, 2);
                break;
            case 2:
                cal.roll(Calendar.MONTH, 3);
                break;
            case 3:
                cal.roll(Calendar.MONTH, 6);
                break;
            default:
                cal.roll(Calendar.YEAR, 1);
                break;
        }
        newngay = sdf.format(cal.getTime());
        NHH.setText(newngay);
        TongTien.setText(GiaGoi.getText());
        return newngay;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DK_Goi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DK_Goi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DK_Goi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DK_Goi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DK_Goi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_magoi;
    private javax.swing.JTextField CB_makh;
    private javax.swing.JComboBox<String> CB_tengoi;
    private javax.swing.JTextField GiaGoi;
    private javax.swing.JTextField NHH;
    private javax.swing.JTextField NgDK;
    private javax.swing.JLabel TongTien;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
