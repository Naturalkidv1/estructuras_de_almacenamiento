/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author ajbazan01
 */
public class Ejercicio_12 {

    public static void imprimirMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }

    }

    public static void main(String[] args) {

        int[][] matriz = {{1, 2}, {3, 4}, {5, 6}};

        Ejercicio_12.imprimirMatriz(matriz);

    }

}
