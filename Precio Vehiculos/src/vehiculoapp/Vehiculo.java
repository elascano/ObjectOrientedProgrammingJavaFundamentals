
package vehiculoapp;

import java.io.Serializable;

/**
 * @author Miguel
 */
public abstract class Vehiculo implements Serializable{
    private String matricula;
    public double PRECIODIA=50f;
   private boolean disponibilidad = true;
   
abstract public double precioAlquiler(int d);

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.PRECIODIA = PRECIODIA;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void vehiculo(String vehiculo){
        System.out.println("Matricula: "+this.matricula);
    }

    @Override
    public String toString() {
        return "VehiculoRenta{" + "matricula=" + matricula + '}';
    }
    
}
