/** Copyright ESPE-DECC
 */
package figurasgeometricas;

/**
 *
 * @author edisonlascano
 */
public class Triangulo extends FiguraGeometricaAbstracta implements FiguraGeometricaInterface {

    float base;
    float altura;
    float lado1, lado2, lado3;

    public Triangulo(float base, float altura, float lado1, float lado2, float lado3) {
        this.altura = altura;
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public float calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public float calcularPerimetro() {
        perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }

    public float calcularPerimetro( float ...lados) {
        float perimetro=0;
        for(int i=0;i<lados.length;i++) {
            perimetro+=lados[i];
        }
        return perimetro;
    }

}
