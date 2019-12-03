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
public class Bus extends VehiculoPasajeros{
    public double PRECIOPLAZA;

    public Bus(int numPasajeros, String modelo, String marca, String color, int kilometraje, int cilindrada, String combustible, String tipo, String matricula) {
        super(numPasajeros, modelo, marca, color, kilometraje, cilindrada, combustible, tipo, matricula);
    }

   
    public Bus(int numPasajeros, String modelo, String marca, String color, int kilometraje, int cilindrada, String combustible, String tipo, String matricula,boolean dis) {
        super(numPasajeros, modelo, marca, color, kilometraje, cilindrada, combustible, tipo, matricula);
        this.setDisponibilidad(dis);
    }

    public Bus(int numPasajeros, String matricula) {
        super(numPasajeros, matricula);
    }

    public void bus(int a, String nombre){
         a=this.getNumPasajeros();
        nombre=this.getMatricula();
        System.out.println("Num pasajeros Coche: "+a +" \nMatricula :"+nombre);
    }
    public double precioalquiler(int dias){
       this.PRECIOPASAJEROYDIA=2f;
        double precioBase=dias*this.PRECIODIA;
        double extra=(this.getNumPasajeros()/2);
        double precio=precioBase+extra;
        return precio;
    }
    
}
