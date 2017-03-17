/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sphere;

import java.util.Scanner;

/**
 *
 * @author Julia
 */
public class Sphere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int r;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of a sphere: ");
        System.out.println("r = ");
        r = scan.nextInt();
        
        double pi = Math.PI;

        //volume       
        double r3 = Math.pow(r, 3);        
        double volume = 4*((pi*r3)/3);        
        
        //surface area
        double r2 = Math.pow(r, 2);        
        double surface = 4*pi*r2;
        
        // result
        System.out.println("======================================");
        System.out.println("Volume: "+ volume);    
        System.out.println("Surface area: "+ surface);
        System.out.println("======================================");
    }
    
}
