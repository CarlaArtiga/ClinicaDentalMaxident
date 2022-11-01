/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author 
 */
public class ComboNombres {
    private int CodPersona;
    private String Nombre;

    public ComboNombres() {
    }
    

    public int getCodPersona() {
        return CodPersona;
    }

    public void setCodPersona(int CodPersona) {
        this.CodPersona = CodPersona;
    }

    public String getNombres() {
        return Nombre;
    }

    public void setNombres(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString(){
        return getNombres();
    }
    
    /**
     *
     * @return
     */
    public int toInt(){
        return this.getCodPersona();
    }
}
