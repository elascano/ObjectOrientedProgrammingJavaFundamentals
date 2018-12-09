/** Copyright ESPE-DECC
*/

package exceptions;

/**
 *
 * @author edisonlascano
 */
public class Operation {
    
    public float divide(float a, float b) {
    float r = a/b;
        return r;
    }

    public static void main(String[] args) {
        Operation op = new Operation();
        float x=3;
        float y = 0;
        try{
        System.out.println("la division" + op.divide(x,y));
        }
        catch(Exception ex){
            System.out.println("error on division");
        }

    }
}
