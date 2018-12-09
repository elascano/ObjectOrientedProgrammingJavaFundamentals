/** Copyright ESPE-DECC
*/

package herencia.hijo;

import herencia.padre.and.others.Auditoria;

/**
 *
 * @author edisonlascano
 */
public class GestionRol extends Auditoria{
    
    public void guardarRol() {
        System.out.println(" guardando Rol");
        guardarAuditoria();
        System.out.println(" ejecutó método guardar Auditoria");
    }
            
            

}
