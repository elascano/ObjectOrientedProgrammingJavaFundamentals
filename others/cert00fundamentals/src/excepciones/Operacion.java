/** Copyright ESPE-DECC
 */
package excepciones;

import sobreescritura.Animal;

/**
 *
 * @author edisonlascano
 */
public class Operacion {

    public float divide(float a, float b) {
        float r = a / b;
        return r;
    }

    public static void main(String[] args) {
        Operacion op = new Operacion();
        float x = 3;
        float y = 0;
        int[] integers = {1, 2, 3, 4, 5};
        System.out.println("la division" + op.divide(x, y));

        Animal animal = new Animal();
        animal.ojos = "cafes";
        String name = "Rayo lento";

        System.out.println("ojos lde caballo " + animal.ojos);
        System.out.println("nombre : " + name);
        for (int i : integers) {
            System.out.print(i + ", ");
        }
        System.out.println();
        cambiarColor(animal, name, integers);
        System.out.println("outside");
        System.out.println("ojos del caballo " + animal.ojos);
        System.out.println("nombre : " + name);
        for (int i : integers) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void cambiarColor(Animal a, String n, int[] is) {
        a.ojos = "blue";
        n = "rayo veloz";
        is = new int[]{6, 7, 8, 9, 0};
        System.out.println("inside");
        for (int i : is) {
            System.out.print(i + ", ");
        }
    }

}
