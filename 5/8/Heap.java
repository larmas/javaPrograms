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

	/*metodo swap intercambia dos valores en un arreglo*/
	public void swap(int x, int y){
		Comparable aux = array[x];
		array[x] = array[y];
		array[y] = aux;
	}/*end of method*/

	/*metodo parent devuelve el padre de un elemento*/
	public int parent(int indexHijo){
		return ((indexHijo-1)/2);
	}/*end of method*/

	/*devuelve el indice del maximo hijo*/
	public int maxElem(int indexLeft, int indexRight){
		if (array[indexLeft].compareTo(array[indexRight])>0){
			return indexLeft;
		}
		return indexRight;
	}/*end of method*/

	/*metodo isEmpty devuelve true si el heap es vacio*/
	public boolean isEmpty(){
		return lenght==0;
	}/*end of method*/

	/*metodo makeEmpty vacia el heap*/
	public void makeEmpty(){
		lenght = 0;
 	}/*end of method*/

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
	
	/*metodo insertHeap inserta un elemento en el heap y lo ordena*/
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
		if (!isEmpty()){
			swap(0,lenght-1);
			Comparable deleted = array[lenght-1];
			array[lenght-1] = null;
			lenght--;
			this.sort(0);
			return deleted;
		}else{
			return null;
		}
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

	/*metodo repOk verifica que se cumplan las propiedades de heap despues de insertar o eliminar*/
	public boolean repOk(){
		boolean flag = true;
		for (int index = 0; index < lenght-1; index++ ) {
			if (array[2*index+1] != null){
				flag = flag && (array[2*index+1].compareTo(array[index])<0);
			}
			if (array[2*(index+1)] != null){
				flag = flag && (array[2*(index+1)].compareTo(array[index])<0);
			}
			if (array[2*index+1] == null){
				flag = flag && (array[2*index+1] == null);
			}
		}
		return flag;
	}/*end of method*/


	/*metodo heapSort, toma un array , le mete en un heap y vuelve a meter los elementos del heap
	ordenados en el array*/
	public static void heapSort(Comparable[] array, int lenght){
		Heap heap = new Heap();
		for (int index=0; index<lenght; index++ ) {
			heap.insertHeap(array[index]);
		}
		for (int index=lenght-1; index>=0; index-- ) {
			array[index]= heap.deleteMax();
			System.out.println(array[index]);
		}
	}
}/*end of class*/