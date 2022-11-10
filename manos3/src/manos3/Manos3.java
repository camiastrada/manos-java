/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manos3;
    
    import java.util.Scanner;

         
/**
 *
 * @author dceba
 */
public class Manos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
           
           
           System.out.println("Ingrese su nombre!");
       String nombre = leer.next();
       
        System.out.println("Ingrese su edad!");
       int edad = leer.nextInt();
       
        System.out.println(nombre);
        System.out.println(edad);
       
        
        
        boolean frio = leer.nextBoolean();
        
        double grados = leer.nextDouble();
        
        char inicial = leer.next().charAt(0);
        
        
  
        
        
    }
    
}
