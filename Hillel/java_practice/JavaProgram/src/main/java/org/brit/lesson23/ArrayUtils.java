package org.brit.lesson23;


//Треба створити 3 статичні методи і помістити їх в окремий класс ArrayUtils:
// puplic static int[] addElementToArray(int[] array, int element) - метод, що добавляє елемент в кінець масиву
// puplic static int[] addElementToArrayBeginning(int[] array, int element) - метод, що добавляє елемент в начало массиву
// puplic static int[] insertElementInArray(int[] array, int element, int position) - метод, що вставляє елемент element в задану позицію position масиву.
// Також треба добавити в цю бібліотеку метод
// public static void printArray(int[] array) - яка виводить на екран елементи array через кому. На приклад, 1,2,3,4,5,6 - після останього елемента КОМИ НЕМАЄ.
// Також додати такі самі методи для addElementToArray, addElementToArrayBeginning, insertElementInArray та printArray для double массиву та рядка (String), тобто
// puplic static double[] addElementToArray(double[] array, double element)
// puplic static double[] addElementToArrayBeginning(double[] array, double element)
// puplic static double[] insertElementInArray(double[] array, double element)
// public static void printArray(double[] array)
///puplic static String addElementToString(String string, char element)
//puplic static String addElementToStringBeginning(String string, char element)
//puplic static String insertElementInString(String string, char ch, int position)
//ВАЖЛИВО!!!!
//НЕ ВИКОРИСТОВУВАТИ ІНШІ КЛАСИ ЧИ БІБЛІОТЕКИ ДЛЯ РОБОТИ З МАСИВАМИ ТА РЯДКАМИ
//ДЛЯ РОБОТИ З РЯДКОМ ВИКОРИСТОВУВАТИ ТІЛЬКИ ІНШІ РЯДКИ ТА МЕТОДИ КЛАСУ String
//

public class ArrayUtils {


        public static int[] addElementToArray ( int[] array, int element){
//               return insertElementInArray(array,element,0);
            int[] result = new int[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                result[i] = array[i];
            }
            result[array.length] = element;
            return result;
        }

        public static int[] addElementToArrayBeginning ( int[] array, int element){
//             return insertElementInArray(array,element,array.length);
            int[] result = new int[array.length + 1];
            result[0] = element;
            for (int i = 1; i < result.length; i++) {
                result[i] = array[i - 1];
            }
            return result;
        }

        public static int[] insertElementInArray ( int[] array, int element, int position){
            // 1, 4, 5, 6, 10 ==>33, 2
            // 1,4,33,5,6,10
            //
            int[] result = new int[array.length + 1];
            for (int i = 0; i < position; i++) {
                result[i] = array[i];
            }
            result[position] = element;

            for (int i = position; i < array.length; i++) {
                result[i + 1] = array[i];
            }
            return result;

        }

        public static void printArray ( int[] array){
            for (int i = 0; i < array.length; i++) {
                if (i != array.length - 1) {
                    System.out.println(array[i] + ", ");
                } else {
                    System.out.println(array[i]);
                }
            }
        }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] ints = insertElementInArray(array, 777, 3);
        printArray(ints);
    }

    public static double[] addElementToArray(double[] array, int element) {
        return insertElementInArray(array,element,0);
//        int[] result = new int[array.length + 1];
//        for (int i = 0; i < array.length; i++) {
//            result[i] = array[i];
//        }
//        result[array.length] = element;
//        return result;
    }

    public static double[] addElementToArrayBeginning(double[] array, int element) {
        return insertElementInArray(array,element,array.length);
//        int[] result = new int[array.length + 1];
//        result[0] = element;
//        for (int i = 1; i < result.length; i++) {
//            result[i] = array[i - 1];
//        }
//        return result;
    }

    public static double[] insertElementInArray(double[] array, double element, int position) {
        // 1, 4, 5, 6, 10 ==>33, 2
        // 1,4,33,5,6,10
        //
        double[] result = new double[array.length + 1];
        for (int i = 0; i < position; i++){
            result[i] = array[i];
        }
        result[position]=element;

        for (int i = position; i < array.length; i++){
            result[i+1]=array[i];
        }
        return result;

    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.println(array[i] + ", ");
            } else {
                System.out.println(array[i]);
            }
        }
    }
//    public static void main(String[] args) {
//        Double[] array = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
//        double[] doubles = insertElementInArray(array, 777, 3);
//        printArray(doubles);
//    }


    public static String addElementToString(String string, char element){
    return  string+ element;
    }

    public static String addElementToStringBeginning(String string, char element){
    return  element+ string;
    }

    public static String insertElementInString(String string, char ch, int position){
        String beforePosition = string.substring(0,position);
        String afterPosition = string.substring(position);
        return  beforePosition + ch + afterPosition;
       // return string.substring(0, position)+ ch+string.substring(position);
    }





}
