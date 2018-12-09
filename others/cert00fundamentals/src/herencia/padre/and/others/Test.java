/** Copyright ESPE-DECC
*/

package herencia.padre.and.others;

/**
 *
 * @author edisonlascano
 */
public class Test {
    
    public void testing(){
    Carro m = new Mercedez();
    m.numeroLlantas=2;
    //m.numeroPuertas;
    
    AuditoriaInterface objAuditoriaInterface = new Auditoria();
    
    objAuditoriaInterface.actualizarAuditoria();
    
    Auditoria auditoria = new Auditoria();
    auditoria.actualizarAuditoria();
    auditoria.guardarAuditoria();
    }
    

}
