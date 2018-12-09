/** Copyright ESPE-DECC
 */
package cert02grades_management.maintenance.impl;

import cert02grades_management.model.Classroom;
import cert02grades_management.model.Person;
import cert02grades_management.maintenance.ClassroomManagementInterface;

/**
 *
 * @author edisonlascano
 */
public class ClassroomManagementImpl implements ClassroomManagementInterface {

    @Override
    public Classroom[] addClassroom() {
        Classroom[] classrooms = new Classroom[4];

        Classroom classroom = new Classroom();

        classroom.setName("203");
        classroom.setSection("progra II");

        classrooms[0] = classroom;
        classroom = new Classroom();

        classroom.setName("303");
        classroom.setSection("progra Av");

        classrooms[1] = classroom;
        classroom = new Classroom();

        classroom.setName("403");
        classroom.setSection("Software I");

        classrooms[2] = classroom;

        return classrooms;
    }

    @Override
    public Classroom getClassroomPerName(String name) {
        Classroom classroom = null;
        Classroom[] classrooms = addClassroom();
        
        for(Classroom a:classrooms){
        if(a.getName().equals(name)){
            classroom = a;
            break;
            }
        }
        return classroom;
    }
}
