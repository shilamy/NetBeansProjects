/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumandproduct;

import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class SumandProduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.println("Enter value of x");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("Enter value of y");
        int y = sc.nextInt();
        int sum = x + y;
        int product = x * y;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

    }

}
