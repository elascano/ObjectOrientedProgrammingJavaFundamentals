/** Copyright ESPE-DECC
 */
package overload;

/**
 *
 * @author edisonlascano
 */
public class PruebaSobrecarga {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal horse = new Horse();
        PruebaSobrecarga.call(animal);
        PruebaSobrecarga.call(horse);

        Animal animal1 = new Animal();
        //Caballo caballo1 = (Horse)animal1; //compiles but does not run
        Horse horse2 = new Horse();
        horse2.eat();
        animal = (Horse) horse;
        animal.eat();
        if (animal instanceof Horse) {
            System.out.println("el animal se hizo caballo");
        }

        System.out.println("--< >--");
        Animal horsey = new Horse();
        horsey.eat();
        System.out.println("Nombre: " + horsey.name);

    }

    static void call(Animal animal) {
        System.out.println(" -- ejecutó animal");
        animal.eat();
    }

    static void call(Horse horse) {
        System.out.println(" -- ejecutó caballo");

        horse.eat();
    }

}
