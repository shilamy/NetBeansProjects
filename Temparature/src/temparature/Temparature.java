/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temparature;

import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class Temparature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Give in the celsius value");
        Scanner sc = new Scanner(System.in);
        //sc is the variable name alternative you can use scanner or input.
        double celsius = sc.nextDouble();
        double fahrenheit = 9.0/5.0*celsius + 32.0;
        //the reason why you use double and not integers its the difference in calculation.
        //for 9/5 in integer will round it off to the nearest whole number.
        //While For 9.0/5.0 using double will use the 1.8
        System.out.println("Fahrenheit: "+fahrenheit);
        
    }
    
}
