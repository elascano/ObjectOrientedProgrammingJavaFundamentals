/** Copyright ESPE-DECC
 */
package geometricfigures;

/**
 *
 * @author edisonlascano
 */
public class Square extends GeometricFigure implements FiguraGeometricInterface {

    private float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public float computeArea() {
        area = side * side;
        return area;
    }

    @Override
    public float computePerimeter() {
        perimetro = side * 4;
        return perimetro;
    }

    @Override
    public float computePerimeter(float... value) {
        return 0;
    }

}
