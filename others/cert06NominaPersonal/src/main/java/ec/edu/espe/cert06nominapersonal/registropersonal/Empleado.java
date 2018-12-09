/** Copyright ESPE-DECC
*/

package ec.edu.espe.cert06nominapersonal.registropersonal;

/**
 *
 * @author edisonlascano
 */
public class Empleado extends Persona{

    private Persona[] cf;
    
    void pedirPermiso(){
        
    }
    
    void asignarIngresoPersonal(){
        
    }
    
    void asignarSalidaPersonal(){
        
    }

    void asignarCargaFamiliar(CargaFamiliar cf){
        //cf[0]= cf;
    }
    /**
     * @return the cf
     */
    public Persona[] getCf() {
        return cf;
    }

    /**
     * @param cf the cf to set
     */
    public void setCf(Persona[] cf) {
        this.cf = cf;
    }
    
}
