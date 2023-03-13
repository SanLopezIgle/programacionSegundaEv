
package boletin21;
import com.sandra.datos.PedirDatos;

public class Ejercicio3 {
    
    int notas[] = new int[3];
    String alumnos[] = new String[3];
    
    public void crearArray(){
        for (int i = 0; i < notas.length; i++) {
            alumnos[i] = PedirDatos.pedirString("Nombre del alumno: ");
            notas[i] = PedirDatos.pedirInt("Nota del alumno: ");
        }
    }
    
    public int buscarAlumno(String alumnoBuscado){
        for (int i = 0; i < alumnos.length; i++) {
            if(alumnoBuscado.equals(alumnos[i])){
                return i;
            }
        }
        return -1;
    }
    
    public void visualizaNotaAlumno(String alumnoBuscado){
        for (int i = 0; i < alumnos.length; i++) {
            if(alumnoBuscado.equals(alumnos[i])){
                System.out.println("La nota de " + alumnos[i] + "es: " + notas[i]);
                return;
            }
        }
        System.out.println("Error. El alumno no existe");
    }
    
    public void mostrarNumAprobados(int notas[]){
        int aprobados = 0;
        int suspensos = 0;
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] < 5) suspensos++;
            else aprobados++;
        }
        System.out.println("Aprobados: " + aprobados + "\nSuspensos: " + suspensos);
    }
    
    public void mostrarNombresAprobados(){
        System.out.println("Lista aprobados: ");
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] > 5) System.out.println(alumnos[i] + "aprobado");
        }
    }
    
    public void ordenarNotas(){
        int aux = 0;
        String auxNombre;
        
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas.length; j++) {
                if(notas[i] < notas[j]){
                    aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;
                    auxNombre = alumnos[i];
                    alumnos[i] = alumnos[j];
                    alumnos[j] = auxNombre;
                }
            }
            System.out.println("Alumno: " + alumnos[i] + ", nota: " + notas[i]);
        }
        
    }
}
