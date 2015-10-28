public class Heap{
	/*atributo privado que contiene el array*/
	private Comparable[] array;
	private int DEFAULT_MAX = 30;
	/*atributo privado que contiene la longitud del array*/
	private int lenght;

	//constructor de la clase
	public Heap(){
		lenght=0;
		array = new Comparable[DEFAULT_MAX];
	}//end of constructor

	//metodo que intercambia dos valores en un arreglo
	private void swap(Comparable[] array, int current, int p){
		Comparable aux = array[current];
		array[current] = array[p];
		array[p] = aux;
	}//end of method

	//devuelve el padre de un elemento
	public int parent(int index){
		return (int)(index-1)/2;
	}//end of method

	//inserta un elemento en el heap y lo ordena
	public void insertHeap(Comparable item){
		array[lenght]=item;
		int current = lenght;
		int p = parent(lenght);

		while (p>0 && array[current].compareTo(array[p])>0){
			swap(array,current,p);
			p = parent(current);
		}
		lenght++;
	}//end of method
	
}//end of class