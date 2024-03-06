/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// write a program to prompt the user to enter values of x then calculate
//and display results of p, if P = 3x^2-2x+4
package algebra;

import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class Algebra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Enter value of x");
       Scanner inputscanner = new Scanner (System.in);
       int x = inputscanner.nextInt();
       
       // Calculate the value of P using the formula P = 3x^2 - 2x + 4
       double p = (3 * Math.pow(x, 2)) - (2 * x) + 4;
       System.out.println("P: "+p);
    }
    
}
