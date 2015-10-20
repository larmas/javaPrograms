/**
 * Clase para probar Pila  * 
 */ 

import static org.junit.Assert.*;
//import org.junit.Before;
//import org.junit.Rule;
import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import java.util.Arrays;
//import java.util.Date;

public class UTestPila {
 
    /**
     * Prueba Pila  vacia. La rutina
     * deberia retornar una excepcion.
     */
    @Test(expected = ExcepcionPila.class)
    public void NullPilaTope() {
        Pila miPila = new PilaSobreListasEnlazadas();
        miPila.tope();
    }
    
    /**
     * Prueba Pila  vacia. La rutina
     * deberia retornar una excepcion.
     */
    @Test(expected = ExcepcionPila.class)
    public void NullPilaDesapilar() {
        Pila miPila = new PilaSobreListasEnlazadas();
        miPila.desapilar();
    }

       

    /**
     * Prueba inOut Pila vacia . La rutina
     * deberia retornar la Pila vacia.
     */
    @Test
    public void inOutPila() {
        Pila miPila = new PilaSobreListasEnlazadas();
        miPila.apilar("elem");
        miPila.desapilar();
        assertTrue("Apilar y Desapilar de una Pila vacia :", miPila.esVacia());
    }

    /**
     * Prueba Orden in out de Pila. La rutina
     * deberia retornar si los elementos ingresados al final salen primero.
     */
    @Test
    public void compareArray() {
        Pila miPila = new PilaSobreListasEnlazadas();
        for(int i=0;i < 5; i++)
        	miPila.apilar(Integer.toString(i));
        String[] resultExpected = {"4","3","2","1","0"};	
        String[] result = new String[5];
        for(int i=0;i < 5; i++){
        	result[i] = (String)miPila.tope();
        	miPila.desapilar();
        }	
        assertArrayEquals(resultExpected, result);
    }
}
