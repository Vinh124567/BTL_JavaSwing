/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HoaDon.View;

import AllowNumber.CustomDocumentFilter;
import HoaDon_Controller.HoaDon_Controller;
import Home.View.Home_Page;
import Room.View.Home_Form;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.AbstractDocument;
import loaiphong.controller.LoaiPhong_Controller;
import model.HoaDon;
import model.Room;

/**
 *
 * @author vinhp
 */
public class ListHoaDon_Form extends javax.swing.JFrame {

    LoaiPhong_Controller loaiphongctrl=new LoaiPhong_Controller();
     HoaDon_Controller hoadonctrl=new HoaDon_Controller();
     List<HoaDon> hoaDonList ;
     DefaultTableModel model;
     private Room room = null;
     String selected="";
    public ListHoaDon_Form() {
        initComponents();
        setUpDefault();
    }
    
    public void setUpDefault(){
        AllowNumber();
        loadDataTable();
        btnSua.setEnabled(false);
        Calendar currentDate = Calendar.getInstance();
        dteNgaytao.setCalendar(currentDate);
        setLocationRelativeTo(null);
     }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDien = new javax.swing.JTextField();
        txtMahoadon = new javax.swing.JTextField();
        dteNgaytao = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTenkhachhang = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtGiaphong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtGianuoc = new javax.swing.JTextField();
        txtGiadichvu = new javax.swing.JTextField();
        txtNuoc = new javax.swing.JTextField();
        txtTendichvu = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTongtien = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        rdoDathanhtoan = new javax.swing.JRadioButton();
        rdoChuathanhtoan = new javax.swing.JRadioButton();
        btnSua = new javax.swing.JButton();
        txtLammoi = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtGiadien = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTenphong = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtMahopdong = new javax.swing.JTextField();
        btnXoa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoadon = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Form"));
        jPanel1.setToolTipText("");

        jLabel1.setText("Mã hóa đơn");

        jLabel2.setText("Điện");

        txtMahoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMahoadonActionPerformed(evt);
            }
        });

        jLabel3.setText("Ngày tạo");

        jLabel4.setText("Tên khách hàng");

        txtTenkhachhang.setEditable(false);

        jLabel5.setText("Tiền phòng");

        txtGiaphong.setEditable(false);

        jLabel6.setText("Nước");

        jLabel7.setText("Dịch vụ");

        jLabel8.setText("Giá");

        jLabel9.setText("Giá DV");

        txtGianuoc.setEditable(false);
        txtGianuoc.setText("15000");

        txtGiadichvu.setEditable(false);

        txtTendichvu.setEditable(false);

        jLabel10.setText("Tổng tiền");

        txtTongtien.setEditable(false);
        txtTongtien.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTongtienFocusLost(evt);
            }
        });
        txtTongtien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongtienActionPerformed(evt);
            }
        });

        jLabel13.setText("Trạng thái");

        buttonGroup1.add(rdoDathanhtoan);
        rdoDathanhtoan.setText("Đã thanh toán");
        rdoDathanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDathanhtoanActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoChuathanhtoan);
        rdoChuathanhtoan.setText("Chưa thanh toán");
        rdoChuathanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoChuathanhtoanActionPerformed(evt);
            }
        });

        btnSua.setText("Cập nhập");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        txtLammoi.setText("Làm mới");
        txtLammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLammoiActionPerformed(evt);
            }
        });

        jLabel14.setText("Giá");

        txtGiadien.setEditable(false);
        txtGiadien.setText("3000");

        jLabel11.setText("Mã phòng");

        txtTenphong.setEditable(false);

        jLabel12.setText("Mã hợp đồng");

        txtMahopdong.setEditable(false);

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnSua)
                        .addGap(30, 30, 30)
                        .addComponent(btnXoa)
                        .addGap(20, 143, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMahoadon, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addComponent(txtTenkhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addComponent(txtTenphong)
                                    .addComponent(txtMahopdong))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 306, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGianuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGiadichvu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGiadien, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel3))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtGiaphong, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDien, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dteNgaytao, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTendichvu, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 60, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(rdoDathanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLammoi)
                                            .addComponent(rdoChuathanhtoan))))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMahoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtMahopdong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenphong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenkhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(dteNgaytao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtGiaphong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel14)
                    .addComponent(txtGiadien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(txtGianuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(txtGiadichvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTendichvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoDathanhtoan)
                    .addComponent(rdoChuathanhtoan)
                    .addComponent(jLabel13))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(txtLammoi)
                    .addComponent(btnXoa))
                .addGap(57, 57, 57))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin"));

        tblHoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Mã hợp đồng", "Phòng", "Tên KH", "Ngày tạo", "Tổng tiền", "Trạng thái"
            }
        ));
        tblHoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoadonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHoadon);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMahoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMahoadonActionPerformed
        
    }//GEN-LAST:event_txtMahoadonActionPerformed

    private void txtTongtienFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTongtienFocusLost
        String dienText = txtDien.getText();
        String nuocText = txtNuoc.getText();
        // Kiểm tra xem các chuỗi có rỗng không trước khi chuyển đổi
        if (!dienText.isEmpty() && !nuocText.isEmpty()) {
            int dien = Integer.parseInt(dienText);
            int nuoc = Integer.parseInt(nuocText);
            int giadien = Integer.parseInt(txtGiadien.getText());
            int gianuoc = Integer.parseInt(txtGianuoc.getText());
            int giaphong = Integer.parseInt(txtGiaphong.getText());
            int giadichvu = Integer.parseInt(txtGiadichvu.getText());

            // Thực hiện tính toán để đặt giá trị cho tổng tiền
            int tongtien = (dien * giadien + nuoc * gianuoc) + giaphong + giadichvu;

            // Đặt giá trị của tổng tiền vào textfield
            txtTongtien.setText(String.valueOf(tongtien));
        }
    }//GEN-LAST:event_txtTongtienFocusLost

    private void txtTongtienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongtienActionPerformed
        
    }//GEN-LAST:event_txtTongtienActionPerformed

    private void rdoDathanhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoDathanhtoanActionPerformed
         if (rdoDathanhtoan.isSelected()) {
            selected = rdoDathanhtoan.getText().toString(); // Lấy giá trị của radio button và gán vào biến
        } else if (rdoChuathanhtoan.isSelected()) {
            selected= rdoChuathanhtoan.getText().toString(); // Lấy giá trị của radio button và gán vào biến
        } else {
            selected = ""; // Nếu không có radio button nào được chọn
        }
    }//GEN-LAST:event_rdoDathanhtoanActionPerformed

    private void rdoChuathanhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoChuathanhtoanActionPerformed
      if (rdoChuathanhtoan.isSelected()) {
            selected = rdoChuathanhtoan.getText().toString(); // Lấy giá trị của radio button và gán vào biến
        } else if (rdoDathanhtoan.isSelected()) {
            selected= rdoDathanhtoan.getText().toString(); // Lấy giá trị của radio button và gán vào biến
        } else {
            selected = ""; // Nếu không có radio button nào được chọn
        }
    }//GEN-LAST:event_rdoChuathanhtoanActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
         if(checkEmpty()){
            String mahopdong=txtMahopdong.getText();
            String mahoadon=txtMahoadon.getText();
            HoaDon a=getObjFromForm();
            Boolean success=hoadonctrl.updateHoaDon(a);
            if(success){
                loadDataTable();
               JOptionPane.showMessageDialog(this, "Sửa hóa đơn thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }else{
               JOptionPane.showMessageDialog(this, "Sửa hóa đơn không thành công", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }     
      }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtLammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLammoiActionPerformed
   

    }//GEN-LAST:event_txtLammoiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
            String mahopdong=txtMahopdong.getText();
            String mahoadon=txtMahoadon.getText();
            clear();
            Boolean success=hoadonctrl.deletehoaDon(mahoadon);
            if(success){
               loadDataTable();
               JOptionPane.showMessageDialog(this, "Xóa hóa đơn thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }else{
               JOptionPane.showMessageDialog(this, "Xóa hóa đơn không thành công", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }     
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblHoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoadonMouseClicked
        int i=tblHoadon.getSelectedRow();
        TableModel model =tblHoadon.getModel();
        txtMahoadon.setEnabled(false);
        String id=model.getValueAt(i,0).toString();
       
        btnSua.setEnabled(true);
        btnXoa.setEnabled(true);
        HoaDon a=hoadonctrl.getHoaDonById(id);
        fetchDataTableClick(a);
    }//GEN-LAST:event_tblHoadonMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Home_Page homepage=new Home_Page();
        homepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(ListHoaDon_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListHoaDon_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListHoaDon_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListHoaDon_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListHoaDon_Form().setVisible(true);
            }
        });
    }
    
    
    public void clear(){
        txtMahoadon.setEnabled(true);
  
        btnSua.setEnabled(false);
         btnXoa.setEnabled(false);
        txtMahoadon.setText("");
        AbstractDocument doc = (AbstractDocument) txtDien.getDocument();
        AbstractDocument doc1 = (AbstractDocument) txtNuoc.getDocument();
        doc.setDocumentFilter(null); // Gỡ bỏ bộ lọc hiện tại
        doc1.setDocumentFilter(null);
        txtDien.setText("");
        txtNuoc.setText("");
        doc.setDocumentFilter(new CustomDocumentFilter());
        doc1.setDocumentFilter(new CustomDocumentFilter());
     }
    
    public HoaDon getObjFromForm(){
         String mahoadon=txtMahoadon.getText();
            String mahopdong=txtMahopdong.getText();
            Date ngaytao=dteNgaytao.getDate();
            int dien=Integer.parseInt(txtDien.getText());
            int nuoc=Integer.parseInt(txtNuoc.getText());
            int tongtien =Integer.parseInt(txtTongtien.getText());
            HoaDon a=new HoaDon(mahoadon,mahopdong,ngaytao,dien,nuoc,tongtien,selected);
            return a;
    }
    
    public void loadDataTable(){
            model = (DefaultTableModel) tblHoadon.getModel();
            model.setRowCount(0);
            hoaDonList=hoadonctrl.getAllHoaDon(null);
            for (HoaDon c : hoaDonList) {
            Object[] rowData = {c.getMahoadon(), c.getMahopdong(), c.getMaphong(),c.getTenkhachhang(),c.getNgaytao(),c.getTongtien(),c.getTrangthai()};
            model.addRow(rowData);
        }
           
    }
    
    private void fetchDataTableClick(HoaDon hoadon){
        txtMahoadon.setText(hoadon.getMahoadon());
        txtTenkhachhang.setText(hoadon.getTenkhachhang());
        txtGiadichvu.setText(String.valueOf(hoadon.getGiadichvu()));
        txtTenphong.setText(hoadon.getMaphong());
        txtTendichvu.setText(hoadon.getTendichvu());
        txtGiaphong.setText(String.valueOf(hoadon.getGiaphong()));
        txtMahopdong.setText(hoadon.getMahopdong());
        txtTongtien.setText(String.valueOf(hoadon.getTongtien()));
        txtDien.setText(String.valueOf(hoadon.getDien()));
        txtNuoc.setText(String.valueOf(hoadon.getNuoc()));
        dteNgaytao.setDate(hoadon.getNgaytao());
        String trangthai = hoadon.getTrangthai();
        if (trangthai.equalsIgnoreCase("Đã thanh toán")) {
            rdoDathanhtoan.setSelected(true);
        } else if (trangthai.equalsIgnoreCase("Chưa thanh toán")) {
            rdoChuathanhtoan.setSelected(true);
        }
    }
    
    private boolean checkEmpty() {
    String mahopdong = txtMahopdong.getText().trim();
    String tenkhachhang = txtTenkhachhang.getText().trim();

    Date ngaytao = dteNgaytao.getDate();

    String mahoadon = txtMahoadon.getText().trim();
    String dien = txtDien.getText().trim();
    String nuoc = txtNuoc.getText().trim();
    

    ButtonModel selectedButtonModel1 = buttonGroup1.getSelection();

    // Kiểm tra từng trường một
    if (mahopdong.isEmpty() || tenkhachhang.isEmpty() || mahoadon.isEmpty() || dien.isEmpty() ||
            nuoc.isEmpty() || ngaytao == null || selectedButtonModel1 == null ) {
        JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return false; // Trường nào đó rỗng, không hợp lệ
    }
    return true; // Tất cả trường đều không rỗng và hợp lệ
}

    public void AllowNumber() {
    AbstractDocument doc1 = (AbstractDocument) txtDien.getDocument();
    doc1.setDocumentFilter(new CustomDocumentFilter());
    AbstractDocument doc2 = (AbstractDocument) txtNuoc.getDocument();
    doc2.setDocumentFilter(new CustomDocumentFilter());
 
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dteNgaytao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoChuathanhtoan;
    private javax.swing.JRadioButton rdoDathanhtoan;
    private javax.swing.JTable tblHoadon;
    private javax.swing.JTextField txtDien;
    private javax.swing.JTextField txtGiadichvu;
    private javax.swing.JTextField txtGiadien;
    private javax.swing.JTextField txtGianuoc;
    private javax.swing.JTextField txtGiaphong;
    private javax.swing.JButton txtLammoi;
    private javax.swing.JTextField txtMahoadon;
    private javax.swing.JTextField txtMahopdong;
    private javax.swing.JTextField txtNuoc;
    private javax.swing.JTextField txtTendichvu;
    private javax.swing.JTextField txtTenkhachhang;
    private javax.swing.JTextField txtTenphong;
    private javax.swing.JTextField txtTongtien;
    // End of variables declaration//GEN-END:variables
}
