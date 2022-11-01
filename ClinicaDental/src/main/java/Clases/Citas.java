/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Conexion.Conexion;
import static com.mysql.cj.conf.PropertyKey.logger;
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
 * @author 
 */
public class Citas {
    private String Select_CitasVW = "select * from citas_vw;";
    private String Select_cmbPersonasVW = "select * from cmbpersona_vw;";
    private String Select_cmbProductosVW = "select * from cmbproducto_vw;";
    private String Nombre;
    private String Apellido;
    private String FechaHora;
    private String Producto;
    private String Direccion;
    private String Descripcion;
    private String Estado;



    public Citas() {
    }

    public String getSelect_CitaVw() {
        return Select_CitasVW;
    }

    public void setSelect_CitaVw(String Select_CitasVW) {
        this.Select_CitasVW = Select_CitasVW;
    }

    public String getSelect_cmbPersonaVw() {
        return Select_cmbPersonasVW;
    }

    public void setSelect_cmbPersonaVw(String Select_cmbPersonasVW) {
        this.Select_cmbPersonasVW = Select_cmbPersonasVW;
    }

    public String getSelect_cmbProductoVW() {
        return Select_cmbProductosVW;
    }

    public void setSelect_cmbProductoVW(String Select_cmbProductosVW) {
        this.Select_cmbProductosVW = Select_cmbProductosVW;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getFechaHora() {
        return FechaHora;
    }

    public void setFechaHora(String FechaHora) {
        this.FechaHora = FechaHora;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getProducto() {
        return Producto;
    }
    
    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public DefaultTableModel CargarCita(){
        DefaultTableModel tabla = new DefaultTableModel();
        Conexion conectar = new Conexion();
        try{
            Connection c;
            c = conectar.EstableceConexion();
            Statement stm = c.createStatement();
            ResultSet resultado = stm.executeQuery(this.getSelect_CitaVw());
            ResultSetMetaData md = resultado.getMetaData();
            int columnas = md.getColumnCount();
            for(int i = 1; i<=columnas;i++){
                tabla.addColumn(md.getColumnLabel(i));
            }
            while(resultado.next()){
                Object[] fila = new Object[columnas];
                for(int i = 0;i< columnas;i++){
                    fila[i] = resultado.getObject(i+1);
                }
                tabla.addRow(fila);
                fila = null;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(Citas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabla;
    }
    
    public int InsertarCita(String Nom, String Ape, String FechaHora, String Prod,
                            String Dir, String Desc, String Estado) throws SQLException{
        Conexion c = new Conexion();
        c.EstableceConexion();
        return c.ComandoSQL("Call citas_vw('"+Nom+"','"+Ape+"','"+FechaHora+"','"+Prod+"','"+Dir+"',"
                + "'"+Desc+"','"+Estado+"');");
    }
    
    public int ModificiarCita(String Nom, String Ape, String FechaHora, String Prod,
                              String Dir, String Desc, String Estado)throws SQLException{
        
        Conexion c = new Conexion();
        c.EstableceConexion();
        return c.ComandoSQL("Call update_citas_vw('"+Nom+"','"+Ape+"','"+FechaHora+"','"+Prod+"','"+Dir+"',"
                + "'"+Desc+"','"+Estado+"');");    
    }
    
    public int EliminarCita(int CodCita) throws SQLException{
        Conexion c = new Conexion();
        c.EstableceConexion();
        return c.ComandoSQL("call delete_citas_vw("+CodCita+");");
    }
}
