
public class Catalogo {
    
    private Libro[] libros;
    private int nroLibros;
    private final int DEFAULT_MAX = 50;

    public Catalogo() {
        libros = new Libro[DEFAULT_MAX];
        nroLibros = 0;
    }

    public Catalogo(int max) {
        libros = new Libro[max];
        nroLibros = 0;
    }

    public boolean agregarLibro(Libro l) {
        if (nroLibros == libros.length || buscarPorTitulo(l.obtenerTitulo()) != null)
            return false;

        libros[nroLibros] = l;
        nroLibros++;
        return true;
    }

    // Si hay un libro con titulo t en el catalogo lo retorna, sino devuelve null.
    public Libro buscarPorTitulo(String t) {
        for (int i=0; i<nroLibros; i++){
            if (libros[i].obtenerTitulo().equals(t))
                return this.libros[i];
        }//end for
        return null;
    }

    public void mostrar() {
         System.out.println("-------------------"+ nroLibros);
        for (int i = 0; i<nroLibros; i++) {
            System.out.println("Libro " + i + ": " + libros[i].toString());
           
        }
    }
    

}
