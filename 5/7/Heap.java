public class Heap{
	/*atributo privado que contiene el array*/
	private Comparable[] array;
	private int DEFAULT_MAX = 30;
	/*atributo privado que contiene la longitud del array*/
	private int lenght;

	/*constructor de la clase*/
	public Heap(){
		lenght=0;
		array = new Comparable[DEFAULT_MAX];
	}/*end of constructor*/

	/*metodo que intercambia dos valores en un arreglo*/
	public void swap(int current, int p){
		Comparable aux = array[current];
		array[current] = array[p];
		array[p] = aux;
	}/*end of method*/

	/*devuelve el padre de un elemento*/
	public int parent(int indexHijo){
		return (indexHijo-1)/2;
	}/*end of method*/

	/*devuelve el indice del hijo derecho*/
	public int right(int indexParent){
		return 2*(indexParent+1);
	}/*end of method*/

	/*devuelve el indice del hijo izquierdo*/
	public int left(int indexParent){
		return (2*indexParent)+1;
	}

	/*metodo isEmpty devuelve true si el heap es vacio*/
	public boolean isEmpty(){
		return lenght==0;
	}/*end of method

	/*inserta un elemento en el heap y lo ordena*/
	public void insertHeap(Comparable item){
		array[lenght]=item;
		int current = lenght;

		while (parent(current)>=0 && array[current].compareTo(array[parent(current)])>0){
			swap(current,parent(current));
			current = parent(current);
		}
		lenght++;
	}/*end of method*/

	/*metodo deleteMax elimina el mayor elemento del heap(cabeza) y ordena*/
	public Comparable deleteMax(){
		swap(0,lenght-1);
		Comparable deleted = array[lenght-1];
		lenght--;
		int current = lenght-1;

		while (parent(current)>=0 && array[current].compareTo(array[parent(current)])>0){
			swap(current,parent(current));
			current = parent(current);
		}
		return deleted;
	}

	/*metodo toString imprime los elementos del arreglo*/
	public String toString(){
		int index = 0;
		String result = "";
		while (index<this.lenght){
			result +=" "+ this.array[index];
			index++;
		}
		return result;
	}/*end of method*/
}/*end of class*/