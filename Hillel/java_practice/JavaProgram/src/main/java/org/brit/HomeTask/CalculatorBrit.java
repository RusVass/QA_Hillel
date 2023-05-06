package org.brit.HomeTask;

import jdk.dynalink.Operation;

import javax.management.OperationsException;
import java.nio.file.OpenOption;
import java.util.List;
import java.util.Locale;

public class CalculatorBrit {

    public static void main(String[] args) {
        List<String> data= List.of("5","DIVIDED","0");
        Float result = calculate(data);
        String s = prepareResults(data, result);
        System.out.println(s);

    }
    public static String prepareResults(List<String> data, Float result){
        Float operand1 = Float.parseFloat(data.get(0));
        Float operand2 = Float.parseFloat(data.get(2));
        Operations operation = Operations.valueOf(data.get(1).toUpperCase());

        return "%s %s %s = %s" .formatted(operand1,operation.getValue(),operand2,result);


// другий варіант
//          String operationSing = " ";
//        switch (operation){
//            case DIVIDED -> operationSing = "/";
//            case MINUS ->  operationSing = "-";
//            case PLUS -> operationSing = "+";
//            case MULTILPLE -> operationSing = "*";
//
//        }
 //      return  operand1+" "+ operationSing+" "+operand2+"="+result;

   }

    public static Float calculate(List<String> data) {
        Float operand1 = Float.parseFloat(data.get(0));
        Float operand2 = Float.parseFloat(data.get(2));
        Operations operation = Operations.valueOf(data.get(1).toUpperCase());

        switch (operation) {
            case PLUS:
                return operand1 + operand2;
            case MINUS:
                return operand1 - operand2;
            case MULTILPLE:
                return operand1 * operand2;
            case DIVIDED:
                if (operand2 == 0) {
                    System.out.println("You cannot divide by 0");
                    return null;
                } else {
                    return operand1 / operand2;
                }
        };


        return null;
    }


    public enum Operations {
        PLUS("+"),
        MINUS("-"),
        MULTILPLE("*"),
        DIVIDED("/");

    private String value;

        Operations(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

}

