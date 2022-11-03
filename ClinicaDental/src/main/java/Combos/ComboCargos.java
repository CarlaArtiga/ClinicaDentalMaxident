/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Combos;

/**
 *
 * @author LENOVO
 */
public class ComboCargos {
    private int codCargos;
    private String Cargos;

    public ComboCargos() {
    }
    

    public int getCodCargos() {
        return codCargos;
    }

    public void setCodCargos(int codCargos) {
        this.codCargos = codCargos;
    }

    public String getCargos() {
        return Cargos;
    }

    public void setCargos(String Cargos) {
        this.Cargos = Cargos;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return getCargos();
    }
    
    /**
     *
     * @return
     */
    public int toInt(){
        return this.getCodCargos();
    }

    
}
