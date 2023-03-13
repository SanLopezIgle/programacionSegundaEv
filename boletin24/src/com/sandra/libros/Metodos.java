
package com.sandra.libros;
import com.sandra.datos.PedirDatos;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Iterator;


public class Metodos {
 
    public ArrayList<Libro> anadirLibro(ArrayList<Libro> lista){
        Libro libro = new Libro(PedirDatos.pedirString("Titulo: "));
        lista.add(libro);
        return lista;
    }
    
    public boolean buscarLibro(ArrayList<Libro> lista){
        String isbnBuscar = PedirDatos.pedirString("ISBN: ");
        boolean encontrado = false;
        
        for(Libro elemento : lista){
            if (isbnBuscar.equalsIgnoreCase(elemento.getIsbn())){
                System.out.println("Titulo: " + elemento.getTitulo());
                encontrado = true;
            }
        }
        if(encontrado = false){
            System.out.println("No esta ese libro");
        }
        return encontrado;
    }
    
    public void borrarLibroIsbn(ArrayList<Libro> lista){
        boolean encontrado = buscarLibro(lista);
        if(encontrado = true){
            String isbnbuscar = PedirDatos.pedirString("ISBN: ");
            Iterator it = lista.iterator();
            Libro libro;
            while(it.hasNext()){
                libro = (Libro) it.next();
                if(libro.getIsbn().equalsIgnoreCase(isbnbuscar)){
                    it.remove();
                }
            }
        }
    }
    
    public void ordenar(ArrayList<Libro> lista){
        Collections.sort(lista);
        System.out.println("Lista ordenada");
    }
    
    public void mostrar(ArrayList<Libro> lista){
        for (Libro elemento : lista){
            System.out.println(elemento);
        }
    }
    
    public void borrarLibroUds(ArrayList<Libro> lista){
        int encontrado = 0;
        for(Libro elemento : lista){
            if(elemento.getUds() == 0){
                Iterator it = lista.iterator();
                Libro libro;
                while(it.hasNext()){
                    libro = (Libro) it.next();
                    if(libro.getUds() == 0){
                        it.remove();
                    }
                }
                encontrado = 1;
            }
        }
        if(encontrado == 0){
            System.out.println("No hay libros con 0 unidades");
        }
    }
    
    public boolean buscarLibroDeterminado(ArrayList<Libro> lista){
        String tituloBuscar = PedirDatos.pedirString("TItulo a buscar: ");
        boolean encontrado = false;
        
        for(Libro elemento : lista){
            if(tituloBuscar.equalsIgnoreCase(elemento.getTitulo())){
                System.out.println(elemento.toString());
                encontrado = true;
            }
        }
        if(encontrado = false){
            System.out.println("Ese libro no esta en la libreria");
        }
        return encontrado;
    }
}
