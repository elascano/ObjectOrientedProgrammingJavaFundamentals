/** Copyright ESPE-DECC
*/

package estaticos;

import beans.User;

/**
 *
 * @author edisonlascano
 */
public class Utils {

    public static double computeAverage(double a, double b) {
        double average = (a+b)/2;
        return average;
    }
    
    public double compute(){
        return computeAverage(2, 3);
    }
    
    public double add(double ...b) {
        return 0;
    }
    
    public double add(String ...a) {
        return 0;
    }
    
        public double add(String b, int ...a) {
        return 0;
    }

    public void add(double a){
        int[] op;
        int[] op2 = new int[5];
        int size=10;
        int[] op3 = new int[size];

        op2[0] = 1;
        op3[5] = 3;
    }

    public void test(){
        add(1,2,3,4,5);
        add("Hello",1,2,3,4);
        String [] arguments;
        String arguments2[]; // incorrect
        
        User [] users[]; // incorrect
        
        User [][] users2;
        
        
        
    }

}
