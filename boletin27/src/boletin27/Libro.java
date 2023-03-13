
package boletin27;

public class Libro {
    
    private String titulo;
    private String autor;
    private float precio;
    private int uds;

    public Libro() {
    }
    
    public Libro(String titulo){
        this.titulo = titulo;
    }
    public Libro(String titulo, String autor, float precio, int uds) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.uds = uds;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUds() {
        return uds;
    }

    public void setUds(int uds) {
        this.uds = uds;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + ", uds=" + uds + '}';
    }
    
    
}
