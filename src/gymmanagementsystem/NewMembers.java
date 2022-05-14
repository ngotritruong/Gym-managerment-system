/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagementsystem;
import Connect.Connect_data;
import java.awt.HeadlessException;
import java.sql.*; 

import java.util.Random;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Truong
 */
public class NewMembers extends javax.swing.JFrame {

    /**
     * Creates new form NewMembers
     */
    
    public NewMembers() {
        initComponents();
        exitlb.setVisible(false);
        date();
//        showSelected(); 
        int Ma=1; 
        String strID = String.valueOf(Ma); 
        try {
            Connection connection = Connect_data.mysql_Connection(); 
            Statement stmt = connection.createStatement(); 
            ResultSet rs = stmt.executeQuery("select MAX(MaKH) from new_member"); 
            if(rs.next()) {
            Ma = rs.getInt(1);
            Ma += 1; 
            strID = String.valueOf(Ma); 
            }
            lb_MaKH.setText(strID);
        } catch(SQLException e) {
            JOptionPane.showConfirmDialog(null, e); 
        }
        
    }
//    private int showSelected() {
//        // Choisir les frais d'inscription 
//        int amount=0;
//        int selectedItem = CB_GoiDK.getSelectedIndex();
//        switch (selectedItem) {
//            case 0:
//                amount = 250000;
//                break;
//            case 1:
//                amount = 650000; 
//                break;
//            default:
//                amount = 1200000;
//                break;
//        }
//        TF_Payment.setEditable(false);
//        TF_Payment.setText(String.valueOf(amount)); 
//        
//        return amount;
//    }

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
        lb_MaKH = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TF_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TF_DiaChi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TF_AGE = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        CB_TIME = new javax.swing.JComboBox<>();
        TF_SDT = new javax.swing.JTextField();
        CB_GioiTinh = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        exitlb = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TF_Email1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(120, 100));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 102, 204));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Mã thành viên: ");

        lb_MaKH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_MaKH.setForeground(new java.awt.Color(0, 102, 204));
        lb_MaKH.setText("000");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Họ và tên");

        TF_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TF_name.setForeground(new java.awt.Color(0, 102, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Địa Chỉ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Email");

        TF_DiaChi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TF_DiaChi.setForeground(new java.awt.Color(0, 102, 204));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Giới tính");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/diskette.png"))); // NOI18N
        jButton4.setText("Lưu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("Nhập Tuổi");

        TF_AGE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TF_AGE.setForeground(new java.awt.Color(0, 102, 204));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 102, 204));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        jButton5.setText("Reset");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setText("Thời gian tập");

        CB_TIME.setBackground(new java.awt.Color(102, 204, 255));
        CB_TIME.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CB_TIME.setForeground(new java.awt.Color(0, 102, 204));
        CB_TIME.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00AM - 11:00AM", "4:00PM - 8:00PM" }));

        TF_SDT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TF_SDT.setForeground(new java.awt.Color(0, 102, 204));

        CB_GioiTinh.setBackground(new java.awt.Color(102, 204, 255));
        CB_GioiTinh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CB_GioiTinh.setForeground(new java.awt.Color(0, 102, 204));
        CB_GioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Khác" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 42)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 255));
        jLabel10.setText("THÊM THÀNH VIÊN");

        exitlb.setBackground(new java.awt.Color(255, 51, 51));
        exitlb.setForeground(new java.awt.Color(255, 51, 51));
        exitlb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close (1).png"))); // NOI18N
        exitlb.setText("Thông tin thành viên nhập vào thiếu hoặc không đúng ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 204));
        jLabel9.setText("Ngay tham gia");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 204));
        jLabel11.setText("Số điện thoại");

        TF_Email1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TF_Email1.setForeground(new java.awt.Color(0, 102, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("DD-MM-YY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(423, 423, 423)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TF_name, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(TF_DiaChi)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(TF_SDT, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lb_MaKH))
                    .addComponent(jLabel11)
                    .addComponent(TF_Email1))
                .addGap(149, 149, 149)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CB_GioiTinh, 0, 329, Short.MAX_VALUE)
                    .addComponent(CB_TIME, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TF_AGE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(268, 268, 268))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(479, 479, 479)
                        .addComponent(jButton4)
                        .addGap(131, 131, 131)
                        .addComponent(jButton5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(491, 491, 491)
                        .addComponent(exitlb)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel10)))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_MaKH))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TF_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CB_TIME, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TF_name, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CB_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TF_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TF_AGE, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel2))
                            .addComponent(TF_Email1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(exitlb)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);   
    }//GEN-LAST:event_jButton1ActionPerformed

    // validate
    private boolean validateFields() {
        //regex SDT
        Pattern VALID_SDT_ADDRESS_REGEX = Pattern.compile("^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$");
        Matcher sdt = VALID_SDT_ADDRESS_REGEX.matcher(TF_SDT.getText());
        //regex mail
        Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$");
        Matcher email = VALID_EMAIL_ADDRESS_REGEX.matcher(TF_Email1.getText());
        if(! ( TF_name.getText().equals("") || 
               !sdt.find() || !email.find() || TF_AGE.getText().equals(""))){
            return true;
        }else return false;  
    }
// reset
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        new NewMembers().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed
    public void date(){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
        String formattedDate = myDateObj.format(myFormatObj);
        jLabel2.setText(formattedDate);
    }
    //Save
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//        int b=0,a=3; 
//        String Input = TF_Payment.getText(); 
//        String[] arrInput = Input.split("\\s+");
        if(validateFields())  {
                String Makh=lb_MaKH.getText();
                String TenKH= TF_name.getText();
                String DiaChi = TF_DiaChi.getText();
                String SDT= TF_SDT.getText();
                String email= TF_Email1.getText();
                String Gioitinh=(String) CB_GioiTinh.getSelectedItem();
                String age= TF_AGE.getText();
                String TG_Tap= (String) CB_TIME.getSelectedItem();
                String time = jLabel2.getText();
                Connection con = Connect_data.mysql_Connection(); 
               
               try {
                PreparedStatement ps = con.prepareStatement("insert into new_member values (?,?,?,?,?,?,?,?,?)");
                ps.setString(1,Makh);
                ps.setString(2,TenKH);
                ps.setString(3,DiaChi);
                ps.setString(4,SDT);
                ps.setString(5,email);
                ps.setString(6,Gioitinh);
                ps.setString(7,age);
                ps.setString(8,TG_Tap);
                ps.setString(9, time);
//                ps.setString(8,goidk);
//                ps.setString(9,tongtien);
//               
                ps.executeUpdate(); 
                
                JOptionPane.showMessageDialog(null, "Lưu Thành công "); 
                  
                new DK_Goi().setVisible(true);
                this.setVisible(false);
               
            }catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e); 
            }
        } else {
            exitlb.setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    // rundum
    
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
            java.util.logging.Logger.getLogger(NewMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewMembers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_GioiTinh;
    private javax.swing.JComboBox<String> CB_TIME;
    private javax.swing.JTextField TF_AGE;
    private javax.swing.JTextField TF_DiaChi;
    private javax.swing.JTextField TF_Email1;
    private javax.swing.JTextField TF_SDT;
    private javax.swing.JTextField TF_name;
    private javax.swing.JLabel exitlb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_MaKH;
    // End of variables declaration//GEN-END:variables
}
