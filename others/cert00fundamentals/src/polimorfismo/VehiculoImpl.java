/** Copyright ESPE-DECC
*/

package polimorfismo;


public class VehiculoImpl extends Vehiculo {

    @Override
    public void cambiarPuerta() {
        System.out.println(" Se pone combustible en Vehiculo Implementación");
    }

    @Override
    public void ponerMarchaAutomatica() {
        System.out.println(" Implementado en clase --> VehiculoImpl");
    }

}
