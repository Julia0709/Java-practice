/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usenamemaker;

import java.util.Scanner;

/**
 *
 * @author Julia
 */
public class UsenameMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstName, lastName, userName;

        // ask first & last names
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your first name: ");
        firstName = scan.nextLine();
        
        System.out.println("Enter your last name: ");
        lastName = scan.nextLine();
        
        // generate usename
        char letter1 = firstName.charAt(0);
        String letter5 = lastName.substring(0,5);
         int i = (int)(Math.random()*100);
         
        String useName = letter1 + letter5 + i;

        // result
        System.out.println("======================================");
        System.out.println("username: " + useName);
        System.out.println("======================================");
    }
  
}
