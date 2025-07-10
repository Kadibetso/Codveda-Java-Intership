
package basiccalculator;

import java.util.Scanner;

/**
 *
 * @author kadyk
 */
public class BasicCalculator {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
 
        
        System.out.println("Enter your first number ");
        double number1= kb.nextDouble();
        
        System.out.println("Enter your second number ");
        double number2= kb.nextDouble();
        
        System.out.println("Enter your desired operation(+,-,*,/ )");
        char sign= kb.next().charAt(0);
        
        double result=0;
        if(sign=='+'){
           result=add(number1,number2);
            System.out.println("Answer is "+ result);
        }
        else if(sign=='-'){
           result=subtract(number1,number2);
            System.out.println("Answer is "+ result);
        }
         else if(sign=='/'){
              if(number2==0){
            System.out.println("Error!!,Cannot divide by zero");
        }
              else{
                   result=divide(number1,number2);
                    System.out.println("Answer is "+ result);
              }
          
        }
         else if(sign=='*'){
           result=multiply(number1,number2);
            System.out.println("Answer is "+ result);
        }
         else{
             System.out.println("Invalid operator");
         }
        
       
    }

    private static double add(double number1, double number2) {
        double answer=number1+number2;
        return answer;
    }

    private static double subtract(double number1, double number2) {
         double answer=number1-number2;
        return answer;
    }

    private static double divide(double number1, double number2) {
         double answer=number1/number2;
        return answer;
    }

    private static double multiply(double number1, double number2) {
         double answer=number1*number2;
        return answer;
    }
    
}
