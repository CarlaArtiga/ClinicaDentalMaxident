/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Conexion {
    Connection conectar = null;
    String usuario = "root";
    String clave = "12345";
    String bd = "clinicadental";
    String ip = "localhost";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection EstableceConexion (){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,clave);
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se  pudo hacer la conexion, error: " + e.toString());
        }
        return conectar;
    }
}
