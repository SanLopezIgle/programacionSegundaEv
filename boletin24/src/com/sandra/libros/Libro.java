
package com.sandra.libros;

public class Libro implements Comparable{
    
    private String titulo;
    private String autor;
    private String isbn;
    private float precio;
    private int uds;

    public Libro() {
    }

    public Libro(String titulo) {
        this.titulo = titulo;
    }
    
    public Libro(String titulo, String autor, String isbn, float precio, int uds) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", precio=" + precio + ", uds=" + uds + '}';
    }

    @Override
    public int compareTo(Object o) {
        Libro x = (Libro)o;
        if(this.titulo.compareToIgnoreCase(x.titulo) > 0)
            return 1;
        else if(this.titulo.compareToIgnoreCase(x.titulo) < 0)
            return -1;
        else
            return 0;
    }
        
    
    
}
