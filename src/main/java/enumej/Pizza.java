package enumej;

// clase especial ue contiene objetos constantes
// constructor privado
// no hay setters
// recomendable usar finals
// se definen los objetos al principio del enum

import java.util.Arrays;

public enum Pizza {

    BARBACOA(22, "Barbacoa Cream", new String[]{"Carne", "Bacon", "Queso", "Barbacoa"}, 13.0),
    CARBONARA(14, "Carbonara Cream", new String[]{"Nata", "Bacon", "Queso", "Champiñones"}, 10.0),
    JAMONYQUESO(32, "Queso con Jamon", new String[]{"Jamon", "Bacon", "Queso"}, 20.0);

    private final int tamanio;
    private final String nombre;
    private final String[] ingredientes;
    private final double precio;

    private Pizza(int tamanio, String nombre, String[] ingredientes, double precio) {
        this.tamanio = tamanio;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.precio = precio;
    }

    public int getTamanio() {
        return tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public double getPrecio() {
        return precio;
    }
    
    public void metodoA(){
        
    }

    @Override
    public String toString() {
        return "Pizza{" + "tamanio=" + tamanio + ", nombre=" + nombre + ", ingredientes=" + Arrays.toString(ingredientes) + ", precio=" + precio + '}';
    }

}
