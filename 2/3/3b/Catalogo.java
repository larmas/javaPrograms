
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
    

    @Override
    public boolean equals(Object other) {
        if (other == this) 
            return true;
        if(other == null || other.getClass() != this.getClass())
            return false;

        Catalogo b = (Catalogo) other;
        if (this.nroLibros == b.nroLibros){
            int i=0;
            while (i<this.nroLibros){
                if (this.libros[i].equals(b.libros[i])){
                   i++;
                }else{
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }

  /*  public Catalogo copy() {
        Catalogo nuevo = new Catalogo(); 
        nuevo.libros = libros;
        nuevo.nroLibros = nroLibros;
        return nuevo;
    } */

    public Catalogo copy(){
        Catalogo nuevo = new Catalogo();
        for(int i=0; i<this.nroLibros; i++){
            nuevo.libros[i]=libros[i];
            nuevo.nroLibros= this.nroLibros;
        }
        return nuevo;
    }
}
