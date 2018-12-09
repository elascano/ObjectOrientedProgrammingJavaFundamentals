/** Copyright ESPE-DECC
*/

package sobreescritura;

/**
 *
 * @author edisonlascano
 */
public class Caballo extends Animal{

    //there is no overriding
    //@Override
    public void addCaballo(Caballo caballo) {
        super.addCaballo(caballo); //To change body of generated methods, choose Tools | Templates.
    }

    //unchecked exceptions cab be used in overriding without the need of writing this in the parent class
    @Override
    //public Caballo returnCaballo() throws RuntimeException{
    public Caballo returnCaballo() {
        return new Caballo();
    }

    
    
    
    //if the exepction is checked , we need to implement the same signature in the parent class method
    @Override
    //public void comer() throws SQLException{
    public void comer(){
        //super.comer(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(" --> el caballo come ");
    }

}
