/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package florist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NDR
 */
public class koneksi {
    public koneksi() {
        
    }
    public Connection conn(){
        Connection cn = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
                    cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/florist?zeroDateTimeBehavior=convertToNull","root","");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cn;
    }
    
}
