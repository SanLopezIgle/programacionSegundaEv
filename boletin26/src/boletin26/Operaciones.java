
package boletin26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Operaciones <T>{
    private T dato;

    public Operaciones() {
    }
    
    public T getDato(){
        return dato;
    }
    
    public void setDato(T dato){
        this.dato = dato;
    }
    
    public <T> void insertar(T elemento, ArrayList<T>lista){
        lista.add(elemento);
    }
    
    public <T> void mostrar(ArrayList<T>lista){
        for(T elemento:lista){
            System.out.println("Elemento de la lista: " + elemento);
        }     
    }
    
    public <T> void minimoLista(ArrayList<T>lista){
        System.out.println("Minimo: " + Collections.min(lista,null));
    }
    
    public <T> void maximoLista(ArrayList<T>lista){
        System.out.println("Maximo: " + Collections.max(lista,null));
    }
    
    public <T> void buscar(T elemento, ArrayList<T>lista){
        if(lista.indexOf(elemento) >= 0){
            System.out.println("El elemento " + elemento + "esta en la lista");
        }
        else{
            System.out.println("El elemento " + elemento + "no esta en la lista");
        }
    }
    
    public <T> void eliminar(T elemento, ArrayList<T>lista){
        if(lista.indexOf(elemento) >= 0){
            lista.remove(elemento);
            System.out.println("El elemnto " + elemento + " se ha eliminado");
        }
        else{
            System.out.println("El elemento " + elemento + "no esta en la lista");
        }
    }
}
