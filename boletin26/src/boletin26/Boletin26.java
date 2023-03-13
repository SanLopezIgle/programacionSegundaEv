
package boletin26;

import java.util.ArrayList;

public class Boletin26 {
    
    public static void main(String[] args) {
        
        Operaciones<Integer> lista = new Operaciones<>();
        ArrayList<Integer> lista1 = new ArrayList<>();
        
        lista.insertar(3, lista1);
        lista.insertar(4, lista1);
        lista.insertar(6, lista1);
        
        lista.mostrar(lista1);
        lista.minimoLista(lista1);
        lista.maximoLista(lista1);
        lista.buscar(3, lista1);
        lista.eliminar(1, lista1);
        lista.mostrar(lista1);
    }
    
}
