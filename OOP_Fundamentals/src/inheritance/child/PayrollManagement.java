/** Copyright ESPE-DECC
*/

package inheritance.child;

import inheritance.father.and.others.Audit;

/**
 *
 * @author edisonlascano
 */
public class PayrollManagement extends Audit{
    
    public void savePayroll() {
        System.out.println(" guardando Rol");
        saveAudit();
        System.out.println(" ejecutó método guardar Auditoria");
    }
}
