package org.brit.lesson6;

public class Operetion {

    public static void main(String[] args) {
        int operand1 = 13, operand2 = 11;


        if (operand1 > operand2) {
            int operation = operand1 - operand2;
            System.out.println(operation);

        } else if (operand1 < operand2) {
            int operation = operand1 + operand2;
            System.out.println(operation);

        } else if (operand1 == operand2) {
            int operation = operand1 * operand2;
            System.out.println(operation);

        } else if  (operand1 < operand2) {
            int operation = operand1 / operand2;
            System.out.println(operation);
        }


    }
}



