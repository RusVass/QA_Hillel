package org.brit.HomeTask;

public class addElementsDoubleString {
    public static double[] addElementToArray(Double[] array, int element) {
        return insertElementInArray(array,element,0);
    }

    public static double[] addElementToArrayBeginning(Double[] array, int element) {
        return insertElementInArray(array,element,array.length);
    }

    public static double[] insertElementInArray(Double[] array, double element, int position) {
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


    public static void main(String[] args) {
        Double[] array = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        double[] doubles = insertElementInArray(array, 7, 2);
        printArray(doubles);
    }
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

    }



}
