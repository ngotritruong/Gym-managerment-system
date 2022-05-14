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
public class F_Payment extends javax.swing.JFrame {

    /**
     * Creates new form F_Payment
     */
    public F_Payment() {
        initComponents();
        TF_ten.setEditable(false);
        cb_tong.setEditable(false);
        Mahoadon.setEditable(false);
        // Tất cả khách hang
        Tatcahoadon.setEnabled(false);
        DefaultTableModel model = (DefaultTableModel) Tatcahoadon.getModel(); 
        try { 
            Connection con = Connect_data.mysql_Connection(); 
            String query = "SELECT MaHD, NgayLap, NgayHH, TenKH, TenNV, TenGoi, TongTien FROM gym.hoadon, gym.admin, gym.new_member,gym.goitap where hoadon.id = admin.id and hoadon.MaKH = new_member.MaKH and hoadon.MaG = goitap.MaG;"; 
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(query); 
            while(res.next()) {
                model.addRow(new Object[]{res.getString(1),res.getString(2),
                res.getString(3),res.getString(4)
                ,res.getString(5),res.getString(6)        
                ,res.getString(7)});
            }       
            // close the connection          
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        } 
        // Chua thanh toán
        Chuatanhtoan.setEnabled(false);
        DefaultTableModel mode = (DefaultTableModel) Chuatanhtoan.getModel(); 
        try { 
            Connection con = Connect_data.mysql_Connection(); 
            String query = "SELECT MaHD, new_member.MaKH, NgayLap, NgayHH, TenKH, TenNV, TenGoi, TongTien FROM gym.hoadon, gym.admin, gym.new_member,gym.goitap where hoadon.id = admin.id and hoadon.MaKH = new_member.MaKH and hoadon.MaG = goitap.MaG and hoadon.NgayHH < curdate();"; 
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(query); 
            while(res.next()) {
                mode.addRow(new Object[]{res.getString(2),res.getString(5),
                res.getString(3),res.getString(4)
                ,res.getString(1),res.getString(6)        
                ,res.getString(7),res.getString(8)});
            }       
            // close the connection          
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }  
        // Goi tap 
        
        try { 
            Connection con = Connect_data.mysql_Connection(); 
            String query = "select * from goitap"; 
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(query); 
            while(res.next()) {
                CD_tengt.addItem(res.getString("TenGoi"));
                CB_MaGoi.addItem(res.getString("MaG"));
            }
          
            // close the connection
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        } 
    }
    // ngày
    public void date(){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
        String formattedDate = myDateObj.format(myFormatObj);
        ngaygiahan.setText(formattedDate);
    }
    
    // ngày hết hạn
    private String showSelected() {
        // Choisir les frais d'inscription 
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        cal.setTime(date);       
        String newngay ="";
        int selectedItem = CD_tengt.getSelectedIndex();
        
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
        ngayhethan.setText(newngay);

        return newngay;
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tatcahoadon = new javax.swing.JTable();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        Chuatanhtoan = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        TF_ten = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        CB_MaGoi = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        CD_tengt = new javax.swing.JComboBox<>();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        TF_MaKH2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        Mahoadon = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        ngaygiahan = new javax.swing.JLabel();
        ngayhethan = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        cb_tong = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(120, 100));
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
        jLabel1.setText("HÓA ĐƠN THANH TOÁN");

        jTabbedPane1.setForeground(new java.awt.Color(0, 102, 255));

        Tatcahoadon.setForeground(new java.awt.Color(51, 153, 255));
        Tatcahoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaHD", "Ngày Lập", "Ngày kết hạn", "Tên Khách Hàng", "Người lập", "Tên Gói", "Số tiền KH Thanh toán "
            }
        ));
        jScrollPane1.setViewportView(Tatcahoadon);
        if (Tatcahoadon.getColumnModel().getColumnCount() > 0) {
            Tatcahoadon.getColumnModel().getColumn(0).setPreferredWidth(10);
            Tatcahoadon.getColumnModel().getColumn(6).setPreferredWidth(10);
        }

        jTabbedPane1.addTab("TẤT CẢ HÓA ĐƠN", jScrollPane1);

        jTabbedPane2.setForeground(new java.awt.Color(0, 102, 255));

        Chuatanhtoan.setForeground(new java.awt.Color(51, 153, 255));
        Chuatanhtoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KH", "Tên KH", "Ngày đăng ký", "Ngày hết hạn", "Mã HD", "Người Lập HD", "Tên Gói", "Số tiền chưa gia hạn"
            }
        ));
        jScrollPane2.setViewportView(Chuatanhtoan);
        if (Chuatanhtoan.getColumnModel().getColumnCount() > 0) {
            Chuatanhtoan.getColumnModel().getColumn(0).setPreferredWidth(50);
            Chuatanhtoan.getColumnModel().getColumn(3).setPreferredWidth(5);
        }

        jTabbedPane2.addTab("DS KHÁCH HÀNG CHƯA GIA HẠN GÓI", jScrollPane2);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 102, 204));
        jLabel23.setText("Nhập mã thành viên muốn gia hạn: ");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 102, 204));
        jLabel24.setText("Họ và tên");

        TF_ten.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TF_ten.setForeground(new java.awt.Color(0, 102, 204));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 102, 204));
        jLabel27.setText("Mã gói");

        CB_MaGoi.setBackground(new java.awt.Color(102, 204, 255));
        CB_MaGoi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CB_MaGoi.setForeground(new java.awt.Color(0, 102, 204));
        CB_MaGoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_MaGoiActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 102, 204));
        jLabel29.setText("Tên gói:");

        CD_tengt.setBackground(new java.awt.Color(102, 204, 255));
        CD_tengt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CD_tengt.setForeground(new java.awt.Color(0, 102, 204));
        CD_tengt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CD_tengtActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 102, 204));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update.png"))); // NOI18N
        jButton13.setText("Gia hạn");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 102, 204));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        jButton14.setText("Reset");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/find-my-friend.png"))); // NOI18N
        jButton16.setText("Tìm Kiếm");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 102, 204));
        jLabel30.setText("Mã hóa đơn:");

        Mahoadon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Mahoadon.setForeground(new java.awt.Color(0, 102, 204));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 102, 204));
        jLabel31.setText("Ngày gia hạn:");

        ngaygiahan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ngaygiahan.setForeground(new java.awt.Color(0, 102, 204));
        ngaygiahan.setText("dd/mm/yy");

        ngayhethan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ngayhethan.setForeground(new java.awt.Color(0, 102, 204));
        ngayhethan.setText("dd/mm/yy");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 102, 204));
        jLabel32.setText("Ngày hết hạn:");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 102, 204));
        jLabel33.setText("Đồng");

        cb_tong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cb_tong.setForeground(new java.awt.Color(0, 102, 204));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 102, 204));
        jLabel34.setText("Số tiền phải  thanh toán: ");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete (1).png"))); // NOI18N
        jButton4.setText("Xóa");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ngaygiahan))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ngayhethan)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(0, 155, Short.MAX_VALUE)
                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Mahoadon)))
                                .addGap(30, 30, 30)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(CD_tengt, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_tong, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CB_MaGoi, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(TF_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(18, 18, 18)
                                .addComponent(TF_MaKH2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton16)
                        .addGap(448, 448, 448))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16)
                    .addComponent(TF_MaKH2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CB_MaGoi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32)
                        .addComponent(ngayhethan))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(ngaygiahan)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CD_tengt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mahoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(cb_tong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34))
                .addGap(53, 53, 53)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(160, 160, 160))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("GIA HẠN", jPanel2);

        jTabbedPane1.addTab("GIA HẠN HOA ĐƠN", jTabbedPane2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(380, 380, 380)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Bạn muốn xóa hóa đơn này ?","",JOptionPane.YES_NO_OPTION);
        if(response == 0) {
            String mahd = Mahoadon.getText();
            try {
                Connection con = Connect_data.mysql_Connection();
                Statement stmt;
                stmt = con.createStatement();
                stmt.executeUpdate("delete from hoadon WHERE MaKH='"+mahd+"'");
                JOptionPane.showMessageDialog(null,"Delete thành công");
                setVisible(false);
                new F_Update_Delete().setVisible(true);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,ex);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed
     public String IDNV="";
     public String TenNV ="";
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

        int checkMaKh = 0;
        this.date();
        String search_MaKH = TF_MaKH2.getText();
        try {
            // TODO add your handling code here:
            Connection con = Connect_data.mysql_Connection();
            Statement stmt = con.createStatement();
            ResultSet res=stmt.executeQuery("SELECT new_member.MaKH,TenKH, NgayLap, NgayHH, MaHD, goitap.MaG, TenGoi, GiaTien, TenNV, admin.ID FROM gym.hoadon, gym.admin, gym.new_member,gym.goitap where hoadon.id = admin.id and hoadon.MaKH = new_member.MaKH and hoadon.MaG = goitap.MaG and hoadon.NgayHH < curdate() and new_member.MaKH ='"+search_MaKH+"'");

            while(res.next()) {
                checkMaKh = 1;
                TF_ten.setText(res.getString(2));

                ngayhethan.setText(res.getString(4));
                Mahoadon.setText(res.getString(5));
                CB_MaGoi.setSelectedItem(new String(res.getString(6)));
                CD_tengt.setSelectedItem(new String(res.getString(7)));
                cb_tong.setText(res.getString(8));
                //                CB_GoiDK.setSelectedItem(new String(res.getString(8)));
                //                TF_Payment.setText(res.getString(9));
                IDNV = res.getString(10);
                TenNV = res.getString(9);
                
            }
            if(checkMaKh == 0){
                JOptionPane.showMessageDialog(null,"Mã khách hàng không tồn tại hoặc không nằm trong danh sách chưa gia hạn");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        this.showSelected();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        this.setVisible(false);
        new F_Payment().setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

                String Makh= TF_MaKH2.getText();
          
                String MaHD= Mahoadon.getText();
                String Ngaylap= ngaygiahan.getText();
                String Ngayhethan= ngayhethan.getText();
                String Tongtien= cb_tong.getText();
                String MaGoi= (String) CB_MaGoi.getSelectedItem();
//                String goidk= (String) CB_GoiDK.getSelectedItem();
//                String tongtien = arrInput[0];
                String idNhanvien = IDNV;
                Connection con = Connect_data.mysql_Connection(); 
               try {
                String query = "update hoadon set NgayLap=?, NgayHH=?, TongTien=?, MaKH=?, MaG=?, Id=? Where MaHD = ?";
                PreparedStatement ps = con.prepareStatement(query);
               
                ps.setString(1,Ngaylap);
                ps.setString(2,Ngayhethan);
                ps.setString(3,Tongtien);
                ps.setString(4,Makh);
                ps.setString(5,MaGoi);
                ps.setString(6,idNhanvien);
                ps.setString(7,MaHD);
                
                
                ps.executeUpdate(); 
                
                JOptionPane.showMessageDialog(null, "Gia hạn thành công thành công "); 
               
            }catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e); 
            }
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void CD_tengtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CD_tengtActionPerformed
        // TODO add your handling code here:
        int checkMaG = 0;
        String tengt = (String)CD_tengt.getSelectedItem();
        try {
            Connection con = Connect_data.mysql_Connection();
            Statement stmt = con.createStatement();
            ResultSet res=stmt.executeQuery("select * from goitap where TenGoi= '"+tengt+"'");
            while(res.next()) {
                checkMaG = 1;
                CB_MaGoi.setSelectedItem(new String(res.getString(1)));
                cb_tong.setText(res.getString(3));
            }
            if(checkMaG == 0){
                JOptionPane.showMessageDialog(null,"Tên Goi không tồn tại");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        this.showSelected();
    }//GEN-LAST:event_CD_tengtActionPerformed

    private void CB_MaGoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_MaGoiActionPerformed
        int checkMaG = 0;
        String magoi = (String)CB_MaGoi.getSelectedItem();
        try {
            Connection con = Connect_data.mysql_Connection();
            Statement stmt = con.createStatement();
            ResultSet res=stmt.executeQuery("select * from goitap where MaG= '"+magoi+"'");
            while(res.next()) {
                checkMaG = 1;
                CD_tengt.setSelectedItem(new String(res.getString(2)));
                cb_tong.setText(res.getString(3));
            }
            if(checkMaG == 0){
                JOptionPane.showMessageDialog(null,"Mã Goi không tồn tại");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        this.showSelected();
    }//GEN-LAST:event_CB_MaGoiActionPerformed
   
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
            java.util.logging.Logger.getLogger(F_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_MaGoi;
    private javax.swing.JComboBox<String> CD_tengt;
    private javax.swing.JTable Chuatanhtoan;
    private javax.swing.JTextField Mahoadon;
    private javax.swing.JTextField TF_MaKH2;
    private javax.swing.JTextField TF_ten;
    private javax.swing.JTable Tatcahoadon;
    private javax.swing.JTextField cb_tong;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel ngaygiahan;
    private javax.swing.JLabel ngayhethan;
    // End of variables declaration//GEN-END:variables
}
