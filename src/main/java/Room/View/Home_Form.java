/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Room.View;

import HoaDon.View.HoaDon_Form;
import Home.View.Home_Page;
import HopDong.View.HopDong_Form;
import Room.Controller.Room_Controller;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import static java.awt.SystemColor.window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import loaiphong.controller.LoaiPhong_Controller;
import model.Room;

/**
 *
 * @author vinhp
 */
public class Home_Form extends javax.swing.JFrame {

     Room_Controller roomController = new Room_Controller();
     LoaiPhong_Controller loaiphongcontroller = new LoaiPhong_Controller();
    Map<String, Integer> loaiPhongMap=loaiphongcontroller.getLoaiPhongData();;
    ArrayList<Room> rooms = roomController.getRoom();
    ArrayList<Room> contractrooms = roomController.getContractRoom();
     ArrayList<Room> emptyrooms = roomController.getEmptyRoom();
     
     
    public Home_Form() {
        Map<String, Integer> loaiPhongMap = loaiphongcontroller.getLoaiPhongData();
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        productPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));    
        displayRoom();
        setLocationRelativeTo(null);
        pack();
        for (String tenLoaiPhong : loaiPhongMap.keySet()) {
        cboLoai.addItem(tenLoaiPhong);
        }
    
    }
    
private void displayRoom() {
    for (Room room : rooms) {
        JPanel itemPanel = createProductItem(room);
        productPanel.add(itemPanel);
    }
}

private void displayContractRoom() {
    for (Room room : contractrooms) {
        JPanel itemPanel = createProductItem(room);
        productPanel.add(itemPanel);
    }
}

private void displayEmptyRoom() {
    for (Room room : emptyrooms) {
        JPanel itemPanel = createProductItem(room);
        productPanel.add(itemPanel);
    }
}

private JPanel createProductItem(Room room) {
    JPanel itemPanel = new JPanel();
    itemPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    itemPanel.setPreferredSize(new Dimension(100, 100));

    JLabel nameLabel = new JLabel(room.getMaPhong());
    JLabel trangthai = new JLabel(room.getTrangThai());
    itemPanel.add(nameLabel);
    itemPanel.add(trangthai);

    // Thêm MouseListener để bắt sự kiện click chuột phải
    itemPanel.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            showProductOptionsPopup(evt, room, (JFrame)itemPanel.getTopLevelAncestor());
        }
    });

    return itemPanel;
}

private void showProductOptionsPopup(MouseEvent evt, Room room, JFrame currentFrame) {
    JPopupMenu popupMenu = new JPopupMenu();

    JMenuItem viewRoomInfoItem = new JMenuItem("Xem thông tin");
    JMenuItem createBillItem = new JMenuItem("Hoá đơn");
    JMenuItem deleteRoom = new JMenuItem("Xóa");

    // Thêm ActionListener cho mỗi tùy chọn
    viewRoomInfoItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           
            HopDong_Form hopdong_Form = new HopDong_Form(room);
            hopdong_Form.setVisible(true);
            currentFrame.dispose(); // Đóng form hiện tại
        }
    });

    createBillItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(room.getMahopdong()==null){
                 JOptionPane.showMessageDialog(null, "Phòng chưa tạo hợp đồng không thể tạo hóa hóa đơn", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                 return;
            }else{
            HoaDon_Form hoadon_Form = new HoaDon_Form(room);
            hoadon_Form.setVisible(true);
            currentFrame.dispose(); 
        }
        }
    });

    deleteRoom.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                if(room.getMahopdong() != null){
                    JOptionPane.showMessageDialog(null, "Không thể xóa! Còn hợp đồng chưa xử lý", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    roomController.deleteRoom(room.getMaPhong());
                    loadAllRoom();
//                    currentFrame.dispose(); // Đóng form hiện tại
                }
            } 
        }
    });

    // Thêm các tùy chọn vào JPopupMenu
    popupMenu.add(viewRoomInfoItem);
    popupMenu.add(createBillItem);
    popupMenu.add(deleteRoom);

    // Hiển thị JPopupMenu tại vị trí chuột được click
    popupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
}


public boolean kiemTraTrungMaPhong(String maPhong, List<Room> danhSachPhong) {
    for (Room phong : danhSachPhong) {
        if (phong.getMaPhong().equals(maPhong)) {
             JOptionPane.showMessageDialog(this, "Tên phòng đã tồn tại thoát", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return true; // Tồn tại mã phòng trong danh sách
        }
    }
    return false; // Không tìm thấy mã phòng trong danh sách
}
//Load Combobox

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        productPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rdoTrong = new javax.swing.JRadioButton();
        rdoDathue = new javax.swing.JRadioButton();
        rdoTatca = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMota = new javax.swing.JTextField();
        cboLoai = new javax.swing.JComboBox<>();
        cboTang = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cboTrangthai = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtTenphong = new javax.swing.JTextField();
        btnLammoi = new javax.swing.JButton();
        btnDanhsachphong = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        productPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách phòng"));
        productPanel.setLayout(new java.awt.GridLayout(10, 0, 3, 10));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lọc"));

        buttonGroup1.add(rdoTrong);
        rdoTrong.setText("Phòng Trống");
        rdoTrong.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdoTrongItemStateChanged(evt);
            }
        });

        buttonGroup1.add(rdoDathue);
        rdoDathue.setText("Đã Thuê");
        rdoDathue.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdoDathueItemStateChanged(evt);
            }
        });

        buttonGroup1.add(rdoTatca);
        rdoTatca.setText("Tất cả");
        rdoTatca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdoTatcaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rdoDathue, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rdoTrong, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdoTatca, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rdoTrong))
                    .addComponent(rdoTatca))
                .addGap(18, 18, 18)
                .addComponent(rdoDathue)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thêm phòng"));

        jLabel1.setText("Loại phòng");

        jLabel2.setText("Tầng");

        jLabel4.setText("Mô tả");

        cboTang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        jLabel5.setText("Trạng thái");

        cboTrangthai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trống", "Đang sử dụng", "Đang sửa" }));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel6.setText("Tên phòng");

        btnLammoi.setText("Làm mới");
        btnLammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLammoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboTrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMota)
                            .addComponent(cboLoai, 0, 128, Short.MAX_VALUE)
                            .addComponent(cboTang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenphong)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem)
                            .addComponent(btnLammoi))
                        .addGap(56, 56, 56)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTenphong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboTang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(cboTrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnThem)
                .addGap(18, 18, 18)
                .addComponent(btnLammoi)
                .addGap(43, 43, 43))
        );

        btnDanhsachphong.setText("Danh sách phòng");
        btnDanhsachphong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhsachphongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnDanhsachphong, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(productPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnDanhsachphong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Quản lý phòng", jPanel3);

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
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLammoiActionPerformed
        productPanel.removeAll();
        displayRoom();
        productPanel.revalidate();
        productPanel.repaint();
    }//GEN-LAST:event_btnLammoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String name = txtTenphong.getText().toString();
        String selected = cboLoai.getSelectedItem().toString();
        int loai = loaiPhongMap.get(selected);
        int tang = Integer.parseInt(cboTang.getSelectedItem().toString());
        String mota = txtMota.getText().toString();
        String trangthai = cboTrangthai.getSelectedItem().toString();
        if(trangthai.equals("Đang sử dụng")){
            JOptionPane.showMessageDialog(this, "Phòng chưa có hợp đồng vui lòng đặt thành trống", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return;
        }else{
        if (name.isEmpty() || mota.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return; //
        }
        // Kiểm tra xem phòng có tồn tại trong danh sách không
        if (kiemTraTrungMaPhong(name, rooms)==false) {
            Room a = new Room(name, loai, mota, trangthai, tang);
            boolean isSuccess = roomController.addRoom(a);
            if (isSuccess) {
                JOptionPane.showMessageDialog(this, "Thêm phòng thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                loadAllRoom();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm phòng không thành công", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Tên phòng đã tồn tại", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnDanhsachphongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhsachphongActionPerformed
         ListRoom_Form listroom_Form = new ListRoom_Form();
         listroom_Form.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnDanhsachphongActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Home_Page homepage=new Home_Page();
             homepage.setVisible(true);
             this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void rdoTrongItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoTrongItemStateChanged
        if(rdoTrong.isSelected()){
           loadEmptyRoom();
       }
    }//GEN-LAST:event_rdoTrongItemStateChanged

    private void rdoDathueItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoDathueItemStateChanged
        if(rdoDathue.isSelected()){
           loadContractRoom();
       }
    }//GEN-LAST:event_rdoDathueItemStateChanged

    private void rdoTatcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoTatcaItemStateChanged
        if(rdoTatca.isSelected()){
           loadAllRoom();
       }
    }//GEN-LAST:event_rdoTatcaItemStateChanged
    
    public void loadAllRoom(){
                productPanel.removeAll();
                rooms = roomController.getRoom();
                displayRoom();
                productPanel.revalidate();
                productPanel.repaint();
    }
    
    public void loadContractRoom(){
                productPanel.removeAll();
                contractrooms = roomController.getContractRoom();
                displayContractRoom();
                productPanel.revalidate();
                productPanel.repaint();
    }
    
    public void loadEmptyRoom(){
                productPanel.removeAll();
                contractrooms = roomController.getEmptyRoom();
                displayContractRoom();
                productPanel.revalidate();
                productPanel.repaint();
    }
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
//            java.util.logging.Logger.getLogger(Home_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Home_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Home_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Home_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Home_Form().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDanhsachphong;
    private javax.swing.JButton btnLammoi;
    private javax.swing.JButton btnThem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboLoai;
    private javax.swing.JComboBox<String> cboTang;
    private javax.swing.JComboBox<String> cboTrangthai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel productPanel;
    private javax.swing.JRadioButton rdoDathue;
    private javax.swing.JRadioButton rdoTatca;
    private javax.swing.JRadioButton rdoTrong;
    private javax.swing.JTextField txtMota;
    private javax.swing.JTextField txtTenphong;
    // End of variables declaration//GEN-END:variables
}
