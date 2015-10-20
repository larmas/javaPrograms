/* ------------------------------------------------------------------------ */
/* ------------------------------------------------------------------------ */
/* Clase PilaSobreListasEnlazadas: Implementacion del TAD Pila, usando      */
/* listas enlazadas.                                                        */
/* Esta clase implementa los metodos abstractos declarados en Pila.         */
/* ------------------------------------------------------------------------ */
/* ------------------------------------------------------------------------ */

public class PilaSobreListasEnlazadas implements Pila {


    private Nodo tope; // usado como la cabeza de la lista enlazada que
                       // almacena los elementos de la pila. 
    private int numItems;                       


    /*--------------------------------------------------------------------*/
    /* PilaSobreListasEnlazadas(): Constructor de la clase                */
    /*  PilaSobreListasEnlazadas.                                         */
    /* Pre: true.                                                         */
    /* Post: Se inicializa tope en null.                                  */
    /*--------------------------------------------------------------------*/
    public PilaSobreListasEnlazadas() {

        //TODO Implementar el constructor de la clase PilaSobreListasEnlazadas

    } // fin de PilaSobreListasEnlazadas()

    /*--------------------------------------------------------------------*/
    /* esVacia(): Retorna true ssi la pila esta vacia.                    */
    /* Pre: true.                                                         */
    /* Post: retorna true ssi tope == null.                                 */
    /*--------------------------------------------------------------------*/
    public boolean esVacia() {
    
        //TODO: Implementar el metodo esVacia()
        return true;
        

    } // fin de esVacia()


    /*--------------------------------------------------------------------*/
    /* longitud(): retorna el numero de elementos en la pila              */
    /* Pre: true                                                          */
    /* Post: retorna el numero de nodos ligados a tope.                   */
    /*--------------------------------------------------------------------*/
    public int longitud() {
    
       //TODO: Implementar el metodo longitud
        return 0;

    } // fin de longitud()

    /*--------------------------------------------------------------------*/
    /* vaciar(): elimina todos los elementos de la pila.                  */
    /* Pre: true.                                                         */
    /* Post: tope se setea en null.                                       */
    /*--------------------------------------------------------------------*/
    public void vaciar() {
    
        //TODO Implementar el metodo vaciar()

    } // fin de vaciar()

    /*--------------------------------------------------------------------*/
    /* apilar(item): apila item en el tope de la pila.                    */
    /* Pre: true                                                          */
    /* Post: se crea un nuevo nodo, se almacena item en este y se enlaza  */
    /* a la cabeza de tope.                                               */
    /* Si ocurre una excepcion, se propaga ExcepcionPila.                 */
    /*--------------------------------------------------------------------*/
    public void apilar(Object item) throws ExcepcionPilaRunTime {
    
       //TODO Implementar el metodo apilar que toma un objeto
 
    } // fin de apilar(item)


    /*--------------------------------------------------------------------*/
    /* desapilar(): elimina el item en el tope de una pila no vacia.      */
    /* Pre: longitud()>0                                                  */
    /* Post: si la pila es no vacia, se decrementa tope.                  */
    /* Si la pila esta vacia, se lanza una excepcion ExcepcionPila.       */
    /*--------------------------------------------------------------------*/    
    public void desapilar() throws ExcepcionPila {
    
        //TODO Implementar el metodo desapilar() 

    } // fin de desapilar()


    /*--------------------------------------------------------------------*/
    /* tope(): retorna el item en el tope de una pila no vacia.           */
    /* Pre: longitud()>0                                                  */
    /* Post: si la pila es no vacia, se retorna items[tope].              */
    /* Si la pila esta vacia, se lanza una excepcion ExcepcionPila.       */
    /*--------------------------------------------------------------------*/    
    public Object tope() throws ExcepcionPila {
    
        if (tope!=null) {
	        return tope.obtenerItem();
	    }
	    else {
	        throw new ExcepcionPila("PilaSobreListasEnlazadas.tope: pila vacia.");
	    } 

    } // fin de tope()
    
    public boolean repOk(){
      if (((tope == null) && (numItems !=0))||((tope!=null)&& numItems<=0)) {
			  return false;
		  }
		  int cantItems = 0;
	    Nodo corriente = tope;	    
      while (corriente != null && cantItems < numItems) {        
    	    cantItems = cantItems + 1;
	        corriente = corriente.obtenerSiguiente();
	    } // fin while
	    if (cantItems!=numItems || corriente !=null){
	        return false;
	    }
		  return true;        
    }

} // fin de clase PilaSobreListasEnlazadas
