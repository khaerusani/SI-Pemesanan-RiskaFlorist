/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indeks;

import florist.koneksi;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author NDR
 */
public class porder extends javax.swing.JPanel {
    Connection conn = new koneksi().conn();
    

    /**
     * Creates new form porder
     */
    public porder() {
        initComponents();
        id();
        harga();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtext = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_order_save = new javax.swing.JButton();
        btn_order_clear = new javax.swing.JButton();
        tf_order_npesan = new javax.swing.JTextField();
        tf_order_kdbunga = new javax.swing.JTextField();
        tf_order_tpesan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_order_konten = new javax.swing.JTextArea();
        cb_order_jpesan = new javax.swing.JComboBox<>();
        cb_order_jbayar = new javax.swing.JComboBox<>();
        tf_order_atagih = new javax.swing.JTextField();
        tf_order_atujuan = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_order_apesan = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        lbl_order_id = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_order_harga = new javax.swing.JLabel();
        tf_order_ntuju = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        dc_order_tgl_kirim = new com.toedter.calendar.JDateChooser();
        dc_order_tgl_bayar = new com.toedter.calendar.JDateChooser();

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Order");

        jLabel2.setText("Nama Pemesan");

        jLabel3.setText("No. Telepon Pemesan");

        jLabel4.setText("Kode Bunga");

        jLabel5.setText("Konten");

        jLabel7.setText("Jenis Pemesan");

        jtext.setText("Jenis Pembayaran");

        jLabel9.setText("Tgl Kirim");

        jLabel10.setText("Alamat Tagihan");

        jLabel11.setText("Tgl Bayar");

        btn_order_save.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btn_order_save.setText("PESAN");
        btn_order_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_order_saveActionPerformed(evt);
            }
        });

        btn_order_clear.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btn_order_clear.setText("CLEAR");
        btn_order_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_order_clearActionPerformed(evt);
            }
        });

        tf_order_kdbunga.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_order_kdbungaFocusLost(evt);
            }
        });
        tf_order_kdbunga.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                tf_order_kdbungaCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        tf_order_kdbunga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_order_kdbungaKeyPressed(evt);
            }
        });

        tf_order_konten.setColumns(20);
        tf_order_konten.setRows(5);
        jScrollPane1.setViewportView(tf_order_konten);

        cb_order_jpesan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individu", "Perusahaan" }));
        cb_order_jpesan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_order_jpesanItemStateChanged(evt);
            }
        });
        cb_order_jpesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_order_jpesanActionPerformed(evt);
            }
        });

        cb_order_jbayar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Pra-Kirim" }));

        tf_order_atagih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_order_atagihActionPerformed(evt);
            }
        });

        jLabel12.setText("Alamat Tujuan");

        jLabel6.setText("Alamat Pemesan");

        jLabel13.setText("ID :");

        lbl_order_id.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N

        jLabel8.setText("Harga :");

        lbl_order_harga.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N

        tf_order_ntuju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_order_ntujuActionPerformed(evt);
            }
        });

        jLabel14.setText("Nama Tujuan");

        dc_order_tgl_kirim.setDateFormatString("yyyy-MM-dd");

        dc_order_tgl_bayar.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel13)
                        .addGap(11, 11, 11)
                        .addComponent(lbl_order_id, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(467, 467, 467)
                        .addComponent(btn_order_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_order_save, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(346, 346, 346)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(tf_order_ntuju, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_order_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tf_order_atagih, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                        .addComponent(tf_order_atujuan, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                        .addComponent(dc_order_tgl_bayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dc_order_tgl_kirim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_order_npesan, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_order_kdbunga, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_order_tpesan, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_order_apesan, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtext)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cb_order_jpesan, 0, 102, Short.MAX_VALUE)
                                            .addComponent(cb_order_jbayar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel11)))))
                            .addComponent(jLabel6))
                        .addGap(62, 62, 62))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lbl_order_id, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_order_npesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cb_order_jpesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_order_tpesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtext, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_order_jbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6))
                    .addComponent(tf_order_apesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tf_order_kdbunga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(tf_order_ntuju, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(tf_order_atujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(tf_order_atagih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(dc_order_tgl_kirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dc_order_tgl_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(lbl_order_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_order_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_order_save, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tf_order_atagihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_order_atagihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_order_atagihActionPerformed

    private void btn_order_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_order_saveActionPerformed
        try {
            String sql = "INSERT INTO pesan (nama_pesan,telp_pesan,jenis_pesan,alamat_pesan,alamat_tujuan,tgl_pesan,tgl_kirim,konten,stat_pesan,kd_bunga) VALUES (?,?,?,?,?,CURDATE(),?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            if(tf_order_npesan.getText().equalsIgnoreCase(null) &&
               tf_order_tpesan.getText().equalsIgnoreCase(null) && 
               tf_order_apesan.getText().equalsIgnoreCase(null) &&
               tf_order_atujuan.getText().equalsIgnoreCase(null) &&
               tf_order_ntuju.getText().equalsIgnoreCase(null) &&
               tf_order_konten.getText().equalsIgnoreCase(null) &&
               tf_order_kdbunga.getText().equalsIgnoreCase(null) &&
               ((JTextField)dc_order_tgl_kirim.getDateEditor().getUiComponent()).getText().equalsIgnoreCase(null) &&
               tf_order_atagih.getText().equalsIgnoreCase(null) &&
               ((JTextField)dc_order_tgl_bayar.getDateEditor().getUiComponent()).getText().equalsIgnoreCase(null)
                    ){
                JOptionPane.showMessageDialog(null, "Form Kosong Atau Salah\n Code: PSN1");
            } else {
            pst.setString(1, tf_order_npesan.getText());
            pst.setString(2, tf_order_tpesan.getText());
            pst.setString(3, cb_order_jpesan.getSelectedItem().toString());
            pst.setString(4, tf_order_apesan.getText());
            pst.setString(5, tf_order_atujuan.getText());
           // pst.setString(6, (Date.valueOf(LocalDate.now())).toString());
            pst.setString(6, ((JTextField)dc_order_tgl_kirim.getDateEditor().getUiComponent()).getText());
            pst.setString(7, tf_order_konten.getText());
            pst.setString(8, tf_order_ntuju.getText());
            pst.setString(9, tf_order_kdbunga.getText());
            
            pst.execute();
            
            try {
                
                String sql1 = "SELECT pesan.id_pesan FROM pesan WHERE nama_pesan='"+tf_order_npesan.getText()+"' AND telp_pesan='"+tf_order_tpesan.getText()+"'";
                ResultSet rs = conn.createStatement().executeQuery(sql1);
                rs.next();
                String id = rs.getString(1);
                try {
                    String a;
                    if(cb_order_jbayar.getSelectedItem().toString().equalsIgnoreCase("Cash")){
                        a = "LUNAS";
                    } else {
                        a = "BELUM LUNAS";
                    }
                    
                    String sql2 = "INSERT INTO bayar(jenis_bayar,alamat_tagih,tgl_bayar,status_pembayaran,id_pesan) values (?,?,?,?,?)";
            
                    PreparedStatement pst1 = conn.prepareStatement(sql2);
                    pst1.setString(1, cb_order_jbayar.getSelectedItem().toString());
                    pst1.setString(2, tf_order_atagih.getText());
                    pst1.setString(3, ((JTextField)dc_order_tgl_bayar.getDateEditor().getUiComponent()).getText());
                    
                    
                    pst1.setString(4, a); 
                    pst1.setString(5, id);
                    
                    pst1.execute();
                    
                    reset();
                    JOptionPane.showMessageDialog(null, "Tersimpan");
                    id();
                } catch (SQLException ex){
                    JOptionPane.showMessageDialog(null, "Form Kosong Atau Salah");
                    Logger.getLogger(porder.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Form Kosong Atau Salah");
                Logger.getLogger(porder.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            }
        } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Form Kosong Atau Salah");
            Logger.getLogger(porder.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btn_order_saveActionPerformed

    private void btn_order_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_order_clearActionPerformed
        reset();
        harga();
    }//GEN-LAST:event_btn_order_clearActionPerformed

    private void cb_order_jpesanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_order_jpesanItemStateChanged
        
    }//GEN-LAST:event_cb_order_jpesanItemStateChanged

    private void cb_order_jpesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_order_jpesanActionPerformed
        Object jpesan = cb_order_jpesan.getSelectedItem();
        String Jpesan = jpesan.toString();
        if(Jpesan.equalsIgnoreCase("Individu")){
            cb_order_jbayar.setSelectedItem("Cash");
            cb_order_jbayar.setEnabled(false);
            tf_order_atagih.setText(tf_order_apesan.getText());
            dc_order_tgl_bayar.setDate(Date.valueOf(LocalDate.now()));
            dc_order_tgl_bayar.setEnabled(false);
        } 
        
    }//GEN-LAST:event_cb_order_jpesanActionPerformed

    private void tf_order_kdbungaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_order_kdbungaKeyPressed
        
    }//GEN-LAST:event_tf_order_kdbungaKeyPressed

    private void tf_order_kdbungaCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tf_order_kdbungaCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_order_kdbungaCaretPositionChanged

    private void tf_order_kdbungaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_order_kdbungaFocusLost
        harga();
    }//GEN-LAST:event_tf_order_kdbungaFocusLost

    private void tf_order_ntujuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_order_ntujuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_order_ntujuActionPerformed

    private void reset(){
        tf_order_npesan.setText("");
        tf_order_tpesan.setText("");
        cb_order_jpesan.setSelectedItem("");
        cb_order_jbayar.setSelectedItem("");
        cb_order_jpesan.setEnabled(true);
        cb_order_jbayar.setEnabled(true);
        tf_order_apesan.setText("");
        tf_order_atujuan.setText("");
        tf_order_atagih.setText("");
        tf_order_kdbunga.setText("");
        tf_order_konten.setText("");
        dc_order_tgl_kirim.setDate(null);
        dc_order_tgl_bayar.setDate(null);
        dc_order_tgl_bayar.setEnabled(true);
        lbl_order_harga.setText("-");
        id();

    }
    
    public void harga(){
        String sqlharga = "SELECT harga FROM bunga WHERE kd_bunga='"+tf_order_kdbunga.getText()+"'";
        try {
            ResultSet stharga = conn.createStatement().executeQuery(sqlharga);
            stharga.next();
            String harga = stharga.getString(1);
            lbl_order_harga.setText(harga);
            lbl_order_harga.setVisible(true);
            
        } catch (SQLException ex) {
            lbl_order_harga.setText("-");
        }
        
    }
    public void id(){
        String sqlid = "SELECT MAX(id_pesan)+1 from pesan";
        try {
            ResultSet stid = conn.createStatement().executeQuery(sqlid);
            stid.next();
            String id = stid.getString(1);
            lbl_order_id.setText(id);
        } catch (SQLException ex) {
            Logger.getLogger(porder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String katorder(String a){
        tf_order_kdbunga.setText(a);
        
        return a;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_order_clear;
    private javax.swing.JButton btn_order_save;
    private javax.swing.JComboBox<String> cb_order_jbayar;
    private javax.swing.JComboBox<String> cb_order_jpesan;
    private com.toedter.calendar.JDateChooser dc_order_tgl_bayar;
    private com.toedter.calendar.JDateChooser dc_order_tgl_kirim;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jtext;
    private javax.swing.JLabel lbl_order_harga;
    private javax.swing.JLabel lbl_order_id;
    private javax.swing.JTextField tf_order_apesan;
    private javax.swing.JTextField tf_order_atagih;
    private javax.swing.JTextField tf_order_atujuan;
    private javax.swing.JTextField tf_order_kdbunga;
    private javax.swing.JTextArea tf_order_konten;
    private javax.swing.JTextField tf_order_npesan;
    private javax.swing.JTextField tf_order_ntuju;
    private javax.swing.JTextField tf_order_tpesan;
    // End of variables declaration//GEN-END:variables
}
