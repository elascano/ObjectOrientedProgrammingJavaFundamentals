/** Copyright ESPE-DECC
*/

package estaticos;

/**
 *
 * @author edisonlascano
 */
public class OperacionesHijo extends Operaciones{
    //@Override
    public static void suma(int a, int b) {
        int r = a+b;
        System.out.println("Suma hijo" + r);
    }

}
