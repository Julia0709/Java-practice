/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julia
 */
import java.util.Scanner;

public class AskName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstName, lastName;
        int age;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your first name: ");
        firstName = scan.nextLine();
        
        System.out.println("Enter your last name: ");
        lastName = scan.nextLine();
        
        System.out.println("Enter your age: ");
        age = scan.nextInt();
        
        // out put
        System.out.println("======================================");
        System.out.println("Your name is " + firstName + " " + lastName + ".");
        System.out.println("You are " + age + " years old.");
        System.out.println("======================================");
    }
    
}
