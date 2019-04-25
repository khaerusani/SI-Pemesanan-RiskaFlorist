/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indeks;

import javax.swing.ImageIcon;

/**
 *
 * @author NDR
 */
public class bunga{
    private String kd;
    private String jenis;
    private String harga;
    private byte[] gambar;
    
    
    public bunga(String bkd,String bjenis, String bharga, byte[] bgambar) {
        this.kd=bkd;
        this.jenis = bjenis;
        this.harga = bharga;
        this.gambar = bgambar;
    }
    
    public String getkd(){
        return kd;
    }
    public String getjenis(){
        return jenis;
    }
    public String getharga(){
        return harga;
    }
    public byte[] getgambar(){
        return gambar;
    }
    

    
    
}
