/** Copyright ESPE-DECC
*/

package ec.edu.espe.oop_fundamentals.inheritancefatherandothers;

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
