/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author LENOVO
 */
public class ComboSucursal {
    private int cd;
    private String nom;

    public ComboSucursal() {
    }

    public ComboSucursal(int cd, String nom) {
        this.cd = cd;
        this.nom = nom;
    }

    public int getCd() {
        return cd;
    }

    public void setCd(int cd) {
        this.cd = cd;
    }
    
     @Override
    public String toString(){
        return getNom();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    /**
     *
     * @return
     */
   
}
