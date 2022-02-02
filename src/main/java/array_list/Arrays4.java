package array_list;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ajbazan01
 */
public class Arrays4 {

    /*
    Escribe un programa que, dado un array de enteros de cualquier tamaño, 
    busque si un número obtenido por teclado se encuentra en el array e imprima 
    la primera posición en la que se encuentra el número. Realiza la búsqueda de un elemento:
        - implementando el método de búsqueda secuencial. 
        - usando el método de búsqueda binaria de la clase Arrays.

     */
    private Random r = new Random();
    private Scanner sc = new Scanner(System.in);

    private int tamanio;
    private int[] array1;

    private int numeroABuscar;

    public Arrays4() {

    }

    public int tamanio() {

        System.out.println("Introduzca el tamaño de los arrays que desea");
        this.tamanio = sc.nextInt();
        return this.tamanio;
    }

    public void creacionArrays() {

        this.array1 = new int[this.tamanio];

        for (int i = 0; i < array1.length; i++) {

            array1[i] = r.nextInt(10) + 1;

        }
    }

    public int numeroBusqueda() {

        System.out.println("Introduzca el número entero que deseas buscar");
        this.numeroABuscar = sc.nextInt();
        return this.numeroABuscar;

    }

    public void mostrar() {
        System.out.println(Arrays.toString(array1));
    }

    public void busquedaSecuencial() {

        //revisar
        int valor = -1;
        for (int i = 0; i < this.array1.length; i++) {

            if (array1[i] == this.numeroABuscar) {
                valor = i;
                System.out.println("Por búsqueda secuencial, el " + this.numeroABuscar
                        + " está en la posición " + i);
                break;

            }

        }
        if (valor == -1) {
            System.out.println("No encontrado");
        }

    }

    
    
}
