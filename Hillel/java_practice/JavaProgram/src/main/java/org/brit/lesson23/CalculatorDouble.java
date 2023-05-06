package org.brit.lesson23;

import org.apache.commons.io.FileUtils;


import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

//ДЕЛАТЬ ЭТУ ЗАДАЧУ ТОЛЬКО ПОСЛЕ ВСЕХ ПО КАЛЬКУЛЯТОРУ.
//        Написать программу которая реализует минимальный функционал калькулятора, используя коллекцию, перечисления
//
//        Программа должна содержат методы:
//        1. List<String> getDataFromFile(String relativeFilePath) - метод который читает файл и парсит эти данные в List<String>
//        2. Double calculate(List<String> data)
//        которая берет как параметр List<String> и возвращает любое число,
//        где
//        List<String> - коллекция вида: любое число, операция, любое число. например "5","PLUS","5"
//        операция - это строковое представление enum Operations.
//
//        Функция должна возвращать любое число либо null.
//        null возвращается тогда и только тогда, когда возникает исключительная     ситуация.
//        Использовать switch
//        Договоримся использовать строчные представления операции ТОЛЬКО из enum
//
//        String prepareResults(List<String> inputData, Float result),
//        функция которая подготавливает строку для вывода
//        где List<String> inputData - исходная коллекция,
//        result - результат вычесления
//        функция должна возвращать строку вида 5+5=10
//        При этом возможна строка вида 5+-5=0.0
//
//        Так же нужна отдельная функция по выводу результата на экран.

public class CalculatorDouble {


public static void main(String[] args) throws IOException {
   List <String>  dataFromFile = getDataFromFile("calculatorDouble.txt");
    Float calculate = calculate(dataFromFile);
    String s = prepareResults(dataFromFile, calculate);
    System.out.println(s);
    }
     public static List<String> getDataFromFile(String relativeFilePath) throws IOException {
        List<String> list =  FileUtils.readLines(new File(relativeFilePath), Charset.defaultCharset());
         return Arrays.asList(list.get(0).trim().split(","));
   
     }

     public static String prepareResults(List<String> data, Float result){
         Float operand1 = Float.parseFloat(data.get(0).trim());
         Float operand2 = Float.parseFloat(data.get(2).trim());
            Operations operation = Operations.valueOf(data.get(1).trim().toUpperCase());
            String operationSing = " ";
            switch (operation){
                case DIVIDED -> operationSing = "/";
                case MINUS ->  operationSing = "-";
                case PLUS -> operationSing = "+";
                case MULTILPLICATION -> operationSing = "*";

            }
            return  operand1+" "+ operationSing+" "+operand2+"="+result;

            }

    public static String prepareResults1(List<String> data, Float result){
        Float operand1 = Float.parseFloat(data.get(0).trim());
        Float operand2 = Float.parseFloat(data.get(2).trim());
        Operations operation = Operations.valueOf(data.get(1).trim().toUpperCase());


        String resultStr =  operand1+" "+ operation.value+" "+operand2 + "=" + result;
        return resultStr;
    }

        public static Float calculate(List<String> data) {
            Float operand1 = Float.parseFloat(data.get(0).trim());
            Float operand2 = Float.parseFloat(data.get(2).trim());
            Operations operation = Operations.valueOf(data.get(1).trim().toUpperCase());

            switch (operation) {
                case PLUS:
                    return operand1 + operand2;
                case MINUS:
                    return operand1 - operand2;
                case MULTILPLICATION:
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


        enum Operations {
            PLUS("+"),
            MINUS("-"),
            MULTILPLICATION("*"),
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
