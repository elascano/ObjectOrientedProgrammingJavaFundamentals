/** Copyright ESPE-DECC
 */
package overload;

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
