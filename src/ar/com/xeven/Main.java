package ar.com.xeven;

import java.util.ArrayList;

/*
En una Biblioteca se desea guardar la informacion de c/u de los libros que hay en esta
Se debe guardar el titulo del libro, autor, numero de ejemplares del libro y
numero de ejemplares prestados
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Libro> libros = new ArrayList<Libro>();
        //creo libros
        Libro libro1 = new Libro("El quijote","Cervantes",1,0);
        Libro libro2 = new Libro("Cenicienta","Desconocido",2,1);
        //agrego los libros a la lista
        libros.add(libro1);
        libros.add(libro2);

        //se muestra por pantalla los datos del objeto libro1
        System.out.println("Libro 1: "+libro1.toString());
        //otra forma de mostrar los datos del libro 1
        System.out.println("Libro 1: ");
        System.out.println("Titulo: "+libro1.getTituloLibro());
        System.out.println("Autor: "+libro1.getAutor());
        System.out.println("Ejemplares: "+libro1.getNumeroDeEjemplares());
        System.out.println("Prestados: "+libro1.getEjemplaresPrestados());
        System.out.println();

        //se realiza el prestamo del libro 1
        if (libro1.prestarLibro()){
            System.out.println("Se ha prestado el libro: "+libro1.getTituloLibro());
        } else {
            System.out.println("No quedan ejemplares del libro: "+libro1.getTituloLibro()+" para prestar");
        }


        //se realiza la devolucion del libro1
        if (libro1.devolverLibro()){
            System.out.println("Se ha devuelto el libro: "+libro1.getTituloLibro());
        } else {
            System.out.println("NO hay ejemplares del libro: "+libro1.getTituloLibro()+" prestados");
        }

        //se realiza otro prestamo del libro1
        if (libro1.prestarLibro()){
            System.out.println("Se ha prestado el libro: "+libro1.getTituloLibro());
        } else {
            System.out.println("No quedan ejemplares del libro: "+libro1.getTituloLibro()+" para prestar");
        }

        //Mostrar los datos del objeto libro1
        System.out.println("Libro 1: "+libro1.toString());
        System.out.println();

        //Mostrar los datos del objeto libro2
        System.out.println("Libro 2: "+libro2.toString());


    }
}
