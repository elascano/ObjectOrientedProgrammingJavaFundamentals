/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cert03fundmentos;

import utils.Impuestos;
import estaticos.Operaciones;
import estaticos.OperacionesHijo;
import figurasgeometricas.Circulo;
import figurasgeometricas.Cuadrado;
import figurasgeometricas.FiguraGeometricaAbstracta;
import figurasgeometricas.Triangulo;
import herencia.hijo.GestionRol;
import herencia.padre.and.others.Auditoria;
import herencia.padre.and.others.AuditoriaInterface;
import inicializaciones.Operaciones2;
import iva.Iva;
import polimorfismo.Carro;
import operaciones.OperacionesBasicas;
import polimorfismo.Vehiculo;
import polimorfismo.VehiculoAutomatico;
import sobreescritura.Animal;
import sobreescritura.Caballo;
import sobreescritura.CaballoPoni;
import valorreferencia.Person;

/**
 *
 * @author edisonlascano
 */
public class Cert03fundamentos {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Testing Object Circle");
        Circulo circulito= new Circulo(0);
        Person person = new Person(1, "edi");
        System.out.println( "person " + person.getId());
        person.changeRadius(circulito);
        System.out.println("personita" + person.toString());
        System.out.println("");
        System.out.println("el otro circulo " + person.getCirculo().getRadio());
        
        System.out.println("Here I am");
        float base = 10.1F;
        System.out.println("el iva es : " + Impuestos.computeIva(base));

        System.out.println("el iva es : " + Iva.computeIva(base));

        System.out.println("--> ENCAPSULATION AND INSTANCEOF <--");
        OperacionesBasicas ob = new OperacionesBasicas();
        ob.setA(10);
        System.out.println("the value of A is --> " + ob.getA());
        if (ob instanceof Object) {
            System.out.println("ob is an Object");
        }

        if (ob instanceof OperacionesBasicas) {
            System.out.println("ob is an OperacionesBasicas");
        }

        System.out.println("--> HERENCIA <--");
        GestionRol gestionRol = new GestionRol();
        Auditoria auditoria = new Auditoria();
        gestionRol.guardarRol();
        correrAuditoria(auditoria);
        correrAuditoria(gestionRol);

        System.out.println("--> INTERFACE <--");

        GestionRol gestionRol2 = new GestionRol();
        gestionRol2.actualizarAuditoria();

        GestionRol gestionRol3 = new GestionRol();
        gestionRol3.actualizarAuditoria();

        //I can declare an object of type interface, but I can instantiate from an implemented class
        AuditoriaInterface auditoriaInterface = new Auditoria();
        correrAuditoria(auditoriaInterface);

        System.out.println("--> POLIMORFISMO <--");

        Carro carro = new Carro();
        carro.ponerMarchaAutomatica();
        carro.cambiarPuerta();
        carro.ponerCombustible();

        //Objetos polimorficos
        VehiculoAutomatico vehiculoAutomatico = new Carro();
        vehiculoAutomatico.ponerMarchaAutomatica();

        Vehiculo vehiculo2 = new Carro();
        vehiculo2.cambiarPuerta();
        vehiculo2.ponerCombustible();
        vehiculo2.ponerMarchaAutomatica();

        carro.ponerAleron();
        // ERROR vehiculoAutomatico.ponerAleron();
        // ERROR Carro carro2 = new Vehiculo();
        // ERROR vehiculo2.ponerAleron();

        System.out.println("--> Ejercicio FIGURAS GEMOMETRICAS ");
        FiguraGeometricaAbstracta figuraCuadrado = new Cuadrado(3F);
        System.out.println("el area de un cuadrado de 3 es --> " + figuraCuadrado.calcularArea());
        System.out.println("el perímetro de un cuadrado de 3 es --> " + figuraCuadrado.calcularPerimetro());

        FiguraGeometricaAbstracta figuraCirculo = new Circulo(3F);
        System.out.println("el area de un círculo de radio 3 es --> " + figuraCirculo.calcularArea());
        System.out.println("el perímetro de un círculo de radio 3 es --> " + figuraCirculo.calcularPerimetro());

        FiguraGeometricaAbstracta figuraTriangulo = new Triangulo(5, 2.5F, 3, 4, 5);
        System.out.println("el area del triángulo es --> " + figuraTriangulo.calcularArea());
        System.out.println("el perímetro del triángulo es --> " + figuraTriangulo.calcularPerimetro());
        System.out.println("el perímetro del triángulo es --> " + figuraTriangulo.calcularPerimetro(1F, 2F, 3F));

        System.out.println("--> SOBRECARGA");
        Animal animal = new Animal();
        System.out.println("Animal --> " + animal.toString());
        animal.comer();
        Animal caballo = new Caballo();
        caballo.comer();
        Animal caballoPoni = new CaballoPoni();
        caballoPoni.comer();

        Caballo caballo2 = new CaballoPoni();

        ejecutaLlamada(animal);
        ejecutaLlamada(caballo);

        System.out.println("--> SOBRECARGA <--");
        animal.comer("cebada");
        caballo.comer(10);
        caballo2.comer("trigo", "cebada");
        caballo.comer(new Integer(4));

        System.out.println("--> ESTATIC VARIABLES AND METHODS");
        Operaciones.suma(4, 2);
        Operaciones op = new Operaciones();
        op.resta(5, 2);
        OperacionesHijo.suma(3, 4);
        Operaciones op2 = new OperacionesHijo();
        op2.resta(3, 4);

        System.out.println("--> ASSIGNMENT AND INITIALIZATION");
        Operaciones2 operaciones = new Operaciones2();

    }

    static void ejecutaLlamada(Animal animal) {
        System.out.println("--> ejecuta metodo animal");
        animal.comer();
    }

    static void ejecutaLlamada(Caballo caballo) {
        System.out.println("ejecuta metodo caballo");
        //caballo.comer();
    }

    static void correrAuditoria(AuditoriaInterface auditoria) {
        auditoria.actualizarAuditoria();
    }

    static void correrAuditoria(Auditoria auditoria) {
        auditoria.guardarAuditoria();
    }

}
