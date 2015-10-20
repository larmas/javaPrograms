import java.io.IOException;

public class Main {
    
    public static void main(String args[]) throws IOException {

        Libro l1 = new Libro("The Lord of the Rings", "J. R. R. Tolkien", 1000);
        Libro l2 = new Libro("Harry Potter", "J. K. Rowling", 600);
        Catalogo c1 = new Catalogo();
        c1.agregarLibro(l1);
        c1.agregarLibro(l2);
        Catalogo c2 = c1.copy(); 
        
        System.out.println("Mostrando libros por primera vez...");
        System.out.println("Catalogo 1:");
        c1.mostrar();
        System.out.println("Catalogo 2:");
        c2.mostrar();


        System.out.println("Mostrando libros por segunda vez...");
        c1.quitarLibro(l2);
        System.out.println("Catalogo 1:");
        c1.mostrar();
        System.out.println("Catalogo 2:");
        c2.mostrar();
        
        // TODO: Cual es el problema? cuando hacemos la copia de c1 en c2, y eliminamos un elemento de c1, cuando
        // mostramos c2 va intentar acceder al libro que le borramos a c1. Es como si c2 fuera un punterito a c1.
        // TODO: Solucione el problema 
   }

}
