
package boletin21;

public class Ejercicio4 {
 
    private int numDni;
    
    public Ejercicio4(int numDni){
        this.numDni = numDni;
    }
    
    public char calculoLetra(){
        int resto = numDni%23;
        char letras[] = new char[]{'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return letras[resto];
    }
}
