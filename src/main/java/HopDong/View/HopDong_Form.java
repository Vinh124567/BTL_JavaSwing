/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HopDong.View;

import DichVu.Controller.DichVu_Controller;
import HopDong.Controller.HopDong_Controller;
import Room.View.Home_Form;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import loaiphong.controller.LoaiPhong_Controller;
import model.DichVu;
import model.HopDong;
import model.LoaiPhong;
import model.Room;

/**
 *
 * @author vinhp
 */
public class HopDong_Form extends javax.swing.JFrame {
    
    LoaiPhong_Controller loaiphongctrl=new LoaiPhong_Controller();
    DichVu_Controller dichvu=new DichVu_Controller();
    DefaultTableModel model;
    HopDong_Controller hopdongctrl=new HopDong_Controller();
    Map<String, String> DichVuMap=dichvu.getMaDichVu();
    String gioitinh="";
    String trangthai="";
    private Room room = null;
    private LoaiPhong a=null;
    List<DichVu> serviceList = dichvu.getDichVu();
    List<HopDong> danhSachHopDong=hopdongctrl.getHopDong();
    
    public HopDong_Form(Room room) {
        initComponents();
        
        Calendar currentDate = Calendar.getInstance();
        dteNgayki.setCalendar(currentDate);
//        Date ngayki = dteNgayki.getDate();
        
        this.room = room;
        setLocationRelativeTo(null);
        roomHasContract(room);
        loadDichVu();

    }

    private HopDong_Form() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void loadDichVu(){
        model = (DefaultTableModel) tblDichvu.getModel();
            model.setRowCount(0);

           for (DichVu c : serviceList) {
            Object[] rowData = {c.getId(), c.getTengoi(), c.getGia(),c.getMota()};
            model.addRow(rowData);
        }
           for (String goidichvu : DichVuMap.keySet()) {
            cboDichvu.addItem(goidichvu);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        txtTenkhachhang = new javax.swing.JTextField();
        txtMahopdong = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        txtCccd = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDiachi = new javax.swing.JTextField();
        txtLoaiphong = new javax.swing.JTextField();
        txtTenphong = new javax.swing.JTextField();
        txtTang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtGiaphong = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTiencoc = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        rdoConhan = new javax.swing.JRadioButton();
        rdoHethan = new javax.swing.JRadioButton();
        btnThem = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtGiadien = new javax.swing.JTextField();
        txtGianuoc = new javax.swing.JTextField();
        cboDichvu = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        btnKetthuc = new javax.swing.JButton();
        dteNgayki = new com.toedter.calendar.JDateChooser();
        dteNgayhethan = new com.toedter.calendar.JDateChooser();
        dteNgaysinh = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDichvu = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnTrolai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin hợp đồng"));

        jLabel1.setText("Mã Hợp Đồng");

        jLabel2.setText("Tên khách hàng");

        jLabel3.setText("Ngày sinh");

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");
        rdoNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNamActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");
        rdoNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNuActionPerformed(evt);
            }
        });

        txtLoaiphong.setEditable(false);

        txtTenphong.setEditable(false);

        txtTang.setEditable(false);

        jLabel4.setText("SDT");

        jLabel5.setText("Email");

        jLabel6.setText("CCCD");

        jLabel7.setText("Địa chỉ");

        jLabel8.setText("Giới tính");

        jLabel9.setText("Loại Phòng");

        jLabel10.setText("Tên phòng");

        jLabel11.setText("Tầng");

        txtGiaphong.setEditable(false);

        jLabel12.setText("Giá phòng");

        jLabel13.setText("Tiền cọc");

        jLabel14.setText("Ngày kí");

        jLabel15.setText("Ngày hết hạn");

        jLabel16.setText("Trạng thái");

        buttonGroup2.add(rdoConhan);
        rdoConhan.setText("Còn hạn");
        rdoConhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoConhanActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdoHethan);
        rdoHethan.setText("Hết hạn");
        rdoHethan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoHethanActionPerformed(evt);
            }
        });

        btnThem.setText("Tạo Hợp Đồng");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel17.setText("Giá điện");

        jLabel18.setText("Giá nước");

        txtGiadien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiadienActionPerformed(evt);
            }
        });

        jLabel19.setText("Gói dịch vụ");

        btnKetthuc.setText("Kết thúc hợp đồng");
        btnKetthuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetthucActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMahopdong))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenphong)
                                    .addComponent(txtLoaiphong)
                                    .addComponent(txtEmail)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtSdt))
                                    .addComponent(txtDiachi)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtTang, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(dteNgayki, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtTiencoc, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dteNgaysinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTenkhachhang))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboDichvu, 0, 130, Short.MAX_VALUE)
                                    .addComponent(txtGianuoc)
                                    .addComponent(txtGiadien)))
                            .addComponent(txtGiaphong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(rdoNam)
                                .addGap(18, 18, 18)
                                .addComponent(rdoNu)
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCccd, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnKetthuc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdoConhan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rdoHethan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dteNgayhethan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMahopdong))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenkhachhang)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(dteNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoNu)
                            .addComponent(rdoNam)
                            .addComponent(jLabel8))
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(txtCccd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiachi)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoaiphong)
                    .addComponent(jLabel9))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenphong)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTang)
                    .addComponent(jLabel11)
                    .addComponent(txtGiaphong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTiencoc)
                    .addComponent(jLabel17)
                    .addComponent(txtGiadien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel18)
                        .addComponent(txtGianuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dteNgayki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dteNgayhethan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(cboDichvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(rdoConhan)
                    .addComponent(rdoHethan))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnKetthuc))
                .addGap(88, 88, 88))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi tiết các gói dịch vụ"));

        tblDichvu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Gói", "Tên Gói", "Giá Tiền", "Mô Tả"
            }
        ));
        tblDichvu.setShowGrid(true);
        jScrollPane1.setViewportView(tblDichvu);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(509, Short.MAX_VALUE))
        );

        btnTrolai.setText("Back");
        btnTrolai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrolaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTrolai)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(btnTrolai, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGiadienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiadienActionPerformed
        
    }//GEN-LAST:event_txtGiadienActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if(checkEmpty()){
            HopDong hopdong=getDataForm();
            if(hopdong==null){
                 JOptionPane.showMessageDialog(this, "Lỗi", "Thông báo", JOptionPane.ERROR_MESSAGE);
                 return;
            }else{
            if(kiemTraTrungMaHopDong(hopdong.getMaHopDong(), danhSachHopDong)==false){
            boolean isSuccess = hopdongctrl.addHopDong(hopdong,room.getMaPhong());
            if(isSuccess){
                
                JOptionPane.showMessageDialog(this, "Thêm hợp đồng thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                Home_Form a=new Home_Form();
                a.setVisible(true);
                this.dispose();
            }else {
                JOptionPane.showMessageDialog(this, "Thêm hợp đồng không thành công", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
            }else {
                 JOptionPane.showMessageDialog(this, "Mã hợp đồng đã tồn tại", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
                }
        }
    }//GEN-LAST:event_btnThemActionPerformed
    
    private void displayDataFromDatabase(String id) {
        ResultSet resultSet = hopdongctrl.displayDataHopDongForm(id);
        try {
            while (resultSet.next()) {
                String mahopdong = resultSet.getString("mahopdong"); 
                txtMahopdong.setText(mahopdong);
                String tenkhachhang=resultSet.getString("tenkhachhang");
                txtTenkhachhang.setText(tenkhachhang);
                String ngaysinh=resultSet.getString("ngaysinh");
                
                Date ngaySinh = resultSet.getDate("ngaysinh");
                dteNgaysinh.setDate(ngaySinh);
                
                String gioitinh = resultSet.getString("gioitinh");
                if (gioitinh.equalsIgnoreCase("Nam")) {
                    rdoNam.setSelected(true);
                } else if (gioitinh.equalsIgnoreCase("Nữ")) {
                    rdoNu.setSelected(true);
                }
                String sdt=resultSet.getString("sdt");
                txtSdt.setText(sdt);
                String email=resultSet.getString("email");
                txtEmail.setText(email);
                String diachi=resultSet.getString("diachi");
                txtDiachi.setText(diachi);
                String maphong=resultSet.getString("maphong");
                txtTenphong.setText(maphong);
                String tang=resultSet.getString("tang");
                txtTang.setText(tang);
                int tiencoc = resultSet.getInt("tiencoc");
                txtTiencoc.setText(Integer.toString(tiencoc));
                
                Date ngayKi = resultSet.getDate("ngayki");
                dteNgayki.setDate(ngayKi);
                Date ngayHetHan = resultSet.getDate("ngayhethan");
                dteNgayhethan.setDate(ngayHetHan);
               
                
                String trangthai = resultSet.getString("trangthai");
                if (trangthai.equalsIgnoreCase("Còn hạn")) {
                    rdoConhan.setSelected(true);
                } else if (trangthai.equalsIgnoreCase("Hết hạn")) {
                    rdoHethan.setSelected(true);
                }
                int giadien = resultSet.getInt("giadien");
                txtGiadien.setText(Integer.toString(giadien));
                int gianuoc = resultSet.getInt("gianuoc");
                txtGianuoc.setText(Integer.toString(gianuoc));
                String cccd = resultSet.getString("cccd");
                txtCccd.setText(cccd);
                String tenloaiphong = resultSet.getString("tenloaiphong");
                txtLoaiphong.setText(tenloaiphong);
                String tengoidichvu=resultSet.getString("tengoidichvu");
                 btnKetthuc.setVisible(true);
                 btnThem.setVisible(false);
                
//                String loai=DichVuMap.get(tengoidichvu);
                
                for (int i = 0; i < cboDichvu.getItemCount(); i++) {
                    if (cboDichvu.getItemAt(i).equals(tengoidichvu)) { // So sánh giá trị từ cơ sở dữ liệu với từng mục trong combobox
                        cboDichvu.setSelectedIndex(i); // Chọn mục trong combobox nếu có sự khớp
                        break; // Thoát khỏi vòng lặp sau khi tìm thấy sự khớp
                    }
                }
                
                int giaphong = resultSet.getInt("giaphong");
                txtGiaphong.setText(Integer.toString(giaphong));
                


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void rdoNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNamActionPerformed
         if (rdoNam.isSelected()) {
            gioitinh = rdoNam.getText().toString(); // Lấy giá trị của radio button và gán vào biến
        } else if (rdoNu.isSelected()) {
            gioitinh= rdoNu.getText().toString(); // Lấy giá trị của radio button và gán vào biến
        } else {
            gioitinh = ""; // Nếu không có radio button nào được chọn
        }
    }//GEN-LAST:event_rdoNamActionPerformed

    private void rdoNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNuActionPerformed
        if (rdoNu.isSelected()) {
            gioitinh = rdoNu.getText().toString(); // Lấy giá trị của radio button và gán vào biến
        } else if (rdoNam.isSelected()) {
            gioitinh= rdoNam.getText().toString(); // Lấy giá trị của radio button và gán vào biến
        } else {
            gioitinh = ""; // Nếu không có radio button nào được chọn
        }
    }//GEN-LAST:event_rdoNuActionPerformed

    private void btnTrolaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrolaiActionPerformed
         Home_Form home_Form = new Home_Form();
            home_Form.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnTrolaiActionPerformed

    private void btnKetthucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetthucActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn kết thúc hợp đồng?", "Xác nhận ", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                if(room.getMahopdong() != null){
                    hopdongctrl.deleteHopDong(txtMahopdong.getText());
                    Home_Form a=new Home_Form();
                a.setVisible(true);
                this.dispose();
                }
            } 
    }//GEN-LAST:event_btnKetthucActionPerformed

    private void rdoConhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoConhanActionPerformed
        if (rdoConhan.isSelected()) {
            trangthai = rdoConhan.getText().toString(); // Lấy giá trị của radio button và gán vào biến
        } else if (rdoHethan.isSelected()) {
            trangthai= rdoHethan.getText().toString(); // Lấy giá trị của radio button và gán vào biến
        } else {
            trangthai = ""; // Nếu không có radio button nào được chọn
        }
    }//GEN-LAST:event_rdoConhanActionPerformed

    private void rdoHethanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoHethanActionPerformed
       if (rdoHethan.isSelected()) {
            trangthai = rdoHethan.getText().toString(); // Lấy giá trị của radio button và gán vào biến
        } else if (rdoConhan.isSelected()) {
            trangthai= rdoConhan.getText().toString(); // Lấy giá trị của radio button và gán vào biến
        } else {
            trangthai = ""; // Nếu không có radio button nào được chọn
        }
    }//GEN-LAST:event_rdoHethanActionPerformed

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
            java.util.logging.Logger.getLogger(HopDong_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HopDong_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HopDong_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HopDong_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HopDong_Form().setVisible(true);
            }
        });
    }
    
    public boolean kiemTraTrungMaHopDong(String maHopDong, List<HopDong> danhSachHopDong) {
    for (HopDong hopdong : danhSachHopDong) {
        if (hopdong.getMaHopDong().equals(maHopDong)) {
             JOptionPane.showMessageDialog(this, "Mã hợp đồng đã tồn tại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return true; // Tồn tại mã phòng trong danh sách
        }
    }
    return false; // Không tìm thấy mã phòng trong danh sách
}
    
    public  HopDong getDataForm() {
    String mahopdong = txtMahopdong.getText().toString();
    String tenkhachhang = txtTenkhachhang.getText().toString();

    Date ngaysinh = dteNgaysinh.getDate();

    String sdt = txtSdt.getText().toString();
    String cccd = txtCccd.getText().toString();
    String email = txtEmail.getText().toString();
    String diachi = txtDiachi.getText().toString();
    int tiencoc = Integer.parseInt(txtTiencoc.getText().toString());

    Date ngayki = dteNgayki.getDate();
    Date ngayhethan = dteNgayhethan.getDate();

    int giadien = Integer.parseInt(txtGiadien.getText().toString());
    int gianuoc = Integer.parseInt(txtGianuoc.getText().toString());
    String selected = cboDichvu.getSelectedItem().toString();
    String madichvu = DichVuMap.get(selected);

    // Kiểm tra nếu ngày kí lớn hơn hoặc bằng ngày hết hạn
    if (ngayki.compareTo(ngayhethan) >= 0) {
        JOptionPane.showMessageDialog(null, "Ngày kí phải trước ngày hết hạn", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return null; // Trả về null nếu có lỗi
    }

    HopDong hopdong = new HopDong(mahopdong, tenkhachhang, ngaysinh, gioitinh, sdt, email, diachi,
            tiencoc, ngayki, ngayhethan, trangthai, giadien, gianuoc, madichvu, cccd);
    return hopdong;
}

    
    public void roomHasContract(Room room){
        if(room.getMahopdong()!= null){
        displayDataFromDatabase(room.getMaPhong());
        }else{
            txtTenphong.setText(room.getMaPhong());
            txtTang.setText(String.valueOf(room.getTang()));
            LoaiPhong a=loaiphongctrl.getGiaPhong(room.getMaPhong());
            txtGiaphong.setText(String.valueOf(a.getGia()));
            txtLoaiphong.setText(a.getTen());

            btnKetthuc.setVisible(false);
            btnThem.setVisible(true);
        }
    }
  
    private boolean checkEmpty() {
    String mahopdong = txtMahopdong.getText().trim();
    String tenkhachhang = txtTenkhachhang.getText().trim();

    String sdt = txtSdt.getText().trim();
    String cccd = txtCccd.getText().trim();
    String email = txtEmail.getText().trim();
    String diachi = txtDiachi.getText().trim();
    String tiencocStr = txtTiencoc.getText().trim();
    
    String giadienStr = txtGiadien.getText().trim();
    String gianuocStr = txtGianuoc.getText().trim();
    String selected = cboDichvu.getSelectedItem().toString();
    String madichvu = DichVuMap.get(selected);

    
    // Kiểm tra từng trường một
    if (mahopdong.isEmpty() || tenkhachhang.isEmpty()  || sdt.isEmpty() || cccd.isEmpty() || 
            email.isEmpty() || diachi.isEmpty() || tiencocStr.isEmpty() ||  giadienStr.isEmpty() || 
            gianuocStr.isEmpty() || madichvu.isEmpty() ) {
        JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return false; // Trường nào đó rỗng, không hợp lệ
    }
    
    // Kiểm tra dữ liệu có hợp lệ không (ví dụ: kiểm tra định dạng số điện thoại, email, ngày sinh...)
    // Bạn có thể thêm các điều kiện kiểm tra ở đây
    
    return true; // Tất cả trường đều không rỗng và hợp lệ
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKetthuc;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTrolai;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cboDichvu;
    private com.toedter.calendar.JDateChooser dteNgayhethan;
    private com.toedter.calendar.JDateChooser dteNgayki;
    private com.toedter.calendar.JDateChooser dteNgaysinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoConhan;
    private javax.swing.JRadioButton rdoHethan;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblDichvu;
    private javax.swing.JTextField txtCccd;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGiadien;
    private javax.swing.JTextField txtGianuoc;
    private javax.swing.JTextField txtGiaphong;
    private javax.swing.JTextField txtLoaiphong;
    private javax.swing.JTextField txtMahopdong;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTang;
    private javax.swing.JTextField txtTenkhachhang;
    private javax.swing.JTextField txtTenphong;
    private javax.swing.JTextField txtTiencoc;
    // End of variables declaration//GEN-END:variables
}
