/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cert02grades_management.maintenance;

import cert02grades_management.model.Person;

/**
 *
 * @author edisonlascano
 */
public interface PersonManagementInterface {
    Person[] addPerson();
    Person getPersonPerCedula(String cedula);
    Person getPersonPerCedula2(String cedula);

    
}
