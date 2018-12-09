/** Copyright ESPE-DECC
*/

package controller;

import abstracta.classe.ChildOperation;
import abstracta.classe.Operation;
import beans.User;
import estaticos.Utils;

/**
 *
 * @author edisonlascano
 */
public class UsingTheController extends RolController{
    
    public static void main(String[] args) {
        RolController obj = new RolController();
        System.out.println("From Test...");
        obj.saveRol();
        
        
        User user = new User();
        user.setId(1);
        user.setLastName("Lascano");
        user.setName("Jorge Edison");
        user.setAddress("Chimbacalle");
        user.setLogin("elascano");
        user.setPassword("secret");
        user.setPhoneNumber("1234567");
        
        System.out.println("-- Id --> " + user.getId()+
                ", LastName --> " + user.getLastName()+
                ", Name --> " + user.getName());
        
        Operation operations = new ChildOperation();
        System.out.println("Using 2 and 3 for the next operations \n Addition -> " +operations.add(2, 3) + 
                ", Substraction -> "+ operations.sub(2, 3) + 
                ", Multiplication -> "+ operations.multiply(2, 3) +
                ", Division -> " + operations.divide(2, 3));
        
          Utils utils = new Utils(); // just a test , it does not serve
        System.out.println("the average is , (using a static class) -> " + (double)(Utils.computeAverage(1, 2)));
        System.out.println("the average is , (using a static class) -> " + (double)(utils.compute()));

    }

           

}
