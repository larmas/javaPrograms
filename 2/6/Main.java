/**
 * Main class of the Java program. 
 * 
 */

public class Main {

    public static void main(String[] args) {          
			Pila miPila = new PilaSobreListasEnlazadas();
      if (miPila.repOk()){
			    System.out.println("Paso repOK luego de creacion ");
      } else {
                System.out.println("No paso repOK luego de creacion ");
                System.out.println("longitud: " + miPila.longitud());
      }
			int valor = 5;
			int valorCorriente = 0;
			while (valorCorriente <= valor) {
			 
				miPila.apilar(new Integer(valorCorriente));
				if (miPila.repOk()){
    				System.out.println("Paso repOK luego de apilar ");
    		}else{
           	System.out.println("No Paso repOK luego de apilar ");
            System.out.println("longitud: " + miPila.longitud());
        }
				valorCorriente++;
			}
			while (!miPila.esVacia()) {
			  try{
				  Integer elemCorriente = (Integer) miPila.tope();
  				System.out.println("primer elem.: " + elemCorriente.intValue());
	  			miPila.desapilar();
          if (miPila.repOk()){
      				System.out.println("paso repOK luego de desapilar. ");
          }else {
              System.out.println("No Paso repOK luego de desapilar.");                                          
          }
        }catch(Exception e){
				  System.out.println(e.getMessage());
				}  			
			}
			
    }
}

