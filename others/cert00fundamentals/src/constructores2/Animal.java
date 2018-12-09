/** Copyright ESPE-DECC
*/

package constructores2;

/**
 *
 * @author edisonlascano
 */
public class Animal extends ServivoAbstracta{

    public Animal(String name) {
        System.out.println("Contructor Animal" + name);
    }
    
    public Animal() {
        System.out.println("Constructor vacio");
    }

}
