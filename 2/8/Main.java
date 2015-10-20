
public class Main {	
	

	public static void main(String [] args) {
		
		int al = 10;
		Integer a [] = new Integer [al];
		for (int i = 0; i < al; i++) {
			a[i] = al-i;
		}

		System.out.println("Antes de sort");
		for (int i = 0; i < al; i++) {
			System.out.println(a[i]);
		}
		
		ArrayUtils.sort(a, a.length);
		System.out.println("Despues de sort");
		for (int i = 0; i < al; i++) {
			System.out.println(a[i]);
		}
		
		int asl = 3;
		String as [] = new String [asl];
		as[0] = "Hola";
		as[1] = "Mundo";
		as[2] = "Cruel";

		System.out.println("Antes de sort");
		for (int i = 0; i < asl; i++) {
			System.out.println(as[i]);
		}

		ArrayUtils.sort(as, as.length);
		System.out.println("Despues de sort");
		for (int i = 0; i < asl; i++) {
			System.out.println(as[i]);
		}
		
		
        Libro l1 = new Libro("The Lord of the Rings", "J. R. R. Tolkien", 1000);
        Libro l2 = new Libro("Harry Potter", "J. K. Rowling", 600);
        Catalogo c1 = new Catalogo();
        c1.agregarLibro(l1);
        c1.agregarLibro(l2);
        System.out.println("Antes de sort");
        c1.mostrar();
        c1.ordenar();
        System.out.println("Despues de sort");
        c1.mostrar();
        
	}
	
	
}
