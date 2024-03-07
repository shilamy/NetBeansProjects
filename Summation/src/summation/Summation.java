/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package summation;

import java.util.Scanner;

/**
 *
 * @author Sheila
 */
/*
(Summation of a series) Write a program that adds and display the result of
				1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9.
*/
public class Summation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int sum = 0; // Initialize sum outside the loop
     for( int i=0; i<=8;i++){ //for loop 8times
         
         // Create a Scanner object to read input from the console
         Scanner sc =new Scanner(System.in);
         
         System.out.println("Enter number");
        // Read the number entered by the user
         int number = sc.nextInt();
         sum = sum + number;
         
         
         System.out.println("Sum:" +sum);
     
    }
    }
    
}
