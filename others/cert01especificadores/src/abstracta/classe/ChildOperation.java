/** Copyright ESPE-DECC
*/

package abstracta.classe;

/**
 *
 * @author edisonlascano
 */
public class ChildOperation extends Operation{

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }

    @Override
    public int divide(int a, int b) {
        return a/b;
    }

}
