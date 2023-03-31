/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia06_POO.Constructor;

/**
 *
 * @author BRAIAN
 */
public class Libro {
    
    public int ISBN;
    public int NumeroDePaginas;
    public String Título;

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", NumeroDePaginas=" + NumeroDePaginas + ", T\u00edtulo=" + Título + ", Autor=" + Autor + '}';
    }

    public Libro(int ISBN, int NumeroDePaginas, String Título, String Autor) {
        this.ISBN = ISBN;
        this.NumeroDePaginas = NumeroDePaginas;
        this.Título = Título;
        this.Autor = Autor;
    }
    public String Autor;
    

    public Libro() {
    }

//    public Libro(int ISBN, String Título, int NumeroDePaginas, String Autor) {
//        this.ISBN = ISBN;
//        this.Título = Título;
//        this.NumeroDePaginas = NumeroDePaginas;
//        this.Autor = Autor;
//    }

  
    
    
    
    
    
}
