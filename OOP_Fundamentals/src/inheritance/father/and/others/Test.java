/** Copyright ESPE-DECC
*/

package inheritance.father.and.others;

/**
 *
 * @author edisonlascano
 */
public class Test {
    
    public void testing(){
    Car m = new Mercedez();
    m.numberOfWheels=2;
    //m.numeroPuertas;
    
    AuditInterface objAuditoriaInterface = new Audit();
    
    objAuditoriaInterface.updateAudit();
    
    Audit auditoria = new Audit();
    auditoria.updateAudit();
    auditoria.saveAudit();
    }
    

}
