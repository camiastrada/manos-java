/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manos11;

import java.util.Scanner;

/**
 *
 * @author dceba
 */
public class Manos11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        String frase2 
        String f="";
int i;
        for ( i = 0; i  < frase.length(); i++) {
            
            switch (frase.substring(i,i+1)) {
                case "a":
                    frase2.concat("@");
   
                    break;
                case "e": 
                  frase2.concat("#");
                    break;
                case "i": 
                     frase2.concat("$");
                     break;
                     
                case "o":
                     frase2.concat("%");
                     
                     break;
                case "u":
                    frase2.concat("*");
                     break;
                default:
                     frase2.concat(frase.substring(i,i+1));
                      
                      
                
            }
            
           
            System.out.println(frase2);
            
        }
    
        }

}
