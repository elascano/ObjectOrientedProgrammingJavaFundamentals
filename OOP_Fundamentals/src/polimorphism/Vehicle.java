/** Copyright ESPE-DECC
*/

package polimorphism;

/**
 *
 * @author edisonlascano
 */
public abstract class Vehicle implements AutomaticVehicle{

    public void putFuel() {
        System.out.println(" Fueling ... --> from class Vehcile");
    }
    
    public abstract void changeDoor();
    
    @Override
    public void putAutomaticGear() {
        System.out.println(" implementado en --> clase abstracta Vehiculo");
    }
}
