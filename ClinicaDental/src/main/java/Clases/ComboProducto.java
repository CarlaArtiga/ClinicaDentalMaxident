/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author 
 */
public class ComboProducto {
    private int CodProducto;
    private String Producto;

    public ComboProducto() {
    }
    

    public int getCodProducto() {
        return CodProducto;
    }

    public void setCodProducto(int CodProducto) {
        this.CodProducto = CodProducto;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    @Override
    public String toString(){
        return getProducto();
    }
    
    /**
     *
     * @return
     */
    public int toInt(){
        return this.getCodProducto();
    }
}
