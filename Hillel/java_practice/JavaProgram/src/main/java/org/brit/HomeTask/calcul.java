package org.brit.HomeTask;


import java.util.Scanner;

public class calcul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, divided, multiplied, added, subtracted;
        char operator;

        System.out.print("Value A: ");
        num1 = input.nextDouble();

        System.out.print("Operator (/, *, +, -): ");
        operator = input.next().charAt(0);

        System.out.print("Value B: ");
        num2 = input.nextDouble();

        divided = num1 / num2;
        multiplied = num1 * num2;
        added = num1 + num2;
        subtracted = num1 - num2;

        switch (operator) {
            case '/': {
                System.out.println("Result: " + divided);
                break;
            }
            case '*': {
                System.out.println("Result: " + multiplied);
                break;
            }
            case '+': {
                System.out.println("Result: " + added);
                break;
            }
            case '-': {
                System.out.println("Result: " + subtracted);
                break;
            }
            default: {
                System.out.println("Invalid operator!");
                break;
            }
        }
    }

}