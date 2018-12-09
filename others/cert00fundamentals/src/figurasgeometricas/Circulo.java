/** Copyright ESPE-DECC
*/

package figurasgeometricas;

/**
 *
 * @author edisonlascano
 */
public class Circulo extends FiguraGeometricaAbstracta implements FiguraGeometricaInterface{
    private float radio;
    
    public Circulo(float radio) {
        this.radio=radio;
    }
    
    public float calcularArea(){
        area= radio*radio*3.1416F;
        return area;
    }
    
    public float calcularPerimetro() {
        perimetro = 2*3.1416F*radio;
        return perimetro;
    }

    @Override
    public float calcularPerimetro(float... valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public float getRadio() {
        return radio;
    }

    public float getArea() {
        return area;
    }

    public float getPerimetro() {
        return perimetro;
    }
    
    
}
