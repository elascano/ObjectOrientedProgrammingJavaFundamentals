/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumingmylibrary;

import ec.edu.espe.operationsLibrary.area.Figure;
import ec.edu.espe.operationsLibrary.area.Triangle;

import ec.edu.espe.operationsLibrary.operation.basicOperation;

/**
 *
 * @author edisonlascano
 */
public class ConsumingMyLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figure figure = new Triangle(5,3);
        
        float localArea;
        
        localArea=figure.computeArea();
        
        System.out.println("the area is p'[equals to -> " + figure.getArea());
        
        
    }
    
    
    
}
