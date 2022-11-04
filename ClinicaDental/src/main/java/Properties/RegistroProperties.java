/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public final class RegistroProperties {
    public static Properties prop = new Properties();
    InputStream is = null;
    
    public static Properties getProp() {
        return prop;
    }
    public  RegistroProperties() throws IOException {
        leerPropiedades();
    }


    public static void setProp(Properties prop) {
        RegistroProperties.prop = prop;
    }

    public void leerPropiedades() throws FileNotFoundException, IOException {
        //is = new FileInputStream(System.getProperty("user.dir") + "\\src\\propiedades\\propiedades.properties");   
        is = new FileInputStream(System.getProperty("user.dir") + "\\Propiedades.properties");
        //is = new FileInputStream(System.getProperty("Propiedades.properties"));    
        prop.load(is);       
    }    
    
}
