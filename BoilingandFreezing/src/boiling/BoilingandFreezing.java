/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boiling;

import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class BoilingandFreezing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Give the temperature value in celsius");
        Scanner input = new Scanner(System.in);
        int temp = input.nextInt();
        if (temp >= 100){
            System.out.println("The water is boiling.");
        } else if (temp <= 0){
            System.out.println("The water is freezing.");
        } else {
             System.out.println("The water is in normal state.");   
            }
    }
    
}
