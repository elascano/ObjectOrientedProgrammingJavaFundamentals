/** Copyright ESPE-DECC
*/

package cert02grades_management.maintenance;

import cert02grades_management.model.Registration;


/**
 *
 * @author edisonlascano
 */
public abstract class RegistrationMangementAbstract {
    public abstract Registration[] add();
    public abstract Registration getPerRegistrationNumber(String registrationNumber);
}
