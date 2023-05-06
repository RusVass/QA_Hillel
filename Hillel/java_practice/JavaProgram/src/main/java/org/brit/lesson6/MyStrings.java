package org.brit.lesson6;

public class MyStrings {

    public static void main(String[] args) {
        String string = "Hello World";

// 1 виводить слова Hello World з початку до кінця

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            System.out.println(c);
        }
        System.out.println("======");

// 2 виводить слова з кінця на початок

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(string.length() - 1 - i);
            System.out.println(c);
        }
        System.out.println("--//---");

// 3   виводить слова (реверс) наоборот з кінця на початок
        for (int i = string.length() - 1; i >= 0; i--) {
            char c = string.charAt(i);
            System.out.print(c);
        }
        System.out.println();

// 4 виводить слова  Hello world з початку до кінця
 //  виконується поки умова true
        int j = 0;

        while (j < string.length()) {
            char c = string.charAt(j);
            System.out.print(c);
           j++;
        }
        System.out.println();

//        Integer integer;
//        Double doubleVar;
//        Character character;

        // запаковуєм 5 в обєкт і породили інтеджер

        Integer integer = 5;
        int intVar = 0;


        // дістаємо 5 і записуємо у примітив
        intVar = integer;

        // нарощуємо примітив і записуємо в обєкт
        intVar++;
        integer = intVar;

// порівняння примітивів

        if (intVar==integer);

        Double doubleVar;
        Character character = 'c';

        System.out.println(intVar);


        while (j < string.length()) {
            char c = string.charAt(j);
            System.out.print(c);
            j++;
        }
        System.out.println();



 // for безкінечний запмсується так
 //       for (;;){
  //      }
// while безкінечний записується так
  //     while (true){
  //      }



    }


    }

