
package primitiva;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Primitiva {

    /*
    pasos:
    Generar boleto premiado (r)
    Mostrarlo
    Generar boleto/7/ (teclado)
    Mirar si ha tocado:
    JOKER BUENO:
        Comprobar que el número es EL MISMO EN EL MISMO ORDEN
    JOKER MALO:
        Comprobar que el número es EL MISMO EN DISTINTO ORDEN
    NADA:
        Nada
    
     */
    private Random r = new Random();
    private Scanner sc = new Scanner(System.in);

    private int[] primitivaPremiada;
    private int[] primitiva;
    private final int tamanio = 7;

    public Primitiva() {

    }

    public void crearPrimitivaPremiada() {

        primitivaPremiada = new int[tamanio];

        for (int i = 0; i < primitivaPremiada.length; i++) {

            primitivaPremiada[i] = r.nextInt(10);

        }

    }

    public void mostrarPrimitivaPremiada() {

        /*for (int i = 0; i < primitivaPremiada.length; i++) {
            
            System.out.println(primitivaPremiada[i]);
            
        }*/
        System.out.println(Arrays.toString(primitivaPremiada));

    }

    public void crearPrimitiva() {

        primitiva = new int[tamanio];
        
        System.out.println("Introduce una secuencia de " + tamanio + " enteros uno a uno."
                + "\n[Pulse enter tras escribir cada dígito]");
        
        for (int i = 0; i < primitiva.length; i++) {
        
        primitiva[i] = sc.nextInt();
            
            
        }
        
    }
    
    public void mostrarPrimitiva(){
        
        System.out.println(Arrays.toString(primitiva));
        
    }

}
