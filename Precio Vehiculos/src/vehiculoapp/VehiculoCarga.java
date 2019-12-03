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
public class VehiculoCarga extends Vehiculo implements Automotor{
    
    public double PRECIOTONELADA=5f;
    public int numllantas;
    public float tonelaje;
    String modelo ;
    String marca;
    String color;
    int kilometraje;
    int cilindrada;
    String combustible;
    private String tipo;
    

   
    public VehiculoCarga(int numllantas, float tonelaje, String modelo, String marca, String color, int kilometraje, int cilindrada, String combustible, String tipo, String matricula) {
        super(matricula);
        this.numllantas = numllantas;
        this.tonelaje = tonelaje;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.kilometraje = kilometraje;
        this.cilindrada = cilindrada;
        this.combustible = combustible;
        this.tipo = tipo;
    }

    public int getNumllantas() {
        return numllantas;
    }

    public void setNumllantas(int numllantas) {
        this.numllantas = numllantas;
    }

    public float getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(float tonelaje) {
        this.tonelaje = tonelaje;
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

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

     public double getPRECIOTONELADA() {
        return PRECIOTONELADA;
    }

    public void setPRECIOTONELADA(double PRECIOTONELADA) {
        this.PRECIOTONELADA = PRECIOTONELADA;
    }
    
    @Override
    public double definirTonelaje(){
     return PRECIOTONELADA*this.numllantas;
    }
    @Override
    public double precioAlquiler(int dias){
        double precioBase=this.PRECIODIA*dias;
        double PMA=definirTonelaje();
        double extra=(20*PMA);
        double precio=precioBase+extra;
        return precio;
    }
}

