package array_list;

import java.util.Random;
import java.util.Scanner;

public class Arrays7 {

    /*
    Escribir un programa que lea del teclado el tamaño de dos arrays de enteros 
    (el mismo tamaño para los dos arrays). El programa inicializará los arrays
    con números aleatorios entre 1 y 100. Existirá un método llamado multiplicar
    que recibirá los dos arrays e irá multiplicando los elementos dos a dos,
    empezando por los elementos que ocupan la posición cero, luego la uno, etc,
    guardando el resultado en otro array, que será devuelto por el método. 
    Además existirá un método para imprimir por pantalla los valores de los arrays.
     */
    private Random r = new Random();
    private Scanner sc = new Scanner(System.in);

    final int NUM_MAX = 100;
    final int NUM_MIN = 1;

    private int[] array1;
    private int[] array2;
    private int[] multiplicacion;
    private int tamanio;

    public Arrays7() {

    }

    public int tamanio() {

        System.out.println("Introduzca el tamaño de los arrays que desea");
        this.tamanio = sc.nextInt();
        return this.tamanio;
    }

    public void creacionArrays() {

        this.array1 = new int[this.tamanio];

        for (int i = 0; i < array1.length; i++) {

            array1[i] = r.nextInt(NUM_MAX) + 1;

        }

        this.array2 = new int[this.tamanio];

        for (int i = 0; i < array2.length; i++) {

            array2[i] = r.nextInt(NUM_MAX) + 1;

        }

    }

    public int[] multiplicar() {

        
        int[] multiplicacionMethod = new int[this.tamanio];

        for (int i = 0; i < multiplicacionMethod.length; i++) {

            multiplicacionMethod[i] = array1[i] * array2[i];

        }

        this.multiplicacion = multiplicacionMethod;

        return this.multiplicacion;
    }

    public void mostrar() {

        System.out.println("\n1 -> ");
        for (int i = 0; i < array1.length; i++) {

            System.out.println(array1[i]);

        }

        System.out.println("\n2 -> ");
        for (int i = 0; i < array2.length; i++) {

            System.out.println(array2[i]);

        }

        System.out.println("\nX -> ");
        for (int i = 0; i < multiplicacion.length; i++) {

            System.out.println(multiplicacion[i]);

        }

    }

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public int[] getArray1() {
        return array1;
    }

    public void setArray1(int[] array1) {
        this.array1 = array1;
    }

    public int[] getArray2() {
        return array2;
    }

    public void setArray2(int[] array2) {
        this.array2 = array2;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "arrays7{" + "r=" + r + ", sc=" + sc + ", NUM_MAX=" + NUM_MAX + ", NUM_MIN=" + NUM_MIN + ", array1=" + array1 + ", array2=" + array2 + ", tamanio=" + tamanio + '}';
    }

    public int[] getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion(int[] multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

}
