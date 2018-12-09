/** Copyright ESPE-DECC
*/

package figurasgeometricas;

/**
 *
 * @author edisonlascano
 */
public class FiguraGeometricaAbstracta implements FiguraGeometricaInterface{
    float area;
    float perimetro;

    @Override
    public float calcularArea() {
        return area;
    }

    @Override
    public float calcularPerimetro() {
        return perimetro;
    }

    @Override
    public float calcularPerimetro(float... valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
