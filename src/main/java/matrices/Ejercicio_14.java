/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author ajbazan01
 */
public class Ejercicio_14 {

    public static void imprimirMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }

    }

    public static void rellenarMatriz(int[][] matriz) {

        Random r = new Random();

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt(100) + 1;
            }
        }

    }

    public static int mediaMatriz(int[][] matriz) {

        int suma = 0;
        int media;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                suma = (matriz[i][j] + suma);
            }
        }

        media = suma / (matriz.length * matriz[0].length);

        return media;

    }

    public static int valorMinMatriz(int[][] matriz) {

        int aux = 101;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if (aux > matriz[i][j]) {
                    aux = matriz[i][j];
                }
            }
        }
        return aux;
    }

    public static int valorMaxMatriz(int[][] matriz) {
        
        int aux = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if (aux < matriz[i][j]) {
                    aux = matriz[i][j];
                }
            }
        }
        return aux;

    }

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        Ejercicio_14.rellenarMatriz(matriz);
        Ejercicio_14.imprimirMatriz(matriz);
        System.out.println("\n");
        System.out.println("La media de la matriz es: " + Ejercicio_14.mediaMatriz(matriz));
        System.out.println("El valor mínimo es: " + Ejercicio_14.valorMinMatriz(matriz));
        System.out.println("El valor máximo es: " + Ejercicio_14.valorMaxMatriz(matriz));
    }

}
