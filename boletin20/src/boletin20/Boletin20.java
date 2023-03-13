
package boletin20;

public class Boletin20 {

    public static void main(String[] args) {
        
        Avestruz avestruz = new Avestruz();
        avestruz.caminar();
        
        Gato gato = new Gato();
        gato.caminar();
        gato.nadar();
        
        Morcego morcego = new Morcego();
        morcego.caminar();
        morcego.voar();
        
        Papagaio papagaio = new Papagaio();
        papagaio.caminar();
        papagaio.voar();
        
        Tigre tigre = new Tigre();
        tigre.caminar();
        tigre.nadar();
    }
    
}
