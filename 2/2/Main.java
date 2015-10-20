public class Main{
	public static void main(String args[]){
		Racional x = new Racional(1,2);
		Racional y = new Racional(2,4);

		System.out.println("La suma entre x e y es: "+ x.suma(y));
		System.out.println("El producto entre x e y es: "+ x.producto(y));
		System.out.println("La division entre x e y es: "+ x.division(y));
		System.out.println("x es igual a y : "+ x.equals(y));
	}
}//end of class Main