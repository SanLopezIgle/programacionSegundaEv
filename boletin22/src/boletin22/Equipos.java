
package boletin22;


public class Equipos {
    
    private String nombre;
    private int goles[];
    private int totalGoles;
    
    public Equipos(){
        
    }

    public Equipos(String nombre) {
        this.nombre = nombre;
    }

    public Equipos(String nombre, int[] goles) {
        this.nombre = nombre;
        this.goles = goles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getGoles() {
        return goles;
    }

    public void setGoles(int[] goles) {
        this.goles = goles;
        int acumulador = 0;
        for (int i = 0; i < goles.length; i++) {
            acumulador += goles[i];
        }
        totalGoles = acumulador;
    }
    
    public int getTotalGoles(){
        return totalGoles;
    }

    @Override
    public String toString() {
        return "Equipos{" + "nombre=" + nombre + ", goles=" + goles + '}';
    }
    
    
    
    
}
