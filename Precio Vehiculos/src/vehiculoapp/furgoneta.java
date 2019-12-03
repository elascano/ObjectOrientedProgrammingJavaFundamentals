/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculoapp;

/**
 *
 * @author Miguel
 */
public class furgoneta extends VehiculoCarga{

    public furgoneta(int numllantas, float tonelaje, String modelo, String marca, String color, int kilometraje, int cilindrada, String combustible, String tipo, String matricula) {
        super(numllantas, tonelaje, modelo, marca, color, kilometraje, cilindrada, combustible, tipo, matricula);
    }

     public furgoneta(int numllantas, float tonelaje, String modelo, String marca, String color, int kilometraje, int cilindrada, String combustible, String tipo, String matricula,boolean disp) {
        super(numllantas, tonelaje, modelo, marca, color, kilometraje, cilindrada, combustible, tipo, matricula);
        this.setDisponibilidad(disp);
    }
    

    
    
    public void Furgoneta(String a){
        a=this.getMatricula();
        System.out.println("Matricula Furgo: "+a);
    }

    @Override
    public double precioAlquiler(int dias) {
        return super.precioAlquiler(dias); //To change body of generated methods, choose Tools | Templates.
    }
    
}
