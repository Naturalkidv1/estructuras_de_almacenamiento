package febrero2022.Lista;

import java.util.ArrayList;
import java.util.Collections;

public class ListaLibros {

    // atributo encapsulado de tipo lista
    private ArrayList<Libro> lista;

    // constructor por defecto, solo instancia la estrucutra list
    // sin incluir ningún objeto
    public ListaLibros() {
        this.lista = new ArrayList<>();
    }

    // guarda un libro al final de la lista, si no es nulo
    public void insertarLibro(Libro libro) {
        if (libro != null) {
            lista.add(libro);
        }
    }

    public void imprimirConsola() {
        System.out.println("Imprimiendo lista de libros...");
        lista.forEach(System.out::println);

    }

    public int getCantidadLibros() {

        return lista.size();

    }

    // Eliminar
    public boolean borrarLibro(Libro libro) {

        /*if (lista.contains(libro)) {
            lista.remove(libro);
            return true;
        }
        
        return false;
         */
        return lista.remove(libro);
    }

    public Libro buscarISBN(String isbn) {

        Libro aux = null;

        for (int i = 0; i < lista.size(); i++) {
            aux = lista.get(i);
            if (aux.getIsbn().equals(isbn)) {
                return aux;
            }
        }

        return aux;

    }

    public Libro buscarISBN2(String isbn) {

        Libro aux = new Libro(isbn, "", "", 0, 0);

        int indice = lista.indexOf(aux);
        if (indice >= 0) {
            return lista.get(indice);
        }

        return null;

    }

    public ArrayList<Libro> buscarPorPrecio(double precio) {
        ArrayList<Libro> aux = new ArrayList<>();
        for (Libro libro : this.lista) {
            if (libro.getPrecio() == precio) {
                aux.add(libro);
            }
        }
        return aux;
    }
    
    //Collections.sort(lista) lsita debe contener objetos que implementan comparable
    public void ordenarISBN() {

        Collections.sort(lista);

    }
    // BinarySearch de un objeto según la ordenación natural
    // no funciona si la lista está desordenada
    public int buscarISBN(Libro l) {

        return Collections.binarySearch(lista, l);

    }
    
    public void ordenarComparatorNombre(){
        
        Collections.sort(lista, (Libro l1, Libro l2)->l1.getNombre().compareTo(l2.getNombre()));
        
    }

}
