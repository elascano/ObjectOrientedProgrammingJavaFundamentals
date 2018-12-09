/** Copyright ESPE-DECC
 */
package ec.edu.espe.oop_fundamentals.overload;

/**
 *
 * @author edisonlascano
 */
public class Horse extends Animal {

    public String name = "Caballo";

    @Override
    public void eat() {
        System.out.println("caballo comiendo sobre escrito");
    }
}
