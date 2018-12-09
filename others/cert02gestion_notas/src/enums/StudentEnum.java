/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

import cert02grades_management.model.Student;

/**
 *
 * @author edisonlascano
 */
public enum StudentEnum {
    EDISON_LASCANO("1710893114", "Edison"),
    EDISON_LASCANO2(),DANIEL_LASCANO("1710893115", "Daniel");

    private String cedula;
    private String name;

    private StudentEnum(String cedula, String name) {
        this.cedula = cedula;
        this.name = name;
    }

    private StudentEnum(String cedula) {
        this.cedula = cedula;
    }

    private StudentEnum() {
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    public static void addStudent(Student student) {
        System.out.println("You have been added to the student --> " +
                student.getPerson().getCedula());
    }

}
