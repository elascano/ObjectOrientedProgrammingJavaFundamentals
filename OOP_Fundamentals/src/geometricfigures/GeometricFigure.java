/** Copyright ESPE-DECC
*/

package geometricfigures;

/**
 *
 * @author edisonlascano
 */
public class GeometricFigure implements FiguraGeometricInterface{
    float area;
    float perimetro;

    @Override
    public float computeArea() {
        return area;
    }

    @Override
    public float computePerimeter() {
        return perimetro;
    }

    @Override
    public float computePerimeter(float... value) {
        return 0;
    }
}
