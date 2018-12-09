/** Copyright ESPE-DECC
 */
package cert03fundmentos;

import inicializaciones.*;
import sobreescritura.Animal;

/**
 *
 * @author edisonlascano
 */
public class Bucles extends OperacionesPadre {

    public static void main(String[] args) {

        System.out.println("--> TESTING A LOT OF FORS <--");
        for (int i = 0; i <= 10;) {
            i++;
            System.out.println("i -> " + i);
        }

        /*for (int i = 0, j = 0 ;i<10 && j<10; ){
    
        }*/
        System.out.println("TESTING BREAK and CONTINUE");
        System.out.println("CONTINUE");

        for (int i = 0; i <= 10; i++) {
            System.out.println("valor i -> " + i);
            continue;
        }

        System.out.println("BREAK");
        for (int i = 0; i <= 10; i++) {
            System.out.println("valor i -> " + i);
            break;
        }

        System.out.println("CONTINUE");
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Se ejecutó CONTINUE... se salta las sigueintes sentencias y continúa el bucle");
                continue;
            }
            System.out.println("valor i -> " + i);
        }

        System.out.println("BREAK");
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Se ejecutó BREAK... se sale del bucle");
                break;
            }
            System.out.println("valor i -> " + i);
        }

        System.out.println("ANIDADO");
        for (int i = 0; i <= 4; i++) {
            System.out.println("valor i -> " + i);
            for (int j = 0; j <= 4; j++) {
                System.out.println("  valor j -> " + j);
            }
        }

        System.out.println("ANIDADO con break interno");
        for (int i = 0; i <= 4; i++) {
            System.out.println("valor i -> " + i);
            for (int j = 0; j <= 4; j++) {
                System.out.println("  valor j -> " + j);
                if (j == 2) {
                    break;
                }

            }
        }

        System.out.println("ANIDADO con break interno y rompiendo el break externo");
        for (int i = 0; i <= 4; i++) {
            System.out.println("valor i -> " + i);
            for (int j = 0; j <= 4; j++) {
                System.out.println("  valor j -> " + j);
                if (j == 2) {
                    i = 100;
                    break;
                }

            }
        }

        System.out.println(" --> IMPRIMIENDO ARREGLOS <--");
        Animal[] animales = new Animal[5];
        for (int i = 0; i < 5; i++) {
            Animal animal = new Animal();
            animal.ojos = "ojos " + i;
            animales[i] = animal;
        }

        for (Animal a : animales) {
            System.out.println(" ojos lazo 1 --> " + a.ojos);
            for (Animal animal : animales) {
                System.out.println("   ojos lazo 2 --> " + animal.ojos);
            }
        }

        System.out.println("ROMPIENDO EL LAZO INTERNO");
        for (Animal a : animales) {
            System.out.println(" ojos lazo 1 --> " + a.ojos);
            for (Animal animal : animales) {
                System.out.println("   ojos lazo 2 --> " + animal.ojos);
                break;
            }
        }

        System.out.println("ROMPIENDO LOS DOS LAZOS");
        for1:
        for (Animal a : animales) {
            System.out.println(" ojos lazo 1 --> " + a.ojos);
            for2:
            for (Animal animal : animales) {
                System.out.println("   ojos lazo 2 --> " + animal.ojos);
                break for1;
            }
        }

        System.out.println("ROMPIENDO UN FOR INTERNO Y CON BREAK SALTANDO AL FOR EXTERNO ");
        for (Animal a : animales) {
            System.out.println(" ojos lazo 1 --> " + a.ojos);
            for (Animal animal : animales) {
                System.out.println("   ojos lazo 2 --> " + animal.ojos);
                
            }
            
        }

        System.out.println("ROMPIENDO UN FOR INTERNO Y CON BREAK SALTANDO AL FOR EXTERNO USANDO ETIQUETAS");
        for1:
        for (Animal a : animales) {
            System.out.println(" ojos lazo 1 --> " + a.ojos);
            for2:
            for (Animal animal : animales) {
                System.out.println("   ojos lazo 2 --> " + animal.ojos);
                if (animal.ojos.equals("ojos 1")) {
                    continue for1;
                }
            }
        }

// error de compilacion
//                for (int i = 0; i <= 10; i++) {
//                    continue;
//            System.out.println("valor i -> " + i);
//        }
    }

}
