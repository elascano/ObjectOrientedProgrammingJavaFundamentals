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
public class VehiculoPasajeros extends Vehiculo{
    private int numPasajeros;
    String modelo ;
    String marca;
    String color;
    int kilometraje;
    int cilindrada;
    String combustible;
    private String tipo;
    public  double PRECIOPASAJEROYDIA;
    byte[] foto;
    
    public String getTipo() {
        return tipo;
    }

   

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public VehiculoPasajeros(int numPasajeros, String modelo, String marca, String color, int kilometraje, int cilindrada, String combustible, String tipo, String matricula) {
        super(matricula);
        this.numPasajeros = numPasajeros;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.kilometraje = kilometraje;
        this.cilindrada = cilindrada;
        this.combustible = combustible;
        this.tipo = tipo;
    }

//    public VehiculoPasajeros(int numPasajeros, String modelo, String marca, String color, int kilometraje, int cilindrada, String combustible, String matricula) {
//        super(matricula);
//        this.numPasajeros = numPasajeros;
//        this.modelo = modelo;
//        this.marca = marca;
//        this.color = color;
//        this.kilometraje = kilometraje;
//        this.cilindrada = cilindrada;
//        this.combustible = combustible;
//    }

    public VehiculoPasajeros(int numPasajeros, String matricula) {
        super(matricula);
        this.numPasajeros = numPasajeros;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public double getPRECIOPASAJEROYDIA() {
        return PRECIOPASAJEROYDIA;
    }

    public void setPRECIOPASAJEROYDIA(double PRECIOPASAJEROYDIA) {
        this.PRECIOPASAJEROYDIA = PRECIOPASAJEROYDIA;
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

    @Override
    public String toString() {
        return "VehiculoPasajeros{" + "numPasajeros=" + numPasajeros + ", modelo=" + modelo + ", marca=" + marca + ", color=" + color + ", kilometraje=" + kilometraje + ", cilindrada=" + cilindrada + ", combustible=" + combustible + ", tipo=" + tipo + '}';
    }

    

    
    
    @Override
    public double precioAlquiler(int dias){
        this.PRECIOPASAJEROYDIA=2f;
        double precioBase=dias*this.PRECIODIA;
        double extra=(this.numPasajeros*2)+(dias*2);
        double precio=precioBase+extra;
        return precio;
    }
    public void VehiculoPasajeros(int pasaj, String msg){
        System.out.println("El bus '"+msg+"' renta con "+pasaj+" pasajeros");
    }
}
