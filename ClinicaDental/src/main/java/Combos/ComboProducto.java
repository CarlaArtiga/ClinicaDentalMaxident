/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Combos;

/**
 *
 * @author LENOVO
 */
public class ComboProducto {
    
    private String Producto;
    
    public ComboProducto() {
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
}
