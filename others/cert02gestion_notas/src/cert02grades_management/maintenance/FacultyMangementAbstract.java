/** Copyright ESPE-DECC
*/

package cert02grades_management.maintenance;

import cert02grades_management.model.Faculty;

/**
 *
 * @author edisonlascano
 */
public abstract class FacultyMangementAbstract {
    public abstract Faculty[] addFaculty();
    public abstract Faculty getFacultyPerCedula(String cedula);
}
