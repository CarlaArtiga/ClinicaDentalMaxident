/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    Statement stm;
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public ResultSet Select;
    
    public Connection EstableceConexion (){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,clave);
            this.stm = this.conectar.createStatement();
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se  pudo hacer la conexion, error: " + e.toString());
        }
        return conectar;
    }

    public ResultSet Select(String query) throws SQLException {
        return this.stm.executeQuery(query);
    }
    
    public int ComandoSQL(String query) throws SQLException{
        return this.stm.executeUpdate(query);
    }
    
}
