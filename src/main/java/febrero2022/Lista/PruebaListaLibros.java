package febrero2022.Lista;

public class PruebaListaLibros {

    public static void main(String[] args) {

        ListaLibros catalogo = new ListaLibros();
        //ListaLibros catalogo2 = new ListaLibros();

        catalogo.insertarLibro(new Libro("123", "Goku le", "Gana", 10, 0.9));
        catalogo.insertarLibro(new Libro("zjsdf", "Goku le", "Gana", 10, 0.19));
        catalogo.insertarLibro(new Libro("Asdf", "Goku le", "Gana", 10, 0.29));
        catalogo.insertarLibro(new Libro("aaa", "Goku le", "Gana", 10, 0.69));
        catalogo.insertarLibro(new Libro("127", "Goku le", "Gana", 10, 0.9));
        catalogo.insertarLibro(new Libro("128", "Goku le", "Gana", 10, 0.9));

//        catalogo2.insertarLibro(new Libro("546", "Gana", "Goku le",10, 0.9));
        catalogo.imprimirConsola();
//        //catalogo2.imprimirConsola();
//
//        System.out.println("Tamaño del catálogo" + catalogo.getCantidadLibros());
//        //System.out.println("Tamaño del catálogo2" + catalogo2.getCantidadLibros());
//
//        Libro libro = catalogo.buscarISBN("123");
//        System.out.println("Libro buscado: " + libro);
//
//        libro = catalogo.buscarISBN2("126");
//        System.out.println("Libro buscado: " + libro);
//
//        catalogo.borrarLibro(new Libro("128", "", "", 0, 0));
//
//        catalogo.imprimirConsola();
//        System.out.println("Libros a 0.9");

        catalogo.ordenarISBN();
        catalogo.imprimirConsola();
        int posicion = catalogo.buscarISBN(new Libro("aaa", "Goku le", "Gana", 10, 0.69));
        System.out.println("Está en la posición: " + posicion);
    }

}
