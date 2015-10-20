
public class Main {
    
    public static void main(String args[]) {

        Catalogo c = new Catalogo();
        Libro l1 = new Libro("a1","a",12);
        Libro l2 = new Libro("a2","b",13);
        Libro l3 = new Libro("a3","c",14);

        c.agregarLibro(l1);
        c.agregarLibro(l2);
        c.agregarLibro(l3);
        // TODO: Crear 3 libros y agregarlos al catalogo.
        c.mostrar();
        
        Libro resBusq1 = c.buscarPorTitulo("a1");
        Libro resBusq2 = c.buscarPorTitulo("a4");

        if (resBusq1 == null)
        	System.out.println("El libro a1 no existe");
        else
        	resBusq1.toString();

        if (resBusq2 == null)
        	System.out.println("El libro a4 no existe");
        else
        	resBusq2.toString();
        // TODO: usar buscarPorTitulo para buscar un libro que exista en el catalogo c y otro que no.
   }


}
