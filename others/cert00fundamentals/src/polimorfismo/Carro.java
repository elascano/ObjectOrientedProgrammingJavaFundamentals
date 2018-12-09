/** Copyright ESPE-DECC
*/

package polimorfismo;

/**
 *
 * @author edisonlascano
 */
public class Carro extends Vehiculo{

    @Override
    public void cambiarPuerta() {
        System.out.println(" cambio de puerta de carro --> clase Carro");
    }
    
    public void ponerAleron() {
        System.out.println("se puso aleron en --> clase Carro");
    }

}
