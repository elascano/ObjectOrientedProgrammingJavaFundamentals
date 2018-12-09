/** Copyright ESPE-DECC
*/

package sobrecarga;

import sobreescritura.*;

/**
 *
 * @author edisonlascano
 */
public class Caballo extends Animal{

    public String nombre ="Caballo";
    @Override
    public void comer() {
        System.out.println("caballo comiendo sobre escrito");
    }
}
