
package boletin21;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio2 {
    
    public int[] crearArray(){
        int notas[] = new int[5];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random()*(10+1));
        }
        return notas;
    }
   
    public void mostrarArray(int notas[]){
        System.out.println("Notas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
    
    public void mostrarArrayAprobadosSuspensos(int notas[]){
        int aprobados = 0;
        int suspensos = 0;
        
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] < 5) suspensos++;
            else aprobados++;
        }
        
        System.out.println("Aprobados: " + aprobados + "\n"
                            + "Suspensos: " + suspensos);
    }
    
    public void calcularMedia(int notas[]){
        int acumulador = 0;
        int notaMedia = 0;
        for (int i = 0; i < notas.length; i++) {
            acumulador += notas[i];
        }
        notaMedia = acumulador / notas.length;
        System.out.println("Nota media de la clase: " + notaMedia);
    }
    
    public void notaMayor(int notas[]){
        int notaMayor = 0;
        for (int i = 0; i < notas.length; i++) {
            if(notaMayor < notas[i]){
                notaMayor = notas[i];
            }
        }
        System.out.println("La nota mas alta es: " + notaMayor);
    }
}
