
package boletin24;

import com.sandra.libros.*;
import java.util.ArrayList;
import com.sandra.datos.PedirDatos;

public class Boletin24 {

    public static void main(String[] args) {
        
        ArrayList<Libro> lista = new ArrayList<>();
        Metodos obj = new Metodos();
        
        int opcion;
        do{
            opcion = PedirDatos.pedirInt("***MENU*** \n\n 1---> Añadir libro \n 2---> Vender \n 3---> Ordenar \n 4---> Mostrar \n 5---> Baja a libros con unidades en cero \n 6---> Consultar un libro determinado \n\n Teclea una opcion de las anteriores");
            switch(opcion){
                case 1:
                    obj.anadirLibro(lista);
                    break;
                case 2:
                    obj.borrarLibroIsbn(lista);
                    break;
                case 3:
                    obj.ordenar(lista);
                    break;
                case 4:
                    obj.mostrar(lista);
                    break;
                case 5:
                    obj.borrarLibroUds(lista);
                    break;
                case 6:
                    obj.buscarLibroDeterminado(lista);
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
            
        }while(opcion <= 5);
    }
    
}
