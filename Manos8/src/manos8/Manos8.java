/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manos8;

import java.util.Scanner;



public class Manos8 {

    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     
        System.out.println("Ingrese la nota del alumno");
        
       int nota = leer.nextInt();
       
       while (nota < 0 || nota >10 ) {
           
           System.out.println("La nota sale del rango permitido");
           nota = leer.nextInt();
           
           
       }
        
        
    }
    
}
