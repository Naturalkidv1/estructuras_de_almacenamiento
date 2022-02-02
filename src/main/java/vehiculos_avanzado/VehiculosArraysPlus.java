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
public class VehiculosArraysPlus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Vehiculo[] vehiculo = new Vehiculo[100];

        for (int i = 0; i < vehiculo.length; i++) {

            Vehiculo v = new Vehiculo();
            vehiculo[i] = v;
            System.out.println(vehiculo[i]);
        }

    }

}
