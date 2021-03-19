package ar.com.xeven;

import com.sun.corba.se.impl.encoding.BufferManagerWriteCollect;
import com.sun.org.apache.xpath.internal.operations.Bool;

public class Libro {
    //Atributos
    private String tituloLibro;
    private String autor;
    private Integer numeroDeEjemplares;
    private Integer ejemplaresPrestados;

    //constructor
    public Libro(String tituloLibro, String autor, Integer numeroDeEjemplares, Integer ejemplaresPrestados) {
        this.tituloLibro = tituloLibro;
        this.autor = autor;
        this.numeroDeEjemplares = numeroDeEjemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    //getters y setters
    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumeroDeEjemplares() {
        return numeroDeEjemplares;
    }

    public void setNumeroDeEjemplares(Integer numeroDeEjemplares) {
        this.numeroDeEjemplares = numeroDeEjemplares;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    //metodo prestamo
    //incremento la variable al prestar un libro
    //si aun quedan ejemplares del libro que se quiere prestar, se realiza el prestamo
    //devuelve true si se pudo prestar el libro
    public Boolean prestarLibro(){
        Boolean prestado = true;
        if (ejemplaresPrestados>numeroDeEjemplares)
            prestado = false;
        else
            ejemplaresPrestados++;
        return prestado;
    }

    //Metodo devolucion de libros
    //decremento la variable al devolver un libro
    //No se podran devolver libros que no se hayan prestado
    public Boolean devolverLibro(){
        Boolean devuelto = true;
        if (ejemplaresPrestados==0)
            devuelto = false;
        else
            ejemplaresPrestados--;
        return devuelto;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "tituloLibro='" + tituloLibro + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroDeEjemplares=" + numeroDeEjemplares +
                ", ejemplaresPrestados=" + ejemplaresPrestados +
                '}';
    }
}
