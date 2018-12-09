/** Copyright ESPE-DECC
 */
package ec.edu.espe.oop_fundamentals.iniciatializations;

import ec.edu.espe.oop_fundamentals.overriding.Animal;

/**
 *
 * @author edisonlascano
 */
public class Operations2 extends OperationsParent {

    int a;
    int b;
    static int c;
    static int d;

    OperationsParent operationsParent;

    public void sumar() {
        Operations2 op;

        //System.out.println("aja -> " + op.a); // error por no estar inicializado
        operationsParent.getClass(); // es un objeto del objeto, entonces si funciona. no hace falta inicializar.
    }

    {
        a = 1;
        b = 2 + a;
        System.out.println("bloque 1 is executed");
    }

    {
        System.out.println("bloque 2 is executed");
    }

    static {
        c = 5;
        d = 8;
        System.out.println("bloque estatico 1 executed");
    }

    static {
        System.out.println("bloque estatico 2 executed");
    }

    public Operations2() {
        //super();
        System.out.println("hola , se inicializó: a: " + a + ", b: " + b);
        System.out.println("constructor is executed");

        {

        }

    }

    public static void main(String[] args) {

        int a;
        Operations2 op = new Operations2();
        {
            a = 1;

        }

        int entero;
        Integer integer = 2;
        integer.floatValue();

        double d = integer.floatValue();

        Double d2 = 10.5;
        System.out.println("-> " + d2.intValue());
        String string = d2.toString();
        System.out.println("--> " + string);

        //string concatenations
        String name = "Edison";
        String lastname = "Lascano";

        String fullName = name + " " + lastname;

        int aa = 2;
        int cc = 3;

        Animal animalbb = a == 1 ? new Animal() : null;

        Animal animalaa = a == 2 ? c == 3 ? new Animal() : null : null; //this is true and animalaa was initialized
        Animal animalcc = a == 1 ? c == 3 ? new Animal() : null : null; //this is null        

        Animal animal = null;

        if (animal != null && animal == null & animal.eyes.equals("ooo")) {
            System.out.println(" un doble ampersand");
        }

        //if(animal!=null & animal==null & animal.eyes.equals("ooo")){
        //    System.out.println(" naranjas todo Exception");
        //}
     
    }

}
