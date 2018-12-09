/** Copyright ESPE-DECC
*/

package cert02grades_management.maintenance.impl;

import cert02grades_management.maintenance.FacultyMangementAbstract;
import cert02grades_management.model.Student;
import cert02grades_management.model.Faculty;
import cert02grades_management.model.Person;

/**
 *
 * @author edisonlascano
 */
public class FacultyManagementImpl extends FacultyMangementAbstract{

    @Override
    public Faculty[] addFaculty() {
        Faculty[] faculty=new Faculty[2];
        
        Faculty professor = new Faculty();
        Person person = new Person();
        
        
        person.setName("Daniel");
        person.setLastName("Lascano");
        person.setAddress("montecristi");
        person.setTelephone("1234567");
        person.setCedula("1710893113");
        
        professor.setPersona(person);
        faculty[0]=professor;
        
        person = new Person();
        professor = new Faculty();
        person.setName("Melody");
        person.setLastName("Lascano");
        person.setAddress("Montecristo");
        person.setTelephone("1234567");
        person.setCedula("1710893114");        
        professor.setPersona(person);
        faculty[1]=professor;
        
        return faculty;
    }

    @Override
    public Faculty getFacultyPerCedula(String cedula) {
        Person person = null;
        Faculty professor = null;

        Faculty[] faculty = addFaculty();
        //Person[] persons = addPerson();
        
        for(Faculty d:faculty){
        if(d.getPersona().getCedula().equals(cedula)){
            professor = d;
            break;
            }
        }
        return professor;
    }
}
