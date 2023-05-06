package org.brit.HomeTask;

import java.util.Scanner;

public class EnglishCalc {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int number1 = input.nextInt();

        System.out.println("Enter second number");
        int number2 = input.nextInt();

        System.out.println("Enter operation: +,-,*,/");
        String operation = input.next();

        int output = 0;


         if (operation.equals("+")) {
            output = number1 + number2;
            System.out.println("Sum of "+number1+" and "+number2+" is: " +output);
        }
        else if (operation.equals("-")) {
            output = number1 - number2;
            System.out.println("Subtraction of "+number2+" from "+number1+" is: " +output);
        }
        else if (operation.equals("*")) {
            output = number1 * number2;
            System.out.println("Product of "+number1+" and "+number2+" is: " +output);
        }
        else if (operation.equals("/")) {
            if(number2 == 0) {
                System.out.println("You cannot divide by 0");
            } else {
                output = number1/number2;
                System.out.println("Division of "+number1+" by "+number2+" is: " +output);
            }
        }
    }
}
