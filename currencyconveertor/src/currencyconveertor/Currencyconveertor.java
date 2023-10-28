/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package currencyconveertor;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Currencyconveertor {
 public  static void cur(int a){
        System.out.println("Enter the Dollars you have");
          Scanner s=new Scanner(System.in);
        int b=s.nextInt();
        switch(a){
            case 1:
                 System.out.println("Euro (EUR) Value of "+b+" dollar is "+b*0.99);
                 break;
                 
            case 2:
                 System.out.println("Pound sterling (GBP) Value of "+b+" dollar is "+(b*0.86));
                 break;
            case 3:
                 System.out.println("Australian dollar (AUD) Value of "+b+" dollar is "+(b*1.53));
                 break;
            case 4:
                 System.out.println("Canadian dollar (CAD) Value of "+b+" dollar is "+(b*1.34));
                 break;
            case 5:
                 System.out.println("Swiss franc (CHF) Value of "+b+" dollar is "+(b*0.98));
                 break;
            case 6:
                 System.out.println("Indian Rupee (INR) Value of "+b+" dollar is "+(b*81.31));
                 break;
            default:
                 break;
                
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner s=new Scanner(System.in);
        
        System.out.println("Currency convertor");
        System.out.println("1.Dollar to Euro (EUR)");
        System.out.println("2.Dollar to Pound sterling (GBP)");
        System.out.println("3.Dollar to Australian dollar (AUD)");
        System.out.println("4.Dollar to Canadian dollar (CAD)");
        System.out.println("5.Dollar to Swiss franc (CHF)");
        System.out.println("6.Dollar to Indian Rupee (INR)");
        System.out.println("Enter ur choice");
        int a=s.nextInt();
        cur(a);
        System.out.println("\n");
        System.out.println("Thank you......***");
        
        
        
        
    
        
    }
    
}
