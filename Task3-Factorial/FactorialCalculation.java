/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialcalculation;

import java.util.Scanner;

/**
 *
 * @author kadyk
 */
public class FactorialCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        System.out.println("Enter a positive interger number");
        int positiveNumber=kb.nextInt();
        
        if(positiveNumber<0){
            System.out.println("Error !!! factorial undefined");
        }
        else{
            long answer=calculateFactorial(positiveNumber);
            System.out.println(" Factorial of "+ positiveNumber +" is "+answer);
        }
        
    }

    private static long calculateFactorial(int positiveNumber) {
        if(positiveNumber==0 ||positiveNumber==1){
            return 1;
                    
        }
        else{
           return  positiveNumber*calculateFactorial(positiveNumber-1);
        }
       
    }
    
}
