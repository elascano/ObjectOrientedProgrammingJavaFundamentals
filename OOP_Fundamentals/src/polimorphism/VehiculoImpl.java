/** Copyright ESPE-DECC
*/

package polimorphism;


public class VehiculoImpl extends Vehicle {

    @Override
    public void changeDoor() {
        System.out.println(" Se pone combustible en Vehiculo Implementación");
    }

    @Override
    public void putAutomaticGear() {
        System.out.println(" Implementado en clase --> VehiculoImpl");
    }

}
