/** Copyright ESPE-DECC
 */
package geometricfigures;

/**
 *
 * @author edisonlascano
 */
public class Triangle extends GeometricFigure implements FiguraGeometricInterface {

    float base;
    float altura;
    float lado1, lado2, lado3;

    public Triangle(float base, float altura, float lado1, float lado2, float lado3) {
        this.altura = altura;
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public float computeArea() {
        return (base * altura) / 2;
    }

    @Override
    public float computePerimeter() {
        perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }

    public float computePerimeter( float ...lados) {
        float perimetro=0;
        for(int i=0;i<lados.length;i++) {
            perimetro+=lados[i];
        }
        return perimetro;
    }

}
