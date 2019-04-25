/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package florist;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author NDR
 */
public class Florist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        login depan = new login();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        depan.setLocation(dim.width/2-depan.getSize().width/2, dim.height/2-depan.getSize().height/2);
        depan.setVisible(true);
        //katalog kat = new katalog();
        //kat.setVisible(true);
    }
    
}
