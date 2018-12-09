/** Copyright ESPE-DECC
*/

package inheritance.father.and.others;

/**
 *
 * @author edisonlascano
 */
public class Audit implements AuditInterface{
    public void saveAudit() {
        System.out.println(" guardando auditoria ");
    }

    @Override
    public void updateAudit() {
        System.out.println("actualizar auditoria implemented");
    }

}
