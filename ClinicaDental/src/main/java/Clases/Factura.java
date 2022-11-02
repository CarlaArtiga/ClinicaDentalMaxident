/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class Factura {
    private String Select_Factura = "select * from factura;";
    private String Select_Detalle = "select * from Total;";
    private String Select_Cliente = "select DISTINCT Persona as Cliente from citas;";
    private String Select_Dentista = "select DISTINCT Dentista from citas;";
    private String Select_Secretario = "select DISTINCT Secretario from citas;";

    public Factura() {
    }

    public String getSelect_Secretario() {
        return Select_Secretario;
    }

    public void setSelect_Secretario(String Select_Secretario) {
        this.Select_Secretario = Select_Secretario;
    }

    
    public String getSelect_Dentista() {
        return Select_Dentista;
    }

    public void setSelect_Dentista(String Select_Dentista) {
        this.Select_Dentista = Select_Dentista;
    }

    public String getSelect_Cliente() {
        return Select_Cliente;
    }

    public void setSelect_Cliente(String Select_Cliente) {
        this.Select_Cliente = Select_Cliente;
    }

    
    public String getSelect_Detalle() {
        return Select_Detalle;
    }

    public void setSelect_Detalle(String Select_Detalle) {
        this.Select_Detalle = Select_Detalle;
    }

    
    public String getSelect_Factura() {
        return Select_Factura;
    }

    public void setSelect_Factura(String Select_Factura) {
        this.Select_Factura = Select_Factura;
    }
    
    public DefaultTableModel cargarFactura(){
        DefaultTableModel tabla = new DefaultTableModel();
        Conexion conectar = new Conexion();
        try{
            Connection c;
            c = conectar.EstableceConexion();
            Statement stm = c.createStatement();
            ResultSet resultado = stm.executeQuery(this.getSelect_Factura());
            ResultSetMetaData md = resultado.getMetaData();
            int columnas = md.getColumnCount();
            for(int i = 1;i<=columnas;i++){
                tabla.addColumn(md.getColumnLabel(i));
            }
            while(resultado.next()){
                Object[] fila = new Object[columnas];
                for(int i = 0;i<columnas;i++){
                    fila[i] = resultado.getObject(i+1);
                }
                tabla.addRow(fila);
                fila = null;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabla;
    }
    
    public DefaultTableModel cargarDetalle(){
        DefaultTableModel tabla = new DefaultTableModel();
        Conexion conectar = new Conexion();
        try{
            Connection c;
            c = conectar.EstableceConexion();
            Statement stm = c.createStatement();
            ResultSet resultado = stm.executeQuery(this.getSelect_Detalle());
            ResultSetMetaData md = resultado.getMetaData();
            int columnas = md.getColumnCount();
            for(int i = 1;i<=columnas;i++){
                tabla.addColumn(md.getColumnLabel(i));
            }
            while(resultado.next()){
                Object[] fila = new Object[columnas];
                for(int i = 0;i<columnas;i++){
                    fila[i] = resultado.getObject(i+1);
                }
                tabla.addRow(fila);
                fila = null;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabla;
    }
}
