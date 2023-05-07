package org.brit.HomeTask;

public class addElementsInt {
    public static int[] addElementToArray ( int[] array, int element){
            int[] result = new int[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                result[i] = array[i];
            }
            result[array.length] = element;
            return result;
    }

    public static int[] addElementToArrayBeginning ( int[] array, int element){
            int[] result = new int[array.length + 1];
            result[0] = element;
            for (int i = 1; i < result.length; i++) {
                result[i] = array[i - 1];
            }
            return result;
    }

    public static int[] insertElementInArray ( int[] array, int element, int position){

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
        int[] ints = insertElementInArray(array, 7, 3);
        printArray(ints);
    }


}
