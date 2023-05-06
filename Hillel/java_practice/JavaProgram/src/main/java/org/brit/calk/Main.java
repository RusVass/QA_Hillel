package org.brit.calk;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Double result = calculator
                .firstOperand(4.0)
                .div()
                .secondOperand(2.0)
                .equal()
                .getResult();

        System.out.println(result);

        calculator.clear();
        calculator
                .firstOperand(4.0)
                .plus()
                .secondOperand(2.0)
                .equal()
                .getResult();
        System.out.println(result);

    }
}
