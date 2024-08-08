/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOHelper {
    
   protected Connection conectar;
   private final String Driver = "com.mysql.cj.jdbc.Driver";
   private final String URL = "jdbc:mysql://localhost:3307/libreria";
   private final String Usuario = "root";
   private final String Contra = "";
    public void Conex() throws ClassNotFoundException{
       try {
           conectar=DriverManager.getConnection(URL, Usuario,Contra);
           Class.forName(Driver);
       } catch (SQLException ex) {
           Logger.getLogger(DAOHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    public void cerrar() throws SQLException{
        if (conectar!=null){
            if (!conectar.isClosed()){
                conectar.close();
            }
        }
    }
}
    
