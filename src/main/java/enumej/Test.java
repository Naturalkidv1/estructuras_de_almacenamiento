/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumej;

import java.util.Arrays;

/**
 *
 * @author ajbazan01
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pizza bbq = Pizza.BARBACOA;
        Pizza cc = Pizza.CARBONARA;
        Pizza jyq = Pizza.JAMONYQUESO;
        
    
        for (Pizza p: Pizza.values()){
            System.out.println(p.toString()+" - ");
        }
        
        System.out.println(bbq.toString());
        
 
        
        switch(bbq){
            case BARBACOA:
                break;
            case CARBONARA:
                break;
            case JAMONYQUESO:
                break;
        }
        
    }
    
}
