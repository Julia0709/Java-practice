/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubes;

import java.util.Scanner;

/**
 *
 * @author Julia
 */
public class Cubes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("the sum of cubes");
        System.out.println("Enter a integer: ");
        x = scan.nextInt();
        
        double result = Math.pow(x, 3);
        
        // result
        System.out.println("======================================");
        System.out.println("sum: " + result);
        System.out.println("======================================");
    }
}
