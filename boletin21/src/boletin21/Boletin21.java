
package boletin21;
import com.sandra.datos.PedirDatos;

public class Boletin21 {

    public static void main(String[] args) {
        /*
        //******* ejercicio 1 ********
        Ejercicio1 obj1 = new Ejercicio1();
        int aux[];
        aux = obj1.crearArray();
        obj1.mostrarArray(aux);
        */
        /*
        //***** ejercicio 2 *****
        Ejercicio2 obj2 = new Ejercicio2();
        int aux2[];
        aux2 = obj2.crearArray();
        obj2.mostrarArray(aux2);
        obj2.mostrarArrayAprobadosSuspensos(aux2);
        obj2.calcularMedia(aux2);
        obj2.notaMayor(aux2);
        */
        
        //***** ejercicio 3 *****
        Ejercicio3 obj3 = new Ejercicio3();
        int aux3[];
        obj3.crearArray();
        obj3.buscarAlumno("aaa");
        obj3.mostrarNombresAprobados();
        System.out.println("*");
        obj3.ordenarNotas();
        
        /*
        //***** ejercicio 4 *****
        int numero = PedirDatos.pedirInt("Numero DNI: ");
        Ejercicio4 obj4 = new Ejercicio4(numero);
        System.out.println("Letra: " + obj4.calculoLetra());
        */
    }
    
}
