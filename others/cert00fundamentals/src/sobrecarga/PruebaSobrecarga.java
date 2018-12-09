/** Copyright ESPE-DECC
 */
package sobrecarga;

/**
 *
 * @author edisonlascano
 */
public class PruebaSobrecarga {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal caballo = new Caballo();
        llamar(animal);
        llamar(caballo);
        
        
        Animal animal1 = new Animal();
        //Caballo caballo1 = (Caballo)animal1; //compiles but does not run
        Caballo caballo2 = new Caballo();
        caballo2.comer();
        animal = (Caballo)caballo;
        animal.comer();
         if(animal instanceof Caballo) {
             System.out.println("el animal se hizo caballo");
         }
        
         System.out.println("--< >--");
         Animal caballito = new Caballo();
         caballito.comer();
         System.out.println("Nombre: " + caballito.nombre);
                 
         
    }

    static void llamar(Animal animal) {
        System.out.println(" -- ejecutó animal");
        animal.comer();
    }

    static void llamar(Caballo caballo) {
                System.out.println(" -- ejecutó caballo");

        caballo.comer();
    }

}
