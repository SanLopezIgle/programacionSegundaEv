
package boletin21;

import java.util.Arrays;

public class Ejercicio1 {
    
    public int[] crearArray(){
        
       int numeros[] = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*(50 + 1));
        }
        return numeros;
    }
    
    public void mostrarArray(int numeros[]){
        Arrays.sort(numeros); //primero los ordeno para poder visualizarlos al reves
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("posicion " + i + ": " + numeros[i]);
        }
    }
    
}
