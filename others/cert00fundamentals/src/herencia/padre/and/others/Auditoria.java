/** Copyright ESPE-DECC
*/

package herencia.padre.and.others;

/**
 *
 * @author edisonlascano
 */
public class Auditoria implements AuditoriaInterface{
    public void guardarAuditoria() {
        System.out.println(" guardando auditoria ");
    }

    @Override
    public void actualizarAuditoria() {
        System.out.println("actualizar auditoria implemented");
    }

}
