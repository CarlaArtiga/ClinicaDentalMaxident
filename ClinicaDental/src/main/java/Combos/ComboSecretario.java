/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Combos;

/**
 *
 * @author LENOVO
 */
public class ComboSecretario {
    private String Secretario;

    public ComboSecretario() {
    }

    public String getSecretario() {
        return Secretario;
    }

    public void setSecretario(String Secretario) {
        this.Secretario = Secretario;
    }
       @Override
    public String toString(){
        return getSecretario();
    }
}
