/** Copyright ESPE-DECC
*/

package inicializaciones;

/**
 *
 * @author edisonlascano
 */
public class OperacionesPadre {

    public OperacionesPadre() {
        System.out.println("Constructor Padre executed ");
    }
    
    {
        System.out.println("bloque padre executed");
    }
    
    static {
        System.out.println("bloque estatico padre executed");
    }
    

}
