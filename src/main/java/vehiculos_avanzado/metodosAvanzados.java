/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos_avanzado;

import java.util.Arrays;

/**
 *
 * @author ajbazan01
 */
public class metodosAvanzados {

    public static void main(String[] args) {

        ArraysVehiculares av = new ArraysVehiculares();
        
        int tamanio = 100;
        
        
        //matriculas
        String[] matriculas = new String[tamanio];
        for (int i = 0; i < matriculas.length; i++) {

            matriculas[i] = av.matriculaArrayMetodo();

        }
        /*
        for (int i = 0; i < matriculas.length; i++) {
            System.out.println(matriculas[i]);
        }
        */
        //marcas
        String[] marcas = new String[tamanio];
        for (int i = 0; i < marcas.length; i++) {

            marcas[i] = av.marcaArrayObtenerMetodo();

        }
        /*
        for (int i = 0; i < marcas.length; i++) {
            System.out.println(marcas[i]);
        }
        */
        //color
        String[] color = new String[tamanio];
        for (int i = 0; i < color.length; i++) {

            color[i] = av.colorArrayObtenerMetodo();

        }

        /*
        for (int i = 0; i < color.length; i++) {
            System.out.println(color[i]);
        }
        */
        for (int i = 0; i < tamanio; i++) {

            System.out.println(matriculas[i] + " - " + marcas[i] + " - " + color[i]);

        }

    }

}
