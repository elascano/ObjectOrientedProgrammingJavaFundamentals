/** Copyright ESPE-DECC
 */
package ec.edu.espe.oop_fundamentals.exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;
import ec.edu.espe.oop_fundamentals.overriding.Animal;

/**
 *
 * @author edisonlascano
 */
public class Prueba {
    
    void pruebaException() throws Exception {
        Animal animal = new Animal();
        animal.eyes=null;
        animal.eat();
    }

    public static void main(String[] args) {
        
        Prueba prueba = new Prueba();
        
        Animal animal = null;
        try {
            System.out.println(" el animal --> " + animal.eyes);
        } catch (Exception ex) {
            //ex.printStackTrace();
            System.out.println("Exception --> " + ex.getMessage() + ", Contactese con el administrador");
            System.err.println("Exception --> " + ex.getMessage() + ", Contactese con el administrador");
        }

        System.out.println(" paso el primer try... ");

        Animal animal2 = new Animal();
        animal2.eyes = null;
        try {
            animal2.eat();
        } catch (Exception ex) {
            System.out.println("EL STACKTRACE");
            ex.printStackTrace();
            System.out.println("EL LOGGER");

            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex+"error de Edison");
            
        }
        System.out.println(" paso el segundo try... ");

    }

}
