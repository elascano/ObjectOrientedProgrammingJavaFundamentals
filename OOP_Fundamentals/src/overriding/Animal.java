/** Copyright ESPE-DECC
 */
package overriding;

import java.sql.SQLException;

/**
 *
 * @author edisonlascano
 */
public class Animal {

    public String eyes;

    //public void eat() throws SQLException{
    //public void eat() throws Exception {
    public void eat() throws RuntimeException {
        System.out.println(" --> el animal esta comiendo y sus ojos son " + eyes.toString());
    }

    public void eat(int a) {
        System.out.println("en le metodo sobrecargado comer(int a) --> " + a);
    }

    public void eat(String a) {
        System.out.println("en le metodo sobrecargado comer(String a) --> " + a);
    }

    public void eat(String a, String b) {
        System.out.println("en le metodo sobrecargado comer(String a, String b) --> " + a + "," + b);
    }

    public void eat(int a, int b) {
        System.out.println("en le metodo sobrecargado comer(String a, String b) --> " + a + "," + b);
    }

    public void eat(double a, double b) {
        System.out.println("en le metodo sobrecargado comer(String a, String b) --> " + a + "," + b);
    }

    public void eat(Integer a) {
        System.out.println("en le metodo sobrecargado comer(Integer a) --> " + a);
    }

    public void addHorse(Animal animal) {

    }

    public Animal returnHorse() {
        return new Horse();
    }

    @Override
    public String toString() {
        return "soy una clase Animal";
    }

}
