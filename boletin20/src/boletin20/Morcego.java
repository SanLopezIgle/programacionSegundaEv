
package boletin20;

public class Morcego extends Mamifero implements IPodeVoar{
    
    @Override
    public void caminar(){
        System.out.println("El murcielgo vuela");
    }
    
    @Override
    public void voar(){
        System.out.println("El murcielago vuela");
    }
    
}
