/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cert03fundments;

import utils.Tax;
import estatics.Operation;
import estatics.OperationChild;
import geometricfigures.Circle;
import geometricfigures.Square;
import geometricfigures.GeometricFigure;
import geometricfigures.Triangle;
import inheritance.child.PayrollManagement;
import inheritance.father.and.others.Audit;
import iniciatializations.Operations2;
import iva.Iva;
import polimorphism.Car;
import operations.BasicOperations;
import polimorphism.Vehicle;
import overriding.Animal;
import overriding.Horse;
import overriding.HorsePony;
import inheritance.father.and.others.AuditInterface;
import polimorphism.AutomaticVehicle;

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

                System.out.println("Here I am");
                float base=10.1F;
                System.out.println("el iva es : " +  Tax.computeIva(base));
                
                
                System.out.println("el iva es : " +  Iva.computeIva(base));

        
        System.out.println("--> ENCAPSULATION AND INSTANCEOF <--");
        BasicOperations bo = new BasicOperations();
        bo.setA(10);
        System.out.println("the value of A is --> " + bo.getA());
        if (bo instanceof Object) {
            System.out.println("ob is an Object");
        }

        if (bo instanceof BasicOperations) {
            System.out.println("ob is an OperacionesBasicas");
        }

        System.out.println("--> HERENCIA <--");
        PayrollManagement payrollManagement = new PayrollManagement();
        Audit audit = new Audit();
        payrollManagement.savePayroll();
        runAudit(audit);
        runAudit(payrollManagement);

        System.out.println("--> INTERFACE <--");

        PayrollManagement payrollManagement2 = new PayrollManagement();
        payrollManagement2.updateAudit();

        PayrollManagement payrollManagement3 = new PayrollManagement();
        payrollManagement3.updateAudit();

        //I can declare an object of type interface, but I can instantiate from an implemented class
        AuditInterface auditoriaInterface = new Audit();
        correrAuditoria(auditoriaInterface);

        System.out.println("--> POLIMORFISMO <--");

        Car car = new Car();
        car.putAutomaticGear();
        car.changeDoor();
        car.putFuel();

        //Objetos polimorficos
        AutomaticVehicle automaticVehicle = new Car();
        automaticVehicle.putAutomaticGear();

        Vehicle vehicule2 = new Car();
        vehicule2.changeDoor();
        vehicule2.putFuel();
        vehicule2.putAutomaticGear();

        car.putWing();
        // ERROR vehiculoAutomatico.putWing();
        // ERROR Car carro2 = new Vehicle();
        // ERROR vehiculo2.putWing();

        System.out.println("--> Ejercicio FIGURAS GEMOMETRICAS ");
        GeometricFigure squareFigure = new Square(3F);
        System.out.println("el area de un cuadrado de 3 es --> " + squareFigure.computeArea());
        System.out.println("el perímetro de un cuadrado de 3 es --> " + squareFigure.computePerimeter());

        GeometricFigure circleFigure = new Circle(3F);
        System.out.println("el area de un círculo de radio 3 es --> " + circleFigure.computeArea());
        System.out.println("el perímetro de un círculo de radio 3 es --> " + circleFigure.computePerimeter());

        GeometricFigure triangleFigure = new Triangle(5, 2.5F, 3, 4, 5);
        System.out.println("el area del triángulo es --> " + triangleFigure.computeArea());
        System.out.println("el perímetro del triángulo es --> " + triangleFigure.computePerimeter());
        System.out.println("el perímetro del triángulo es --> " + triangleFigure.computePerimeter(1F, 2F, 3F));

        System.out.println("--> SOBRECARGA");
        Animal animal = new Animal();
        System.out.println("Animal --> " + animal.toString());
        animal.eat();
        Animal horse = new Horse();
        horse.eat();
        Animal horsePony = new HorsePony();
        horsePony.eat();

        Horse horse2 = new HorsePony();

                Cert03fundamentos.executeCall(animal);
                Cert03fundamentos.executeCall(horse);

        System.out.println("--> SOBRECARGA <--");
        animal.eat("cebada");
        horse.eat(10);
        horse2.eat("trigo", "cebada");
        horse.eat(new Integer(4));

        System.out.println("--> STATIC VARIABLES AND METHODS");
        Operation.add(4, 2);
        Operation op = new Operation();
        op.sub(5, 2);
        OperationChild.add(3, 4);
        Operation op2 = new OperationChild();
        op2.sub(3, 4);

        System.out.println("--> ASSIGNMENT AND INITIALIZATION");
        Operations2 operations = new Operations2();
 
        
    }

    static void executeCall(Animal animal) {
        System.out.println("--> ejecuta metodo animal");
        animal.eat();
    }

    static void executeCall(Horse caballo) {
        System.out.println("ejecuta metodo caballo");
        //caballo.eat();
    }

    static void correrAuditoria(AuditInterface auditoria) {
        auditoria.updateAudit();
    }

    static void runAudit(Audit auditoria) {
        auditoria.saveAudit();
    }
}
