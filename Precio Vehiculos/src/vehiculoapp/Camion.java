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
public class Camion extends VehiculoCarga{
   
    public double PRECIOFIJO=40f;   

    public Camion(int numllantas, float tonelaje, String modelo, String marca, String color, int kilometraje, int cilindrada, String combustible, String tipo, String matricula) {
        super(numllantas, tonelaje, modelo, marca, color, kilometraje, cilindrada, combustible, tipo, matricula);
    }
  public Camion(int numllantas, float tonelaje, String modelo, String marca, String color, int kilometraje, int cilindrada, String combustible, String tipo, String matricula,boolean disp) {
        super(numllantas, tonelaje, modelo, marca, color, kilometraje, cilindrada, combustible, tipo, matricula);
        this.setDisponibilidad(disp);
    }
 

    public void Camion(String msg){
        msg=this.getMatricula();
        System.out.println("Matricula Camion: "+msg);
    }
    @Override
    public double precioAlquiler(int dias){
        double precioBase=this.PRECIODIA*dias;
        double PMA=definirTonelaje()*numLlantas;
        double extra=(20*PMA);
        double precio=40+precioBase+extra;
        return precio; 
    }
   
}
