/** Copyright ESPE-DECC
*/

package estaticos;

/**
 *
 * @author edisonlascano
 */
public class Operaciones {
    
    int variableNoEstatica;
    static int variableEstatica;
    static int a=0;
    
    public Operaciones() {
        a=a+1;
    }
    
    
    
    public static void suma(int a, int b) {
        System.out.println(" se sumó " + (a+b));
        //variableNoEstatica=10; // no es estatica no hay acceso
        variableEstatica = 0;
        
    }
        public void resta(int a, int b) {
        System.out.println(" se restó " + (a+b));
        suma(1,-2);
    }
    
    
        public static void main(String[] args) {
        suma(4,5);
        //resta(1,2); resta no es static
        
        Operaciones.suma(4, 2);
        Operaciones op = new Operaciones();
        op.resta(5, 2);
        OperacionesHijo.suma(3, 4);
        Operaciones op2 = new OperacionesHijo();
        op2.resta(3, 4);
        
        Operaciones op3= new Operaciones();
        System.out.println("op3 -> " + op3.a);

        op3= new Operaciones();
        System.out.println("op3 -> " + op3.a);
        
        op3= new Operaciones();
        System.out.println("op3 -> " + op3.a);
    }
}
