/** Copyright ESPE-DECC
*/

package cert02grades_management.maintenance;

import cert02grades_management.model.Student;

/**
 *
 * @author edisonlascano
 */
public abstract class StudentManagementAbstract {
    public abstract Student[] add();
    public abstract Student getPerCedula(String cedula);
    
}
