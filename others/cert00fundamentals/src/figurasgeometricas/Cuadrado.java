/** Copyright ESPE-DECC
 */
package figurasgeometricas;

/**
 *
 * @author edisonlascano
 */
public class Cuadrado extends FiguraGeometricaAbstracta implements FiguraGeometricaInterface {

    private float lado;


    public Cuadrado(float lado) {
        this.lado = lado;
    }

    @Override
    public float calcularArea() {
        area = lado * lado;
        return area;
    }

    @Override
    public float calcularPerimetro() {
        perimetro = lado * 4;
        return perimetro;
    }

    @Override
    public float calcularPerimetro(float... valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
