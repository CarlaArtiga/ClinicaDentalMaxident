/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Combos;

/**
 *
 * @author LENOVO
 */
public class ComboDentista {
    private String Dentista;

    public ComboDentista() {
    }

    public String getDentista() {
        return Dentista;
    }

    public void setDentista(String Dentista) {
        this.Dentista = Dentista;
    }
     @Override
    public String toString(){
        return getDentista();
    }
}
