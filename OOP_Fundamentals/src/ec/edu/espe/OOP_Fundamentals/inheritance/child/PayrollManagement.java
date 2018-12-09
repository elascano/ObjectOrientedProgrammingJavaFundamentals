/** Copyright ESPE-DECC
*/

package ec.edu.espe.oop_fundamentals.inheritance.child;

import ec.edu.espe.oop_fundamentals.inheritancefatherandothers.Audit;

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
