
package boletin20;

public class Papagaio extends Aves implements IPodeVoar{
    
    @Override
    public void voar(){
        System.out.println("El papagaio vuela");
    }
    
    @Override
    public void caminar(){
        System.out.println("El papagio camina");
    }
}
