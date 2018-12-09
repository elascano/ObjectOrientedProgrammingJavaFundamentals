/** Copyright ESPE-DECC
*/

package sobreescritura;

import java.sql.SQLException;

/**
 *
 * @author edisonlascano
 */
public class Animal {
    
    public String ojos;
    
    //public void comer() throws SQLException{
    //public void comer() throws Exception {
    public void comer() throws RuntimeException {
        System.out.println(" --> el animal esta comiendo y sus ojos son " + ojos.toString());
    }

    
    public void comer(int a) {
        System.out.println("en le metodo sobrecargado comer(int a) --> " + a);
    }

    public void comer(String a) {
        System.out.println("en le metodo sobrecargado comer(String a) --> " + a);
    }

        public void comer(String a, String b) {
        System.out.println("en le metodo sobrecargado comer(String a, String b) --> " + a +","+b);
    }

            public void comer(int a, int b) {
        System.out.println("en le metodo sobrecargado comer(String a, String b) --> " + a +","+b);
    }

    public void comer(double a, double b) {
        System.out.println("en le metodo sobrecargado comer(String a, String b) --> " + a +","+b);
    }
            

    public void comer(Integer a) {
        System.out.println("en le metodo sobrecargado comer(Integer a) --> " + a);
    }
    
    
    public void addCaballo(Animal animal) {
        
    }
    
    public Animal returnCaballo() {
        return new Caballo();
    }
    
    @Override
    public String toString() {
        return "soy una clase Animal";
    }

}
