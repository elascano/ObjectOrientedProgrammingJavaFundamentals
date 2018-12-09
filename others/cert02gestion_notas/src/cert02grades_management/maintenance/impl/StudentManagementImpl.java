/** Copyright ESPE-DECC
*/

package cert02grades_management.maintenance.impl;

import cert02grades_management.maintenance.StudentManagementAbstract;
import cert02grades_management.model.Student;
import cert02grades_management.model.Person;

/**
 *
 * @author edisonlascano
 */
public class StudentManagementImpl extends StudentManagementAbstract{

    @Override
    public Student[] add() {
        Student[] students=new Student[3];
        
        Student student = new Student();
        PersonManagementImpl personManagement= new PersonManagementImpl();
        personManagement.addPerson();
        
        student.setPerson(personManagement.getPersonPerCedula2("1710893111"));
        students[0]=student;
  
        student = new Student();
        student.setPerson(personManagement.getPersonPerCedula2("1710893113"));

        students[1]=student;
        
        student = new Student();
        Person p=personManagement.getPersonPerCedula("1710893114");
        student.setPerson(p);
        students[2]=student;
        
        return students;
    }

    @Override
    public Student getPerCedula(String cedula) {
        
        Person person = null;
        Student student = null;

        Student[] students = add();
        
        for(Student a:students){
        if(a.getPerson().getCedula().equals(cedula)){
            student = a;
            break;
            }
        }
        return student;
    }
}
