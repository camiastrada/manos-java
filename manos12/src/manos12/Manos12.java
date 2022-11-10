
package manos12;

import java.util.Scanner;

public class Manos12 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos números");
        int num1 = leer.nextInt();
        int num2= leer.nextInt();
        
        
        Esmultiplo(num1,num2);
    }
    
    
    public static void Esmultiplo(int num1, int num2){
           
        if (num1 % num2 == 0){
            System.out.println(num1 + " es multiplo de " + num2);
        }  else if (num2 % num1 == 0) {
                    System.out.println(num2 + " es multiplo de "+ num1);
                    } else {
        
            System.out.println("ningun numero es multiplo del otro.");
        }
        
    }
}
