/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package florist;


import indeks.porder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NDR
 */
public class indeks_guest extends javax.swing.JPanel {
    
    DefaultTableModel model;
    porder porder = new porder();

    /**
     * Creates new form indeks_guest
     */
    public indeks_guest() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("florist?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        bungaQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Bunga b");
        bungaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : bungaQuery.getResultList();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablekat = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(541, 500));
        setLayout(new java.awt.GridLayout(1, 0));

        tablekat.setRowHeight(100);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, bungaList, tablekat);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${kdBunga}"));
        columnBinding.setColumnName("Kd Bunga");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${jenisBunga}"));
        columnBinding.setColumnName("Jenis Bunga");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${harga}"));
        columnBinding.setColumnName("Harga");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${image}"));
        columnBinding.setColumnName("Gambar");
        columnBinding.setColumnClass(javax.swing.ImageIcon.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        tablekat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablekatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablekat);

        add(jScrollPane1);

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void tablekatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablekatMouseClicked
        int i = tablekat.getSelectedRow();
        if(i>-1){
            
        }
    }//GEN-LAST:event_tablekatMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<florist.Bunga> bungaList;
    private javax.persistence.Query bungaQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablekat;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
