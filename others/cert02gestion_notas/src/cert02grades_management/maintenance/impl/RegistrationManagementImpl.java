/** Copyright ESPE-DECC
 */
package cert02grades_management.maintenance.impl;

import cert02grades_management.maintenance.RegistrationMangementAbstract;
import cert02grades_management.model.Student;
import cert02grades_management.model.Classroom;
import cert02grades_management.model.Registration;
import cert02grades_management.model.Person;

/**
 *
 * @author edisonlascano
 */
public class RegistrationManagementImpl extends RegistrationMangementAbstract {

    @Override
    public Registration[] add() {
        Registration[] registrations = new Registration[4];
        Student[] students = new Student[4];
        Classroom[] classrooms = new Classroom[4];

        Registration registration = new Registration();
        StudentManagementImpl studentManagement = new StudentManagementImpl();
        ClassroomManagementImpl classroomManagement = new ClassroomManagementImpl();

        students = studentManagement.add();
        classrooms = classroomManagement.addClassroom();

        registration.setStudent(students[0]);
        registration.setClassroom(classrooms[0]);
        registration.setRegistrationNumber("001");
        
        registrations[0]=registration;
        registration = new Registration();

        registration.setStudent(students[1]);
        registration.setClassroom(classrooms[1]);
        registration.setRegistrationNumber("002");
        
        return registrations;        
    }

    @Override
    public Registration getPerRegistrationNumber(String numeroMatricula) {
        Registration registration = null;

        Registration[] registrations = add();
        
        for(Registration m:registrations){
        if(m.getRegistrationNumber().equals(numeroMatricula)){
            registration = m;
            break;
            }
        }
        return registration;
    }

}
