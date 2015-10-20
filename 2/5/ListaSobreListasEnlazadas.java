
public class ListaSobreListasEnlazadas implements Lista {

    private Nodo head;                       
    private int numItems;                    

    public ListaSobreListasEnlazadas() {

        head = null;
        numItems = 0;

    } 

    public boolean esVacia() {
        if (numItems==0)
            return true;
        else
            return false;
    } 

    public int longitud() {
        if (!esVacia())
            return numItems-1;
        else
            return 0;
    } 

    public void vaciar() {
        head = null;
        numItems = 0;
    }

    public void insertar(int index, Object item) {
        Nodo newNodo = new Nodo(item);
        Nodo aux = this.head;
        if (this.numItems == 0)
            head = newNodo;
        else {
            int i=0;
            while ((i < index-1) && (index <= numItems)){
                aux.cambiarSiguiente(aux.obtenerSiguiente());
                i++;
            }
            newNodo = aux.obtenerSiguiente();
            aux.cambiarSiguiente(newNodo);
        }
        numItems = numItems + 1;
    } 

    // insertar item en la cabeza de la lista    
    public void insertar(Object item) {

        Nodo nuevoNodo = new Nodo(item);
        nuevoNodo.cambiarSiguiente(head);
        head = nuevoNodo; 
        numItems = numItems + 1;

    } 

    public void eliminar(int index){
        Nodo aux = this.head;
        Nodo aux2 = this.head;
        int i = 0;
        while (( i < index-1)&&(index<=numItems)){
            aux.cambiarSiguiente(aux.obtenerSiguiente());
            i++;
        }
        aux2.cambiarSiguiente(aux.obtenerSiguiente());
        aux.cambiarSiguiente(aux2.obtenerSiguiente());
    } 

    public Object obtener(int index)  {
        Object retorno = null; 
        Nodo nodo = head; 
        for (int i=0; i<index && nodo != null ;i++ ) {
            nodo = nodo.obtenerSiguiente();	    		             
        }   
        if (nodo!=null) {
            retorno = nodo.obtenerItem();
        } 
        return retorno;        
    } 

    public String toString() {
        Nodo aux = this.head;
        for (int i=0; i<numItems; i++){
            System.out.println("Libro "+ i +" "+ aux.obtenerItem()+", ");
            aux.cambiarSiguiente(aux.obtenerSiguiente());
        }
        return null;
    }
}
