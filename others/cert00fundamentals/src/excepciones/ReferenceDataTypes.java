/** Copyright ESPE-DECC
 */
package excepciones;

import sobreescritura.Animal;

/**
 *
 * @author edisonlascano
 */
public class ReferenceDataTypes {

    public static void main(String[] args) {

        int[] integers = {1, 2, 3, 4, 5};

        Animal animal = new Animal();
        Animal[] animals = new Animal[3];
        for (int i = 0; i < animals.length; i++) {
            animals[i] = new Animal();
            animals[i].ojos = "light" + i;
        }
        animal.ojos = "cafes";
        String name = "Rayo lento";

        System.out.println("ojos lde caballo " + animal.ojos);
        System.out.println("nombre : " + name);
        for (int i : integers) {
            System.out.print(i + ", ");
        }

        System.out.println("Los ojos del arreglo de animales");
        for (Animal a : animals) {
            System.out.println("the animal has eyes--> " + a.ojos);
        }
        cambiarColorOjos(animals);

        System.out.println("animals after calling cambiarColorOjos");
        for (Animal a : animals) {
            System.out.println("the animal has eyes--> " + a.ojos);
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

    public static void cambiarColorOjos(Animal[] as) {
        for (int i = 0; i < as.length; i++) {
            as[i].ojos = "dark" + i;
        }
        System.out.println("inside the method cambiarAnimales()");
        for (Animal a : as) {
            System.out.println("the animal has eyes--> " + a.ojos);
        }

    }

}
