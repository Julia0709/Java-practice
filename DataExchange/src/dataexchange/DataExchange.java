/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataexchange;

/**
 *
 * @author Julia
 */
public class DataExchange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String John = "Younger brother";
        String Mike = "Older brother";
        
        System.out.println("John: " + John + ", Mike: " + Mike);
        
        String stash;
        
        stash = John;
        John = Mike;
        Mike = stash;
        
        System.out.println("John: " + John + ", Mike: " + Mike);
    }
    
}
