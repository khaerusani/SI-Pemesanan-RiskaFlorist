/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indeks;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import florist.about;
import java.awt.Dimension;
import java.awt.Toolkit;
import florist.login;
import java.awt.GraphicsEnvironment;
import florist.indeks_guest;

/**
 *
 * @author NDR
 */
public class frame_indeks extends javax.swing.JFrame {
    GridBagLayout grid = new GridBagLayout();
    padmin padmin;
    porder porder;
    pstatus pstatus;
    pkosong pkosong;
    katalog pkatalog;
    indeks_guest kat;
    
    
    
    
    

    /**
     * Creates new form frame_indeks
     */
    public frame_indeks() {
        initComponents();
        GraphicsEnvironment env =
        GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.setMaximizedBounds(env.getMaximumWindowBounds());
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
        this.setName("Riska Florist");
        menu_name.setEnabled(false);
        
        
        padmin = new padmin();
        porder = new porder();
        pstatus = new pstatus();
        pkosong = new pkosong();
        pkatalog = new katalog();
        kat = new indeks_guest();
        
        panel2.setLayout(grid);
        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx=0;
        gc.gridy=0;
        panel2.add(padmin, gc);
        panel2.add(porder, gc);
        panel2.add(pstatus, gc);
        panel2.add(pkosong,gc);
        panel2.add(pkatalog,gc);
        panel2.add(kat, gc);
        
        padmin.setVisible(false);
        porder.setVisible(false);
        pstatus.setVisible(false);
        pkatalog.setVisible(false);
        kat.setVisible(false);
        pkosong.setVisible(true);
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        panel1 = new javax.swing.JPanel();
        btn_order = new javax.swing.JButton();
        btn_status = new javax.swing.JButton();
        btn_akun = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_name = new javax.swing.JMenuItem();
        menu_login = new javax.swing.JMenuItem();
        menulogout = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        kbunga = new javax.swing.JMenuItem();
        kguest = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menutentang = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        panel1.setBackground(new java.awt.Color(0, 153, 51));

        btn_order.setText("ORDER");
        btn_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_orderActionPerformed(evt);
            }
        });

        btn_status.setText("STATUS");
        btn_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_statusActionPerformed(evt);
            }
        });

        btn_akun.setText("AKUN");
        btn_akun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_akunActionPerformed(evt);
            }
        });

        btn_logout.setText("LOGOUT");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_order, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_akun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_logout, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_order, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_status, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(btn_akun, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_logout))
        );

        jInternalFrame1.getContentPane().add(panel1, java.awt.BorderLayout.LINE_START);

        panel2.setBackground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 751, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );

        jInternalFrame1.getContentPane().add(panel2, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Profile");
        jMenu1.add(menu_name);

        menu_login.setText("Login");
        menu_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_loginActionPerformed(evt);
            }
        });
        jMenu1.add(menu_login);

        menulogout.setText("Logout");
        menulogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menulogoutActionPerformed(evt);
            }
        });
        jMenu1.add(menulogout);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Katalog");

        kbunga.setText("Katalog Bunga");
        kbunga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbungaActionPerformed(evt);
            }
        });
        jMenu2.add(kbunga);

        kguest.setText("Katalog");
        kguest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kguestActionPerformed(evt);
            }
        });
        jMenu2.add(kguest);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Bantuan");

        menutentang.setText("Tentang");
        menutentang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menutentangActionPerformed(evt);
            }
        });
        jMenu3.add(menutentang);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_orderActionPerformed
       
        if(porder.isVisible()){
                    
        padmin.setVisible(false);
        porder.setVisible(false);
        pstatus.setVisible(false);
        pkatalog.setVisible(false);
        pkosong.setVisible(true);
        kat.setVisible(false);
        } else {
        padmin.setVisible(false);
        porder.setVisible(true);
        pstatus.setVisible(false);
        pkatalog.setVisible(false);
        pkosong.setVisible(false);
        kat.setVisible(false);
        }   
    }//GEN-LAST:event_btn_orderActionPerformed

    private void btn_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_statusActionPerformed
        if(pstatus.isVisible()){
        padmin.setVisible(false);
        porder.setVisible(false);
        pstatus.setVisible(false);
        pkatalog.setVisible(false);
        pkosong.setVisible(true);
        
        } else {
        padmin.setVisible(false);
        porder.setVisible(false);
        pstatus.setVisible(true); 
        pstatus.tampil();
        pkatalog.setVisible(false);
        pkosong.setVisible(false);
            
        }
     
    }//GEN-LAST:event_btn_statusActionPerformed

    private void btn_akunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_akunActionPerformed
        if(padmin.isVisible()){
        padmin.setVisible(false);
        porder.setVisible(false);
        pstatus.setVisible(false); 
        pkatalog.setVisible(false);
        pkosong.setVisible(true);
        } else {
        padmin.setVisible(true);
        porder.setVisible(false);
        pstatus.setVisible(false);
        pkatalog.setVisible(false);
        pkosong.setVisible(false);
            
        }
    }//GEN-LAST:event_btn_akunActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        login log = new login();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        log.setLocation(dim.width/2-log.getSize().width/2, dim.height/2-log.getSize().height/2);
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void menutentangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menutentangActionPerformed
        about tentang = new about();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        tentang.setLocation(dim.width/2-tentang.getSize().width/2, dim.height/2-tentang.getSize().height/2);
        tentang.setVisible(true);
    }//GEN-LAST:event_menutentangActionPerformed

    private void menulogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menulogoutActionPerformed
        login log = new login();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        log.setLocation(dim.width/2-log.getSize().width/2, dim.height/2-log.getSize().height/2);
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menulogoutActionPerformed

    private void kbungaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbungaActionPerformed

        if(pkatalog.isVisible()){
        padmin.setVisible(false);
        porder.setVisible(false);
        pstatus.setVisible(false);
        pkatalog.setVisible(false);
        pkosong.setVisible(true);
        } else {
        pkatalog.setVisible(true);
        porder.setVisible(false);
        pstatus.setVisible(false);  
        padmin.setVisible(false);
        pkosong.setVisible(false);
        }
    }//GEN-LAST:event_kbungaActionPerformed

    private void kguestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kguestActionPerformed
        if(kat.isVisible()){
            porder.setVisible(false);
            kat.setVisible(false);
            pkosong.setVisible(true);
        }else{
            porder.setVisible(false);
            kat.setVisible(true);
            pkosong.setVisible(false);
        }
        
    }//GEN-LAST:event_kguestActionPerformed

    private void menu_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_loginActionPerformed
         
        login log = new login();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        log.setLocation(dim.width/2-log.getSize().width/2, dim.height/2-log.getSize().height/2);
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu_loginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        frame_indeks.setDefaultLookAndFeelDecorated(true);
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
            java.util.logging.Logger.getLogger(frame_indeks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame_indeks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame_indeks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame_indeks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frame_indeks indeks = new frame_indeks();
                indeks.setVisible(true);
                
                
                
            }
        });
    }
    
    public String name(String name){
        menu_name.setText("Hi, "+name);
        
        return name;
    }
    
    public Boolean notguest(boolean x){
        btn_akun.setVisible(x);
        btn_logout.setVisible(x);
        btn_status.setVisible(x);
        kbunga.setVisible(x);
        kguest.setVisible(!x);
        kat.setVisible(!x);
        pkosong.setVisible(x);
        menulogout.setVisible(x);
        menu_login.setVisible(!x);
        return x;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_akun;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_order;
    private javax.swing.JButton btn_status;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem kbunga;
    private javax.swing.JMenuItem kguest;
    private javax.swing.JMenuItem menu_login;
    private javax.swing.JMenuItem menu_name;
    private javax.swing.JMenuItem menulogout;
    private javax.swing.JMenuItem menutentang;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    // End of variables declaration//GEN-END:variables
}
