/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.oop_fundamentals.keyboardinput;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author elascano
 */
public class InputFromKeyboard {

    BigDecimal bd;

    public static final int IVA = 12;

    public static void main(String[] args) throws IOException {

        System.out.println("this value can not be changed --> " + IVA);

        //it uses the "throws IOException" either you can it, or you can implement a try-catch block
        //it only reads a digit
        try {
            System.out.print("enter a digit --> ");
            int myInt = 0;
            myInt = System.in.read();
            System.out.println("the digit is --> " + (char) myInt);
        } catch (Exception ex) {
            System.out.println("that was not an integer");
        }

        //this reads a set of digits and count them one by one        
        int c;
        int counter = 0;
        while ((c = System.in.read()) != '\n') {
            counter++;
            System.out.println((char) c);

            System.out.println();
            System.err.println("how many were counted? --> " + counter);
        }

        //this section uses a Scanner object        
        Scanner keyboard = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter a positive integer number!");
            while (!keyboard.hasNextInt()) {
                System.out.println("That's not a positive integer!");
                keyboard.next(); // this is important!
            }
            number = keyboard.nextInt();
        } while (number <= 0);
        System.out.println("Thank you! I got " + number);

        //adding two numbers
        int x, y, z;
        System.out.println("Enter two integers to calculate their sum ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x + y;
        System.out.println("Sum of entered integers = " + z);

        System.out.print("enter an integer --> ");
        Scanner s = new Scanner(System.in);
        int a = Integer.parseInt(s.nextLine());
        System.out.print("enter a float --> ");
        float f = Float.parseFloat(s.nextLine());

        System.out.println("the integer is --> " + a + ", el flotante es --> " + f);
        float r = a + f;
        System.out.println("the addition is " + r);

//Reading a string        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter something -> ");
        String inputString = input.nextLine();
        System.out.print("You entered : ");
        System.out.println(inputString);
    }
}
