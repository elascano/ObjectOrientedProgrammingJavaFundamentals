/** Copyright ESPE-DECC
*/

package collections;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author edisonlascano
 */
public class UsingCollections {
    
    public static void main(String[] args) {
        
        Person person = new Person(1,"edi",1700);
        Collection things;
        things = new ArrayList();
        System.out.println("size at the beginning: " + things.size());
        
        things.add(18000);
        things.add("hello Quito");
        things.add(5000.25F);
        things.add(person);
        
        System.out.println("la lista" + things);
        System.out.println("size at the end " + things.size());
        
        Object[] thingArray = new Object[things.size()];
        
        thingArray=things.toArray();
        
        
        System.out.println("the third element of the array is" + thingArray[2]);
        
        things.remove(5000.25F);
        System.out.println("la lista" + things);
        System.out.println("size at the end " + things.size());
        
        things.add(3);
        things.add(3);        
        things.add(3);

        System.out.println("la lista" + things);
        System.out.println("size at the end " + things.size());
        

        things.remove(3);
        System.out.println("la lista" + things);
        System.out.println("size at the end " + things.size());

        things.add(5);
        things.add(8);        
        things.add(4);
        things.add(8);
        things.add(9);        
        things.add(8);

        System.out.println("la lista" + things);
        System.out.println("size at the end " + things.size());

        things.remove(8);
        System.out.println("la lista" + things);
        System.out.println("size at the end " + things.size());

        things.remove(person);
        System.out.println("la lista" + things);
        System.out.println("size at the end " + things.size());
        
      
        Collection<Integer> integers = new ArrayList<>();
        integers.add(1);
        
        Collection<Person> persons;
        persons = new ArrayList<>();
        
        for (int i = 0 ; i <5 ; i++ ) {
            persons.add(new Person(i+1, "Edison"+(i+1),(i+1)*1000));
        }
        
        persons.forEach((p) -> {
            System.out.println("Person --> " + p);
        });

        
       
        
    }
            

}
