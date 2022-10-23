/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ujmd.clinicadental.clases;
import Conexion.Conexion;
import java.sql.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author jose4
 */
public class Login {
    
    static Conexion c = new Conexion();
    //Atributo privado
    private String Acceder = "CALL IngresoSistema(?,?)";
    private String Accesodenegado = "CALL IngresoNoValido(?,?)";
    private String vistausuario = "select * from vistausuario";
    private int columnas = 0;
    private Connection conectar;    

    public Login() {
        c.EstableceConexion();
    }

    public String getAcceder() {
        return Acceder;
    }

    public void setAcceder(String Acceder) {
        this.Acceder = Acceder;
    }

    public String getVistausuario() {
        return vistausuario;
    }

    public void setVistausuario(String vistausuario) {
        this.vistausuario = vistausuario;
    }

    public String getAccesodenegado() {
        return Accesodenegado;
    }

    public void setAccesodenegado(String Accesodenegado) {
        this.Accesodenegado = Accesodenegado;
    }
    
    
    
    public Boolean IngresarUsuario(String Usuarios, int Clave){
        String resultado;
        ResultSet rs = null;
        Statement stm = null;
        //int cuenta=0;
        try {
            
            c.EstableceConexion();           
            CallableStatement cmst = c.EstableceConexion().prepareCall(getAcceder());
            //CallableStatement cmst2 = c.EstableceConexion().prepareCall(getAccesodenegado());
            cmst.setString(1, Usuarios);
            cmst.setInt(2, Clave);
            //if(cuenta != 0){
            //    resultado = "usuario o clave no validos";
            //}
            //else{
            //    resultado = "¡Bienvenido!";
            //}
            
            rs = cmst.executeQuery();
            boolean blExiste = false;
            while (rs.next()){
                blExiste = true;
                
            }
            return blExiste;
            //resultado = "¡Bienvenido!";
            //c.EstableceConexion().close();
        } catch (SQLException sqlex) {
            resultado = " No se realizo la operacion " + sqlex.getMessage();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            resultado = " No se realizo la operacion " + ex.getMessage();
        }
        return false;
    }
    
    public String IngresarUsuarioIncorrecto(String Usuarios, int Clave){
        String resultado;
        try {
            
            c.EstableceConexion();           
            CallableStatement cmst = c.EstableceConexion().prepareCall(getAccesodenegado());
            cmst.setString(1, Usuarios);
            cmst.setInt(2, Clave);
            cmst.execute();
            resultado = "¡Usuario o clave incorrectos!";
            c.EstableceConexion().close();
        } catch (SQLException sqlex) {
            resultado = " No se realizo la operacion " + sqlex.getMessage();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            resultado = " No se realizo la operacion " + ex.getMessage();
        }
        return resultado;
    }    
}
