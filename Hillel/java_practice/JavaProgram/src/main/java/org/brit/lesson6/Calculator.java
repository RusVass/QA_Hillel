package org.brit.lesson6;

import static java.lang.String.*;

public class Calculator {
    public static void main(String[] args) {
        int operand1 = 15, operand2 = 5;
        String operation = "+"; // +,-,*,/,%

        int rez = 0;

            switch (operation) {
                case "+":
                    rez =(operand1 + operand2);
                    break;
                case "*":
                    rez = (operand1 * operand2);
                    break;
                case "-":
                   rez = (operand1 - operand2);
                    break;
                case "/":
                    if (operand2==0){
                        System.out.println("You cannot divide by 0");
                        return;
                    }else {
                        rez =(operand1 / operand2);
                        break;
                    }
                case "%":
                    if (operand2==0){
                        System.out.println("You cannot divide by 0");
                        return;
                    }else {
                        rez =(operand1 % operand2);
                        break;
                    }
                default:
                    System.out.println("Enter valid operation");
            }
        System.out.println(operand1+" "+operation+" "+operand2+" "+"= "+rez+" ");

        System.out.println("%s %s %s = %s".formatted(operand1,operation,operand2,rez));
        }
    }


