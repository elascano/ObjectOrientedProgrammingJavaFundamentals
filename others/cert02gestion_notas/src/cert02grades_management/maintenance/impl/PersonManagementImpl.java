/** Copyright ESPE-DECC
*/

package cert02grades_management.maintenance.impl;

import cert02grades_management.model.Person;
import cert02grades_management.maintenance.PersonManagementInterface;

/**
 *
 * @author edisonlascano
 */
public class PersonManagementImpl implements PersonManagementInterface{

    @Override
    public Person[] addPerson() {
        Person[] persons=new Person[4];
        
        Person person = new Person();
        
        person.setName("Edison");
        person.setLastName("Lascano");
        person.setAddress("Chimbacalle");
        person.setTelephone("1234567");
        person.setCedula("1710893111");
        
        persons[0] = person;
        person = new Person();
        person.setName("Jorge");
        person.setLastName("Lascano0");
        person.setAddress("Chimbastreet");
        person.setTelephone("12345678");
        person.setCedula("1710893112");
        
        persons[1] = person;
        person = new Person();
        person.setName("Daniel");
        person.setLastName("Lascano");
        person.setAddress("montecristi");
        person.setTelephone("1234567");
        person.setCedula("1710893113");

        persons[2] = person;
        person = new Person();
        person.setName("Melody");
        person.setLastName("Lascano");
        person.setAddress("Montecristo");
        person.setTelephone("1234567");
        person.setCedula("1710893114");
        
        persons[3] = person;
        
        return persons;
    }

    @Override
    public Person getPersonPerCedula(String cedula) {
        //Persona persona = new Person();
        Person person = null;
        /*Person[] personas = new Person[4];
        personas = addPerson();
        */
        Person[] persons = addPerson();
        
        for(int i=0; i<persons.length;i++){
            Person obj = persons[i];
        if(obj.getCedula().equals(cedula)){
            person = obj;
            break;
            }
        }
        return person;
    }

    @Override
    public Person getPersonPerCedula2(String cedula) {
        Person person = null;
        Person[] persons = addPerson();
        
        for(Person p:persons){
        if(p.getCedula().equals(cedula)){
            person = p;
            break;
            }
        }
        return person;
    }
}
