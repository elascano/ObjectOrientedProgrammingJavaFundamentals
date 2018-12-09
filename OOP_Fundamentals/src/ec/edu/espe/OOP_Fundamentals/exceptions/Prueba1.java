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
public class Prueba1 {
    
    void pruebaException()  {
        Animal animal = new Animal();
        animal.eyes=null;
        animal.eat();
    }

    public static void main(String[] args) {
        
        Prueba1 prueba = new Prueba1();
                prueba.pruebaException();
/*
        try{
        prueba.pruebaException();
        } catch(Exception ex){
            System.out.println("entro a la excepcioj");
        }
        
        System.out.println(" -- corre después de execption");
 */       
    }
}
