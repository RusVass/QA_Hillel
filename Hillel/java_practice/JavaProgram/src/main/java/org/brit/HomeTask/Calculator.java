package org.brit.HomeTask;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        String input = scanner.nextLine();

        System.out.println("Enter number 2: ");
        String input2 = scanner.nextLine();

        System.out.println("Enter operator ");
        String op = scanner.nextLine();

        int intEnter1 = Integer.parseInt(input.toString());
        int intEnter2 = Integer.parseInt(input2.toString());
        if (op.contains("+")) {
            System.out.println(intEnter1 + intEnter2);
        }

        if (op.contains("-")) {
            System.out.println(intEnter1 - intEnter2);
        }

        if (op.contains("*")) {
            System.out.println(intEnter1 * intEnter2);
        }

        if (op.contains("/")) {
            double intEnter1Double = (double) intEnter1;
            double intEnter2Double = (double) intEnter2;
            System.out.println(intEnter1Double / intEnter2Double);
        }
    }
}
