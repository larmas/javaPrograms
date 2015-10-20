
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
        if (nroLibros == libros.length)
            return false;

        libros[nroLibros] = l;
        nroLibros++;
        return true;
    }

    // Si hay un libro con titulo t en el catalogo lo retorna, sino devuelve null.
    public Libro buscarPorTitulo(String t) {
        // TODO: Implementar
        // HINT: Usar el metodo equals para comparar strings
        // ej: s1.equals(s2) retorna true si y solo si s1 y s2 son el mismo string.
        return null;
    }


    public boolean quitarLibro(Libro l) {
        boolean found = false;
        int foundind = -1;
        for (int i = 0; i<nroLibros; i++) {
            if (libros[i].equals(l)) {
                found = true;
                foundind = i;
                break;
            }
        }
        
        if (found) {
            for (int i = foundind; i<nroLibros-1; i++) 
                libros[i] = libros[i+1];
            libros[nroLibros-1] = null;
            nroLibros--;
            return true;
        }
        else 
            return false;

    }


    public void mostrar() {
        for (int i = 0; i<nroLibros; i++) 
            System.out.println("Libro " + i + ": " + libros[i].toString());
    }
    


    public void ordenar() {
    	// TODO: Implementar
    	
    }



	
	
}
