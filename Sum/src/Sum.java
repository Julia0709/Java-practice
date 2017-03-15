/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julia
 */
public class Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numbers[] = {4, 6, 34, 32, 65, 3, 12, 7};

        // initialize sum        
        int sum = 0;
        
        // repeat to add until "numbers" finishes
        for (int i=0; i<numbers.length; i++) {
            sum += numbers[i];
        }
        
        System.out.println("Total: " + sum);
    }
    
}
