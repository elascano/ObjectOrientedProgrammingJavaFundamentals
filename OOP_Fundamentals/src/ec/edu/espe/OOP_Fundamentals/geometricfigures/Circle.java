/** Copyright ESPE-DECC
*/

package ec.edu.espe.oop_fundamentals.geometricfigures;

/**
 *
 * @author edisonlascano
 */
public class Circle extends GeometricFigure implements FiguraGeometricInterface{
    private float radio;
    
    public Circle(float radio) {
        this.radio=radio;
    }
    
    @Override
    public float computeArea(){
        area= radio*radio*3.1416F;
        return area;
    }
    
    @Override
    public float computePerimeter() {
        perimetro = 2*3.1416F*radio;
        return perimetro;
    }

    @Override
    public float computePerimeter(float... value) {
        return 0;
    }
}
