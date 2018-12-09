/** Copyright ESPE-DECC
*/

package ec.edu.espe.oop_fundamentals.overriding;

/**
 *
 * @author edisonlascano
 */
public class Horse extends Animal{

    //there is no overriding
    //@Override
    public void addHorse(Horse horse) {
        super.addHorse(horse); //To change body of generated methods, choose Tools | Templates.
    }

    //unchecked exceptions cab be used in overriding without the need of writing this in the parent class
    @Override
    //public Horse returnHorse() throws RuntimeException{
    public Horse returnHorse() {
        return new Horse();
    }

    
    
    
    //if the exepction is checked , we need to implement the same signature in the parent class method
    @Override
    //public void eat() throws SQLException{
    public void eat(){
        //super.eat(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(" --> el caballo come ");
    }

}
