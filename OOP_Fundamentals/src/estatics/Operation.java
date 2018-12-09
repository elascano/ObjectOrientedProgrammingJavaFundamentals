/** Copyright ESPE-DECC
*/


package estatics;

/**
 *
 * @author edisonlascano
 */
public class Operation {
    
    int variableNoEstatica;
    static int variableEstatica;
    static int operand1=0;
    
    public Operation() {
        operand1=operand1+1;
    }
    
    
    
    public static void add(int a, int b) {
        System.out.println(" se sumó " + (a+b));
        //variableNoEstatica=10; // no es estatica no hay acceso
        variableEstatica = 0;
        
    }
        public void sub(int a, int b) {
        System.out.println(" se restó " + (a+b));
        add(1,-2);
    }
    
    
        public static void main(String[] args) {
        add(4,5);
        //sub(1,2); sub no es static
        
        Operation.add(4, 2);
        Operation op = new Operation();
        op.sub(5, 2);
        OperationChild.add(3, 4);
        Operation op2 = new OperationChild();
        op2.sub(3, 4);
        
        Operation op3= new Operation();
        System.out.println("op3 -> " + op3.operand1);

        op3= new Operation();
        System.out.println("op3 -> " + op3.operand1);
        
        op3= new Operation();
        System.out.println("op3 -> " + op3.operand1);
    }
}
