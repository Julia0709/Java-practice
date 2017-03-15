/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average;

/**
 *
 * @author Julia
 */
public class Average {
    public static void main(String[] args) {
        int numbers[] = {4, 6, 34, 32, 65, 3, 12, 7};
        
        // sum all the "numbers"      
        float sum = 0;

        for (int i=0; i<numbers.length; i++) {
            sum += numbers[i];
        }

        // average
        float average = sum / numbers.length;
        
        System.out.println("Average: " + average);  
    }
}
