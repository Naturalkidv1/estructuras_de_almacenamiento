
package array_list;

import java.util.Arrays;


public class Ejercicio_3 {


    public static void main(String[] args) {
     
        double[] array1 = new double[20];
        
        Arrays.fill(array1, 7.5);
        
        double[] array2;
        
        array2 = Arrays.copyOf(array1, array1.length);
        
        System.out.println((Arrays.equals(array1, array2))? "iguales":"no iguales");
        
        System.out.println("Array1: " +  Arrays.toString(array1));
        System.out.println("Array2: " +  Arrays.toString(array2));
        
        
    }
    
}
