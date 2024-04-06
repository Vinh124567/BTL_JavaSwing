/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Room.View;

import HopDong.View.HopDong_Form;
import Room.Controller.Room_Controller;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import loaiphong.controller.LoaiPhong_Controller;
import model.DichVu;
import model.HopDong;
import model.Room;

/**
 *
 * @author vinhp
 */
public class ListRoom_Form extends javax.swing.JFrame {

    Room_Controller roomController = new Room_Controller();
    LoaiPhong_Controller loaiphongcontroller = new LoaiPhong_Controller();
    DefaultTableModel model;
    Map<Integer, String> loaiPhongMap1=loaiphongcontroller.getLoaiPhongData1();
    Map<String, Integer> loaiPhongMap=loaiphongcontroller.getLoaiPhongData();;
    ArrayList<Room> rooms = roomController.getRoom();
    
    public ListRoom_Form() {
        initComponents();
        btnTaohopdong.setVisible(false);
        btnXemhopdong.setVisible(false);
        setLocationRelativeTo(null);
        
//        model = (DefaultTableModel) tblRoom.getModel();
//        model.setRowCount(0);
         loadDatatable();
         
         
    }
    
    public void loadDatatable(){
        rooms = roomController.getRoom();
        model = (DefaultTableModel) tblRoom.getModel();
        model.setRowCount(0);
        for (String tenLoaiPhong : loaiPhongMap.keySet()) {
           cboLoaiphong.addItem(tenLoaiPhong);
           }
         for (Room c : rooms) {
            Object[] rowData = {c.getMaPhong(), c.getMahopdong(), loaiPhongMap1.get(c.getLoaiPhong()),c.getTang(),c.getMoTa(),c.getTrangThai()};
            model.addRow(rowData);
        }
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRoom = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaphong = new javax.swing.JTextField();
        txtMahopdong = new javax.swing.JTextField();
        cboLoaiphong = new javax.swing.JComboBox<>();
        txtMota = new javax.swing.JTextField();
        txtTang = new javax.swing.JTextField();
        txtSua = new javax.swing.JButton();
        cboTrangthai = new javax.swing.JComboBox<>();
        btnTaohopdong = new javax.swing.JButton();
        btnXemhopdong = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Phòng", "Mã Hợp Đồng", "Loại Phòng", "Tầng", "Mô tả", "Trạng thái"
            }
        ));
        tblRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRoomMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRoom);

        jLabel1.setText("Mã phòng");

        jLabel2.setText("Mã hợp đồng");

        jLabel3.setText("Loại phòng");

        jLabel4.setText("Mô tả");

        jLabel5.setText("Trạng thái");

        jLabel6.setText("Tầng");

        txtMaphong.setEditable(false);

        txtMahopdong.setEditable(false);

        txtSua.setText("Sửa");
        txtSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuaActionPerformed(evt);
            }
        });

        cboTrangthai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trống", "Đang sử dụng", "Bảo trì" }));

        btnTaohopdong.setText("Tạo hợp đồng");
        btnTaohopdong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaohopdongActionPerformed(evt);
            }
        });

        btnXemhopdong.setText("Xem hợp đồng");
        btnXemhopdong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemhopdongActionPerformed(evt);
            }
        });

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaphong)
                    .addComponent(txtMahopdong)
                    .addComponent(cboLoaiphong, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMota, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTang)
                        .addComponent(cboTrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(btnTaohopdong)
                .addGap(28, 28, 28)
                .addComponent(txtSua)
                .addGap(30, 30, 30)
                .addComponent(btnXemhopdong)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(txtMaphong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtMahopdong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(cboLoaiphong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaohopdong)
                    .addComponent(txtSua)
                    .addComponent(btnXemhopdong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRoomMouseClicked
        int i=tblRoom.getSelectedRow();
        TableModel model =tblRoom.getModel();
        
        Object mahopdongValue = model.getValueAt(i, 1);
        if (Objects.equals(mahopdongValue, null)) {
        btnTaohopdong.setVisible(true);
        btnXemhopdong.setVisible(false);
        txtMahopdong.setText("Chưa tạo hợp đồng");
    } else {
        txtMahopdong.setText(mahopdongValue.toString());
        btnTaohopdong.setVisible(false);
        btnXemhopdong.setVisible(true);
    }
        
        txtMota.setText(model.getValueAt(i,4).toString());
        
        String trangthaiValue = model.getValueAt(i, 5).toString();
        // Tìm và chọn giá trị tương ứng trong cboTrangthai
        for (int j = 0; j < cboTrangthai.getItemCount(); j++) {
            if (cboTrangthai.getItemAt(j).equals(trangthaiValue)) {
                cboTrangthai.setSelectedIndex(j);
                break;
            }
        }
        
        String loaiPhongValue = model.getValueAt(i, 2).toString();
        // Tìm và chọn giá trị tương ứng trong cboTrangthai
        for (int j = 0; j < cboLoaiphong.getItemCount(); j++) {
            if (cboLoaiphong.getItemAt(j).equals(loaiPhongValue)) {
                cboLoaiphong.setSelectedIndex(j);
                break;
            }
        }
        
        txtTang.setText(model.getValueAt(i,3).toString());
        txtMaphong.setText(model.getValueAt(i,0).toString());
    }//GEN-LAST:event_tblRoomMouseClicked

    private void btnTaohopdongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaohopdongActionPerformed
         Room a=getDataForm();
         HopDong_Form hopdong_Form = new HopDong_Form(a);
         hopdong_Form.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnTaohopdongActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
         Home_Form home_Form = new Home_Form();
         home_Form.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnXemhopdongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemhopdongActionPerformed
        String maphong=txtMaphong.getText();
        String mota=txtMota.getText();
        int tang = Integer.parseInt(txtTang.getText());
        String trangthai=(String) cboTrangthai.getSelectedItem();
        String selected = cboLoaiphong.getSelectedItem().toString();
        String mahopdong=txtMahopdong.getText();
        int loai = loaiPhongMap.get(selected);
        Room room =new Room(maphong,mahopdong,loai,mota,trangthai,tang);
        HopDong_Form hopdong_Form = new HopDong_Form(room);
            hopdong_Form.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnXemhopdongActionPerformed

    private void txtSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuaActionPerformed
        String maphong=txtMaphong.getText();
        String mota=txtMota.getText();
        int tang = Integer.parseInt(txtTang.getText());
        String trangthai=(String) cboTrangthai.getSelectedItem();
        String selected = cboLoaiphong.getSelectedItem().toString();
        int loai = loaiPhongMap.get(selected);
        Room room =new Room(maphong,loai,mota,trangthai,tang);
        Boolean success= roomController.updateRoom(room);
        if(success){
            loadDatatable();
             JOptionPane.showMessageDialog(this, "Cập nhật phòng thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);
        }else{
             JOptionPane.showMessageDialog(this, "Cập nhật phòng thất bại", "Thất bại", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtSuaActionPerformed

    public Room getDataForm(){
        String maphong=txtMaphong.getText();
        String mota=txtMota.getText();
        int tang = Integer.parseInt(txtTang.getText());
        String trangthai=(String) cboTrangthai.getSelectedItem();
        String selected = cboLoaiphong.getSelectedItem().toString();
        String mahopdong=txtMahopdong.getText();
        int loai = loaiPhongMap.get(selected);
        Room a =new Room(maphong,loai,mota,trangthai,tang);
        return a;
    }
    
    
    
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
            java.util.logging.Logger.getLogger(ListRoom_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListRoom_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListRoom_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListRoom_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListRoom_Form().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnTaohopdong;
    private javax.swing.JButton btnXemhopdong;
    private javax.swing.JComboBox<String> cboLoaiphong;
    private javax.swing.JComboBox<String> cboTrangthai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRoom;
    private javax.swing.JTextField txtMahopdong;
    private javax.swing.JTextField txtMaphong;
    private javax.swing.JTextField txtMota;
    private javax.swing.JButton txtSua;
    private javax.swing.JTextField txtTang;
    // End of variables declaration//GEN-END:variables
}
