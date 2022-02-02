/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos_avanzado;

import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

public class ArraysVehiculares {

    private String matricula;
    private String marca;
    private String color;

    private String[] matriculaArray;
    private String[] marcaArray;
    private String[] colorArray;

    public ArraysVehiculares() {

    }

    public String matriculaArrayMetodo() {

        matricula = RandomStringUtils.randomNumeric(4) + RandomStringUtils.randomAlphabetic(3);

        return matricula;
    }

    public void mostrarMatriculaArray() {

        System.out.println(matriculaArray);

    }

    public String marcaArrayObtenerMetodo() {

        marcaArray = new String[8];

        marcaArray[0] = "Aston Martin";
        marcaArray[1] = "Audi        ";
        marcaArray[2] = "BMW         ";
        marcaArray[3] = "Citroën     ";
        marcaArray[4] = "Cupra       ";
        marcaArray[5] = "Dacia       ";
        marcaArray[6] = "Ferrari     ";
        marcaArray[7] = "Fiat        ";

        Random random = new Random();
        int r = random.nextInt(marcaArray.length);

        marca = marcaArray[r];

        return marca;
    }

    public String[] mostrarMarcaArray() {

        return marcaArray;

    }

    public String colorArrayObtenerMetodo() {

        colorArray = new String[8];

        colorArray[0] = "Verde   ";
        colorArray[1] = "Dorado  ";
        colorArray[2] = "Negro   ";
        colorArray[3] = "Plateado";
        colorArray[4] = "Naranja ";
        colorArray[5] = "Rojo    ";
        colorArray[6] = "Azul    ";
        colorArray[7] = "Rosa    ";

        Random random = new Random();
        int r = random.nextInt(colorArray.length);

        color = colorArray[r];

        return color;
    }
}
