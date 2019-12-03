/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculoapp;

import java.io.Serializable;

/**
 *
 * @author Miguel
 */
public class Coche extends VehiculoPasajeros implements Serializable{

    public Coche(int numPasajeros, String modelo, String marca, String color, int kilometraje, int cilindrada, String combustible, String tipo, String matricula) {
        super(numPasajeros, modelo, marca, color, kilometraje, cilindrada, combustible, tipo, matricula);
    }


    public Coche(int numPasajeros, String modelo, String marca, String color, int kilometraje, int cilindrada, String combustible, String tipo, String matricula,boolean disp) {
        super(numPasajeros, modelo, marca, color, kilometraje, cilindrada, combustible, tipo, matricula);
        this.setDisponibilidad(disp);
    }

   
   
    
    public Coche(int numPasajeros, String matricula) {
        super(numPasajeros, matricula);
    }
    
    public void coche(int a, String nombre){
        a=this.getNumPasajeros();
        nombre=this.getMatricula();
        System.out.println("Num pasajeros Coche: "+a +" \nMatricula :"+nombre);
    }

    @Override
    public double precioAlquiler(int dias) {
        return super.precioAlquiler(dias); 
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String isCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

   
    
}
