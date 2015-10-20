/* ------------------------------------------------------------------------ */
/* ------------------------------------------------------------------------ */
/* Interface Pila: Interface que especifica el TAD Pila (polimorfico).      */
/* Las clases que implementan el TAD Pila deben implementar esta, y proveer */
/* implementaciones para todos los metodos abstractos de la misma.          */
/* ------------------------------------------------------------------------ */
/* ------------------------------------------------------------------------ */
public interface Pila {

     /* esVacia(): Indica si la pila es vacia o no                           */
     /* pre: true                                                            */
     /* post: Retorna true ssi la pila no tiene elementos                    */
     public abstract boolean esVacia();


     /* vaciar(): Elimina todos los elementos de la pila                      */
     /* pre: true                                                             */
     /* post: elimina todos los elementos de la pila.                         */
     public abstract void vaciar();


     /* longitud(): Retorna la cantidad de elementos de la pila               */
     /* pre: true                                                             */
     /* post: retorna la cantidad de elementos de la pila.                    */
     public abstract int longitud();


     /* apilar(item): apila item al tope de la pila.                          */
     /* pre: true                                                             */
     /* post: apila item al tope de la pila.                                  */
     /* Si el apilado falla por algun motivo, lanza una excepcion             */
     /* ExcepcionPila.                                                        */
     public abstract void apilar(Object item) throws ExcepcionPilaRunTime; 


     /* desapilar(): elimina el elemento que se encuentra en el tope de la    */
     /* pila.                                                                 */
     /* pre: longitud()>=1                                                    */
     /* post: si la pila es no vacia, se elimina el elemento en el tope de la */
     /* misma.                                                                */
     /* Si la pila esta vacia, lanza una excepcion ExcepcionPila.             */
     public abstract void desapilar() throws ExcepcionPila;

     /* tope(): retorna el elemento en el tope de una pila no vacia.          */
     /* pre: longitud()>=1                                                    */
     /* post: si la pila es no vacia, retorna el item en el tope de la misma. */
     /* Si la pila esta vacia, lanza una excepcion ExcepcionPila.             */
     public abstract Object tope() throws ExcepcionPila;
     
     /* repOk(): Invariante de representacion de la clase Pila             */
     /* pre: true                                                          */
     /* post: la longitud de la pila coincide con la cantidad de           */
     /* items insertados - la cantidad de items eliminados                 */
     
     public boolean repOk();
     
} // fin de clase Pila
