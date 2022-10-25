/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.*;
/**
 *
 * @author LENOVO
 */
public class ClaseRegistro {
    
    private String sucursal = "Select * from sucursales";
    Conexion c = new Conexion();

    public ClaseRegistro() {
    c.EstableceConexion();
    
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    
    public ResultSet LlenarCombo() throws SQLException{
        ResultSet rs = null;
       Statement stm = null;
       
       rs = stm.executeQuery("Select * from sucursales");
        return rs;
    }
    
   
}
