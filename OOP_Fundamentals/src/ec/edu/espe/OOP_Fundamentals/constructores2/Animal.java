/** Copyright ESPE-DECC
*/

package ec.edu.espe.OOP_Fundamentals.constructores2;

/**
 *
 * @author edisonlascano
 */
public class Animal extends LivingBeingAbstract{

    public Animal(String name) {
        System.out.println("Contructor Animal" + name);
    }
    
    public Animal() {
        System.out.println("Constructor vacio");
    }

}
