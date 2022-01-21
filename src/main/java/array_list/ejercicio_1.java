package array_list;

public class ejercicio_1 {

    public static void main(String[] args) {

    //Escribe un programa que muestre cada elemento de un array de enteros y 
    //sume todos sus elementos. Instancia e inicializa el array en el programa, 
    //sin leer nada por teclado, con los siguientes valores {1, 2, 3, 4, 5, 6}.
    
     int suma =0;
    
     int[] num = {1, 2, 3, 4, 5, 6};
        
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]+"");
            suma += num[i];
            System.out.println("Suma: " + suma);
        }
    
    }

}
