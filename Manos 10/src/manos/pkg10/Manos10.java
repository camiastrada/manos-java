

package manos.pkg10;

import java.util.Scanner;


public class Manos10 {


    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        int num1, num2, num3, num4;
        
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        num3 = leer.nextInt();
        num4 = leer.nextInt();
        
        
        System.out.print(num1);  
        for (int i = 0; i<num1; i++) {
            
            System.out.print("*");
        }
         System.out.println("");
         
          
        System.out.print(num2);  
        for (int i = 0; i<num2; i++) {
            
            System.out.print("*");
        }
         System.out.println("");
         
         
        System.out.print(num3);  
        for (int i = 0; i<num3; i++) {
            
            System.out.print("*");
        }
         System.out.println("");
         
          
        System.out.print(num4);  
        for (int i = 0; i<num4; i++) {
            
            System.out.print("*");
        }
         System.out.println("");
         
    }
    
}
