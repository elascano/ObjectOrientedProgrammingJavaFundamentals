/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cert02grades_management;

import cert02grades_management.maintenance.impl.StudentManagementImpl;
import cert02grades_management.maintenance.impl.ClassroomManagementImpl;
import cert02grades_management.maintenance.impl.FacultyManagementImpl;
import cert02grades_management.maintenance.impl.RegistrationManagementImpl;
import cert02grades_management.maintenance.impl.PersonManagementImpl;
import cert02grades_management.model.Student;
import cert02grades_management.model.Person;
import enums.StudentEnum;

/**
 *
 * @author edisonlascano
 */
public class Cert02grades_management {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        String [] s= new String[10];
        PersonManagementImpl personManagement = new PersonManagementImpl();
        System.out.println("--> PERSONAS, ALUMNOS y DOCENTES <--");

        System.out.println("la Persona  -> "
                + personManagement.getPersonPerCedula("1710893114").getName());

        System.out.println("la Persona  -> "
                + personManagement.getPersonPerCedula("1710893111").getName());

        System.out.println("la Persona  -> "
                + personManagement.getPersonPerCedula("1710893112").getName());

        System.out.println("la Persona  -> "
                + personManagement.getPersonPerCedula("1710893113").getName());

        System.out.println("la Persona -> "
                + personManagement.getPersonPerCedula2("1710893113").getName());

        System.out.println("la Persona -> "
                + personManagement.getPersonPerCedula2("1710893112").getName());

        StudentManagementImpl gestionAlumno = new StudentManagementImpl();
        gestionAlumno.add();

        System.out.println("el Alumno -> "
                + gestionAlumno.getPerCedula("1710893114").getPerson().getName());

        FacultyManagementImpl facultyManagement = new FacultyManagementImpl();
        facultyManagement.addFaculty();

        System.out.println("el Docente -> "
                + facultyManagement.getFacultyPerCedula("1710893113").getPersona().getName());

        System.out.println("el Alumno -> "
                + gestionAlumno.getPerCedula("1710893111").getPerson().getName());

        ClassroomManagementImpl classroomManagement = new ClassroomManagementImpl();
        classroomManagement.addClassroom();

        System.out.println("el Aula -> "
                + classroomManagement.getClassroomPerName("303").getSection()
                + ", nombre: " + classroomManagement.getClassroomPerName("303").getName());

        RegistrationManagementImpl registrationManagement = new RegistrationManagementImpl();
        registrationManagement.add();
        System.out.println("--> MATRICULAS <--");

        System.out.println("la Matricula -> "
                + registrationManagement.getPerRegistrationNumber("001").getRegistrationNumber()
                + ", nombre:--> " + registrationManagement.getPerRegistrationNumber("001").getStudent().getPerson().getName()
                + " Aula:--> " + registrationManagement.getPerRegistrationNumber("001").getClassroom().getSection());

        System.out.println("--> ENUMS <--");
        System.out.println(" Nombre --> " + StudentEnum.EDISON_LASCANO.getName()
                + ", cédula --> " + StudentEnum.EDISON_LASCANO.getCedula());

        System.out.println(" Nombre --> " + StudentEnum.DANIEL_LASCANO.getName()
                + ", cédula --> " + StudentEnum.DANIEL_LASCANO.getCedula());

        System.out.println(" Nombre --> " + StudentEnum.EDISON_LASCANO2.getName()
                + ", cédula --> " + StudentEnum.EDISON_LASCANO2.getCedula());

        Student student = new Student();
        Person person = new Person();
        person.setLastName("Ayala");
        person.setCedula("1717171717");
        student.setPerson(person);
        StudentEnum.addStudent(student);

        StudentEnum studentEnum;
        studentEnum = StudentEnum.DANIEL_LASCANO;

        System.out.println(" Nombre --> " + studentEnum.getName()
                + ", cédula --> " + studentEnum.getCedula());
    
            studentEnum = StudentEnum.EDISON_LASCANO;

        System.out.println(" Nombre --> " + studentEnum.getName()
                + ", cédula --> " + studentEnum.getCedula());
    
        for (StudentEnum alu : StudentEnum.values()) {
            System.out.println("el enum del Alumno en el bucle --> " + 
                    alu + " --> " + alu.getName() + ":" + alu.getCedula());
        }

    }

}
