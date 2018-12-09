/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valorreferencia;

import figurasgeometricas.Circulo;

/**
 *
 * @author elascano
 */
public class Person {
    
    private int id;
    private String name;
    private Circulo circulo= new Circulo(2);

    public void changeRadius(Circulo circulo){
        circulo.setRadio(50);
    }
    public String toString(){
        Circulo circ = new Circulo(5);
        changeRadius(circ);
        circ.setRadio(800);
        return id + " - " + name + " radio: " + circ.getRadio(); 
    }

    public Circulo getCirculo() {
        return circulo;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    
    
}
