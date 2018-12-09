/** Copyright ESPE-DECC
*/

package polimorphism;

/**
 *
 * @author edisonlascano
 */
public class Car extends Vehicle{

    @Override
    public void changeDoor() {
        System.out.println(" cambio de puerta de carro --> clase Carro");
    }
    
    public void putWing() {
        System.out.println("se puso aleron en --> clase Carro");
    }

}
