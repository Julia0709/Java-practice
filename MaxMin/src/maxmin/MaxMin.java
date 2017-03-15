/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxmin;

/**
 *
 * @author Julia
 */
public class MaxMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numbers[] = {4, 6, 34, 32, 65, 3, 12, 7};
        
        // max
        // initialize max
        int max = numbers[0];
        
        for(int i=0; i<numbers.length; i++) {
            if(max<numbers[i]){
                max=numbers[i];
            }
        }
        
        System.out.println("Max: " + max);

        // min
        // initialize min
        int min = numbers[0];
        
        for(int i=0; i<numbers.length; i++) {
            if(min>numbers[i]){
                min=numbers[i];
            }
        }

        System.out.println("Min: " + min);

    }
    
}
