/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import Clases.ClaseRegistro;
import Clases.ComboSucursal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.sql.*;

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

    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    public ResultSet Select;

    public Connection EstableceConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, clave);
            this.stm = this.conectar.createStatement();

            //JOptionPane.showMessageDialog(null, "Conexion exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se  pudo hacer la conexion, error: " + e.toString());
        }
        return conectar;
    }

    public ResultSet Select(String query) throws SQLException {
        return this.stm.executeQuery(query);
    }

    public int ComandoSQL(String query) throws SQLException {
        return this.stm.executeUpdate(query);
    }
    
    public ArrayList GetListaSucursal(){
        ArrayList sucursal = new ArrayList();
        ComboSucursal suc;
        ClaseRegistro registro;
        Statement consulta;
        ResultSet resultado;
        try{
            registro = new ClaseRegistro();
            consulta = conectar.createStatement();
            resultado = consulta.executeQuery(registro.getSucursal());
            while(resultado.next()){
                suc = new ComboSucursal();
                suc.setCd(resultado.getInt("CodSucursal"));
                suc.setNom(resultado.getString("Sucursal"));
                sucursal.add(suc);
            }
        }catch(SQLException ex){
        }
        return sucursal;
        
    }

    

}
