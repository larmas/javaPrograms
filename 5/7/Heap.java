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
	public void swap(int x, int y){
		Comparable aux = array[x];
		array[x] = array[y];
		array[y] = aux;
	}/*end of method*/

	/*devuelve el padre de un elemento*/
	public int parent(int indexHijo){
		return ((indexHijo-1)/2);
	}/*end of method*/

	/*devuelve el indice del maximo hijo*/
	public int maxElem(int indexLeft, int indexRight){
		if (array[indexLeft].compareTo(array[indexRight])>0){
			return indexLeft;
		}
		return indexRight;
	}

	/*metodo isEmpty devuelve true si el heap es vacio*/
	public boolean isEmpty(){
		return lenght==0;
	}/*end of method

	/*inserta un elemento en el heap y lo ordena*/
	/*metodo sort ordena el heap*/
	public void sort (int index){
		int parent = index;
		while (2*parent+1<lenght || 2*(parent+1)<lenght){
			int current = parent;
			int hd = 0;
			int hi = 0;
			if (2*parent+1<lenght){
				hi = (2*parent+1);
			}
			if (2*(parent+1)<lenght){
				hd = (2*(parent+1));
			}
			if (hd == 0){
				parent = hi;
			}else{
				parent = maxElem(hi,hd);
			}
			/*current trae el valor del padre y parent pasa a ser el maximo de los hijos*/
			if (array[current].compareTo(array[parent])<0){
				Comparable aux = array[current];
				array[current] = array[parent];
				array[parent] = aux;
			}
		}/*end of while*/
	}
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
		Comparable deleted = array[lenght-1];
		swap(0,lenght-1);
		lenght--;
		this.sort(0);
		
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