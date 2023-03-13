
package boletin27;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Boletin27 {


    public static void main(String[] args) {
       
        Metodos obj= new Metodos();
        File f = new File("libreria.txt");
        ArrayList<Libro> lista = obj.leerObjeto(f);
        int opcion;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("***MENU***\n1---> AÑADIR LIBRO \n2---> CONSULTAR \n3---> MOSTRAR \n4--->BORRAR \n5--->MODIFICAR \n6--->SALIR \nTeclea opción"));
            switch(opcion){
                case 1:
                    obj.agregarPalabras(f);
                    lista = obj.leerObjeto(f);
                    break;
                case 2:
                    obj.buscarTitulo(lista);
                    break;
                case 3:
                    obj.mostrar(lista);
                    break;
                case 4:
                    ArrayList<Libro> filtrada = obj.borrar(lista);
                    obj.reemplazarFichero(f, lista);
                    lista = obj.leerObjeto(f);
                    break;
                case 5:
                    obj.modificarPrecio(lista);
                    obj.reemplazarFichero(f, lista);
                    lista = obj.leerObjeto(f);
                    break;
                default:
                    break;
            }
        }while(opcion <= 5);
    }
    
}
