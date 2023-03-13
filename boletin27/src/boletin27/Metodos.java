
package boletin27;
import com.sandra.datos.PedirDatos;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Metodos {
    
    FileWriter out =  null;
    PrintWriter fich = null;
    Scanner sc;
    
    public void escribirPalabras(File fichero){
        try{
            out = new FileWriter(fichero);
            fich = new PrintWriter(out);
            fich.println(PedirDatos.pedirString("Nombre libro: "));
        }catch(IOException ex){
            System.out.println("Error escritura" + ex.getMessage());
        }finally{
            fich.close();
        }
    }
    
    public void agregarPalabras(File fichero){
        try{
            out = new FileWriter(fichero,true);
            fich = new PrintWriter(out);
            fich.println(PedirDatos.pedirString("Nombre libro: "));
        }catch(IOException ex){
            System.out.println("Error escritura" + ex.getMessage());
        }finally{
            fich.close();
        }        
    }
    
    public ArrayList<Libro> leerObjeto(File fichero){
        ArrayList<Libro> lista = new ArrayList<>();
        String aux [];
        try{
            sc = new Scanner(fichero);
            while(sc.hasNextLine()){
                aux = sc.nextLine().split(", ");
                lista.add(new Libro(aux[0], aux[1], Float.parseFloat(aux[2]), Integer.parseInt(aux[3])));
            }
        }catch(IOException ex){
            System.out.println("No se pudo leer el fichero");
        }finally{
            fich.close();
        }    
        return lista;
    }
    
    public void buscarTitulo(ArrayList<Libro> lista){
        String titulo = PedirDatos.pedirString("Titulo: ");
        int libroEncontrado = 0;
        for (int i = 0; i < lista.size(); i++) {
            if(titulo.equalsIgnoreCase(lista.get(i).getTitulo())){
                JOptionPane.showMessageDialog(null, lista.get(i).getPrecio());
                libroEncontrado = 1;
                break;
            }
        }
        if(libroEncontrado == 0){
            JOptionPane.showMessageDialog(null, "El libro no existe");
        }
    }
    
    public void mostrar(ArrayList<Libro> lista){
        for(Libro lib : lista){
            System.out.println(lib);
        }
    }
    
    public ArrayList<Libro> borrar(ArrayList<Libro> lista){
        ArrayList<Libro> filtrada = new ArrayList<>();
        for(Libro lib : lista){
            if(lib.getUds() > 0){
                filtrada.add(lib);
            }
        }
        return filtrada;
    }
    
    public void reemplazarFichero(File fichero, ArrayList<Libro> lista){
        try{
            out = new FileWriter(fichero);
            fich = new PrintWriter(out);
            for (int i = 0; i < lista.size(); i++) {
                fich.println(lista.get(i));
            }
        }catch(IOException ex){
            System.out.println("Error escritura" + ex.getMessage());
        }finally{
            fich.close();
        }        
    }
    
    public void modificarPrecio(ArrayList<Libro> lista){
        String titulo = PedirDatos.pedirString("TItulo: ");
        int libroEncontrado = 0;
        for (int i = 0; i < lista.size(); i++) {
            if(titulo.equalsIgnoreCase(lista.get(i).getTitulo())){
                float precioNuevo = PedirDatos.pedirFloat("Nuevo precio: ");
                lista.get(i).setPrecio(precioNuevo);
                libroEncontrado = 1;
                break;
            }
        }
        if(libroEncontrado == 0){
            JOptionPane.showMessageDialog(null, "EL libro no existe");
        }
    }
}   

