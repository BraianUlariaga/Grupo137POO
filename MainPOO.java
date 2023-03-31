
package Guia06_POO;

import Guia06_POO.Constructor.Libro;
import java.util.Scanner;

/**
 *
 * @author BRAIAN
 */
public class MainPOO {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
    
        System.out.println("Bienvenido. \n Ingrese los siguentes datos del libro: \n 1-Titulo: \n 2-Autor: \n 3-ISBN: \n 4-NumeroDePaginas:");
        
        String Autor1 = leer.nextLine();
        String Nombre1 = leer.nextLine();
           
        Libro l1 = new Libro(leer.nextInt(), leer.nextInt(), Autor1, Nombre1);
        
        System.out.println(l1.toString());
        
    }
    
}
