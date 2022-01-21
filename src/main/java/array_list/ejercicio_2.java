package array_list;

import java.util.Scanner;

public class ejercicio_2 {

    public static void main(String[] args) {

        /*
    Escribe un programa para leer la altura de un número determinado de personas y calcular la altura media. 
    El número de personas se pide por teclado y debe ser entero un entero mayor que cero. 
    Posteriormente el programa irá pidiendo la altura, en cm, de cada una de las personas 
    y las guardará en una estructura de almacenamiento. Si la altura leída no es positiva, 
    el programa la pasará a número positivo. También es necesario saber cuántas personas 
    tienen una altura superior a la media e inferior a la media. 
         */
        Scanner entradaTeclado = new Scanner(System.in);

        int numPers;
        boolean comprobar = true;
        int alturaMedia;
        int contadorSup = 0;
        int contadorInf = 0;

        System.out.println("Introduzca el número de personas del estudio");

        numPers = entradaTeclado.nextInt();

        do {

            if (!(numPers > 0)) {
                System.out.println("Introduzca un valor positivo.");
                comprobar = false;
            }
        } while (!(comprobar));

        //int[] lista = new int[numPers];
        int[] altura = new int[numPers];
        int alturaTotal = 0;

        for (int i = 0; i < altura.length; i++) {

            System.out.println("Introduzca la altura del sujeto " + i + " en cms:");
            altura[i] = Math.abs(entradaTeclado.nextInt());
            alturaTotal += altura[i];

        }

        alturaMedia = alturaTotal / numPers;

        System.out.println("La altura media es: " + alturaMedia);

        for (int i = 0; i < altura.length; i++) {

            if (altura[i] > alturaMedia) {

                contadorSup++;

            } else if (altura[i] < alturaMedia) {
                contadorInf++;
            }

        }

        System.out.println("Hay " + contadorSup + " personas superiores a la media.");
        System.out.println("Hay " + contadorInf + " personas inferiores a la media.");

    }

}
