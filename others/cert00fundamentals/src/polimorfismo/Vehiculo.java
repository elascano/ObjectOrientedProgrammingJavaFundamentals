/** Copyright ESPE-DECC
*/

package polimorfismo;

/**
 *
 * @author edisonlascano
 */
public abstract class Vehiculo implements VehiculoAutomatico{

    public void ponerCombustible() {
        System.out.println(" Fueling ... --> from class Vehcile");
    }
    
    public abstract void cambiarPuerta();
    
    @Override
    public void ponerMarchaAutomatica() {
        System.out.println(" implementado en --> clase abstracta Vehiculo");
    }
}
