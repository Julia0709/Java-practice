/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distance;

import java.util.Scanner;

/**
 *
 * @author Julia
 */
public class Distance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Distance of two coordinates.");
        
        int x1, y1, x2, y2;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter coordinate1(x1, y1): ");
        System.out.println("x1= ");
        x1 = scan.nextInt();
        System.out.println("y1= ");
        y1 = scan.nextInt();
        
        System.out.println("Enter coordinate2(x2, y2): ");
        System.out.println("x2= ");
        x2 = scan.nextInt();
        System.out.println("y2= ");
        y2 = scan.nextInt();
        
        // result
        double xGap = x2 - x1;
        double yGap = y2 - y1;
        double result = (Math.pow(xGap, 2))+(Math.pow(yGap, 2));
        double distance = Math.sqrt(result);
        
        System.out.println(distance);
    }
    
}
