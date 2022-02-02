/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos_avanzado;

/**
 *
 * @author ajbazan01
 */
public class Vehiculo {

    // Atributos
    private String matricula;
    private String marca;
    private String color;

    // Metodos
    /*
    public Vehiculo() {
        matricula = "0000 ZZZ";
        marca = ""; // Renault y Mercedes
    }
     */
    public Vehiculo() {

        ArraysVehiculares av = new ArraysVehiculares();

        matricula = av.matriculaArrayMetodo();
        marca = av.marcaArrayObtenerMetodo();
        color = av.colorArrayObtenerMetodo();
    }

    @Override
    public String toString() {
        return "Vehiculo [" + matricula + " - " + marca + " - " +color + ']';
    }
    
    

    //Constructor Avanzado con Arrays
    // Constructor con parámetros
    public Vehiculo(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = "";
        if (marca.equalsIgnoreCase("Renault") || marca.equalsIgnoreCase("Mercedes")) {
            this.marca = marca;
        }

    }

    public void imprimirAtributos() {
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Marca: " + this.marca);
    }

    public String getAtributos() {
        String tmp = this.matricula + " - " + this.marca;
        return tmp;
    }

    //---------------------
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = "";
        if (marca.equalsIgnoreCase("Renault") || marca.equalsIgnoreCase("Mercedes")) {
            this.marca = marca;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
