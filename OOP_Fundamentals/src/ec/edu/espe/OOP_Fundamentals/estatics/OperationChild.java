/** Copyright ESPE-DECC
*/

package ec.edu.espe.oop_fundamentals.estatics;

/**
 *
 * @author edisonlascano
 */
public class OperationChild extends Operation{
    
    

//@Override
    public static void add(int a, int b) {
        int r = a+b;
        System.out.println("Suma hijo" + r);
    }

}
