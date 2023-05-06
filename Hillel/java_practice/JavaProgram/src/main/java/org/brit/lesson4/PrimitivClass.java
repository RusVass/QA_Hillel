package org.brit.lesson4;



public class PrimitivClass {
    public static void main(String[] args) {
        int integerVar = 50;
        double doubleVar = 45.8;

        //приводимо до long все
        // long rez = integerVar + (long)doubleVar;
        double rez = integerVar + doubleVar;
        System.out.println(rez);

        System.out.println();

        char ch = 'U';

        System.out.println(ch);
        System.out.println();

        System.out.println((int) ch);

    }

}
