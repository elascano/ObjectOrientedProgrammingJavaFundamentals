/** Copyright ESPE-DECC
*/

package iniciatializations;

/**
 *
 * @author edisonlascano
 */
public class OperationsParent {

    public OperationsParent() {
        System.out.println("Constructor Padre executed ");
    }
    
    {
        System.out.println("bloque padre executed");
    }
    
    static {
        System.out.println("bloque estatico padre executed");
    }
    

}
