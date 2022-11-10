/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manos.pkg13;

import java.util.Scanner;

/**
 *
 * @author dceba
 */
public class Manos13 {
    public static void main(String[] args) {
   
       Scanner leer = new Scanner(System.in);
       
             String[] companeros = new String[9];
             
             System.out.println("Ingrese el nombre de sus compañeros");
              for (int i = 0; i < 9; i++) {
          companeros[i] = leer.nextLine();
                 
      }
              
              for (int i = 0; i < 9; i++) {
            
                  System.out.println(companeros[i]);
                 
      }
             
                     
              
    }

 
  }
