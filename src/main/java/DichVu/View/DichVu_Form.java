/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DichVu.View;


import AllowNumber.CustomDocumentFilter;
import DichVu.Controller.DichVu_Controller;
import Home.View.Home_Page;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.AbstractDocument;
import model.DichVu;

import model.LoaiPhong;
import model.Room;

/**
 *
 * @author vinhp
 */
public class DichVu_Form extends javax.swing.JFrame {

    DichVu_Controller dichvuCtrl = new DichVu_Controller();
    ArrayList<DichVu> dichvus = dichvuCtrl.getDichVu();
    DefaultTableModel model;
    public DichVu_Form() {
        initComponents();
        setLocationRelativeTo(null);
        AllowNumber();
        loadDatatable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        txtTengoi = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        txtMota = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLammoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDichvu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản Lý Dịch Vụ");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(86, 86, 86)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Form"));

        jLabel2.setText("Mã dịch vụ");

        jLabel3.setText("Tên gói");

        jLabel4.setText("Giá");

        jLabel5.setText("Mô tả");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLammoi.setText("Làm Mới");
        btnLammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLammoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(btnThem)
                .addGap(50, 50, 50)
                .addComponent(btnSua)
                .addGap(49, 49, 49)
                .addComponent(btnXoa)
                .addGap(53, 53, 53)
                .addComponent(btnLammoi)
                .addContainerGap(199, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnLammoi)
                    .addComponent(btnSua)
                    .addComponent(btnThem))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTengoi, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMota, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(41, 41, 41)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTengoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        tblDichvu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã dịch vụ", "Giá", "Tên gói dịch vụ", "Mô tả"
            }
        ));
        tblDichvu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDichvuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDichvu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 776, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void tblDichvuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDichvuMouseClicked
        int i=tblDichvu.getSelectedRow();
        btnThem.setEnabled(false);
        TableModel model =tblDichvu.getModel();
        Object mahopdongValue = model.getValueAt(i, 1);
        txtId.setText(model.getValueAt(i,0).toString()); 
        txtTengoi.setText(model.getValueAt(i,2).toString());
        txtGia.setText(model.getValueAt(i,1).toString());
        txtMota.setText(model.getValueAt(i,3).toString());
    }//GEN-LAST:event_tblDichvuMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
       DichVu a=getObj();
        
        Boolean success=dichvuCtrl.updateDichVu(a);
        if(success){
            loadDatatable();
            clear();
             JOptionPane.showMessageDialog(this, "Cập nhập dịch vụ thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);
        }else{
             JOptionPane.showMessageDialog(this, "Cập nhập dịch vụ thất bại", "Thất bại", JOptionPane.ERROR_MESSAGE);
        }
         
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        String id=txtId.getText();
        Boolean success=dichvuCtrl.deleteDichVu(id);
        if(success){
            loadDatatable();
            clear();
             JOptionPane.showMessageDialog(this, "xóa dịch vụ thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);
        }else{
             JOptionPane.showMessageDialog(this, "xóa dịch vụ thất bại", "Thất bại", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String id=txtId.getText().toString();
        String name=txtTengoi.getText().toString();
        String mota=txtMota.getText().toString();
        int gia=Integer.parseInt(txtGia.getText());
        DichVu a=new DichVu(id,name,gia,mota);
        if(kiemTraTrungMaDV(a.getId(),a.getTengoi(), dichvus)==false){
               Boolean success=dichvuCtrl.insertDichVu(a);
        if(success){
             clear();
             loadDatatable();
             JOptionPane.showMessageDialog(this, "Thêm dịch vụ thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);
        }else{
             JOptionPane.showMessageDialog(this, "Thêm dịch vụ thất bại", "Thất bại", JOptionPane.ERROR_MESSAGE);
        }
            
         }else {
            JOptionPane.showMessageDialog(this, "Tên dịch vụ hoặc mã dịch vụ đã tồn ", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return;
         }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnLammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLammoiActionPerformed
        clear();
    }//GEN-LAST:event_btnLammoiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Home_Page homepage=new Home_Page();
        homepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DichVu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DichVu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DichVu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DichVu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DichVu_Form().setVisible(true);
//            }
//        });
//    }
    
   
    
    public void clear(){
        txtId.setText("");
        txtTengoi.setText("");
        txtMota.setText("");
        btnThem.setEnabled(true);
        AbstractDocument doc = (AbstractDocument) txtGia.getDocument();
        doc.setDocumentFilter(null); // Gỡ bỏ bộ lọc hiện tại
        txtGia.setText("");
        doc.setDocumentFilter(new CustomDocumentFilter());
     }
    
    public DichVu getObj(){
         String id =txtId.getText();
         String name=txtTengoi.getText();
         String mota=txtMota.getText();
         int gia=Integer.parseInt(txtGia.getText());
         DichVu a =new DichVu(id,name,gia,mota);
         return a;
     }
    
    public void loadDatatable(){
        dichvus=dichvuCtrl.getDichVu();
        model = (DefaultTableModel) tblDichvu.getModel();
        model.setRowCount(0);
         for (DichVu c : dichvus) {
            Object[] rowData = {c.getId(), c.getGia(),c.getTengoi(),c.getMota()};
            model.addRow(rowData);
        }
         
    }
     
   
public void AllowNumber() {
    AbstractDocument doc5 = (AbstractDocument) txtGia.getDocument();
    doc5.setDocumentFilter(new CustomDocumentFilter());
 
}

public boolean kiemTraTrungMaDV(String madichvu,String tengoi, List<DichVu> danhSachDichVu) {
    for (DichVu dv : dichvus) {
        if (dv.getId().equals(madichvu)||dv.getTengoi().equals(tengoi)) {
             JOptionPane.showMessageDialog(this, "Mã dịch vụ hoặc tên gói dịch vụ đã tồn tại ", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return true; // Tồn tại mã phòng trong danh sách
        }
    }
    return false; // Không tìm thấy mã phòng trong danh sách
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLammoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDichvu;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMota;
    private javax.swing.JTextField txtTengoi;
    // End of variables declaration//GEN-END:variables
}
