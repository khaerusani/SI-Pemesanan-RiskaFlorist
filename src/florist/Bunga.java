/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package florist;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.swing.ImageIcon;

/**
 *
 * @author NDR
 */
@Entity
@Table(name = "bunga", catalog = "florist", schema = "")
@NamedQueries({
    @NamedQuery(name = "Bunga.findAll", query = "SELECT b FROM Bunga b"),
    @NamedQuery(name = "Bunga.findByKdBunga", query = "SELECT b FROM Bunga b WHERE b.kdBunga = :kdBunga"),
    @NamedQuery(name = "Bunga.findByJenisBunga", query = "SELECT b FROM Bunga b WHERE b.jenisBunga = :jenisBunga"),
    @NamedQuery(name = "Bunga.findByHarga", query = "SELECT b FROM Bunga b WHERE b.harga = :harga")})
public class Bunga implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kd_bunga")
    private String kdBunga;
    @Basic(optional = false)
    @Column(name = "jenis_bunga")
    private String jenisBunga;
    @Basic(optional = false)
    @Column(name = "harga")
    private String harga;
    @Basic(optional = false)
    @Lob
    @Column(name = "gambar")
    private byte[] gambar;
    
    public ImageIcon getimage(){
        return new ImageIcon(gambar);
    }

    public Bunga() {
    }

    public Bunga(String kdBunga) {
        this.kdBunga = kdBunga;
    }

    public Bunga(String kdBunga, String jenisBunga, String harga, byte[] gambar) {
        this.kdBunga = kdBunga;
        this.jenisBunga = jenisBunga;
        this.harga = harga;
        this.gambar = gambar;
    }

    public String getKdBunga() {
        return kdBunga;
    }

    public void setKdBunga(String kdBunga) {
        String oldKdBunga = this.kdBunga;
        this.kdBunga = kdBunga;
        changeSupport.firePropertyChange("kdBunga", oldKdBunga, kdBunga);
    }

    public String getJenisBunga() {
        return jenisBunga;
    }

    public void setJenisBunga(String jenisBunga) {
        String oldJenisBunga = this.jenisBunga;
        this.jenisBunga = jenisBunga;
        changeSupport.firePropertyChange("jenisBunga", oldJenisBunga, jenisBunga);
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        String oldHarga = this.harga;
        this.harga = harga;
        changeSupport.firePropertyChange("harga", oldHarga, harga);
    }

    public byte[] getGambar() {
        return gambar;
    }

    public void setGambar(byte[] gambar) {
        byte[] oldGambar = this.gambar;
        this.gambar = gambar;
        changeSupport.firePropertyChange("gambar", oldGambar, gambar);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kdBunga != null ? kdBunga.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bunga)) {
            return false;
        }
        Bunga other = (Bunga) object;
        if ((this.kdBunga == null && other.kdBunga != null) || (this.kdBunga != null && !this.kdBunga.equals(other.kdBunga))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "florist.Bunga[ kdBunga=" + kdBunga + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
