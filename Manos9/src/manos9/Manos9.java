/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manos9;

import java.util.Scanner;

/**
 *
 * @author dceba
 */
public class Manos9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int contador = 0;
        int num;
        int suma = 0;
        
        
        System.out.println("Ingrese números");
        do {
            num = leer.nextInt();
            contador ++;
            
          if (num >0) {
              suma = suma + num;
                      }
          
          
        } while ((contador < 20) && (num != 0 ));
        
        
      
        System.out.println("Se capturó el número 0");  
        
        System.out.println("El resultado de la suma es:");
        System.out.println(suma);
        
       
        
    }
    
}
