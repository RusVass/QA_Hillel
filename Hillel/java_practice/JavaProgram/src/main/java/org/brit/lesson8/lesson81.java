package org.brit;

import java.util.Arrays;
import java.util.Random;

public class lesson81 {
    public static void main(String[] args) {
        String[] a = {"Каждый ", " охотник ", " желает ", " знать ", " где ", " сидит ", " фазан "};
        printArray(a);
        reverse(a);
        printArray(a);


        int[] arrray = generateArray(10);
        printArray(arrray);
        int m = getMaxElementIndex(arrray);
        System.out.println(arrray[m]);


        System.out.println();
        System.out.println();

        int[][] arrray2 = generateArray(5, 8);
        printArray(arrray2);
        int[][] maxMin = getMaxAndMin(arrray2);
        System.out.println();
        printArray(maxMin);

    }

    public static int[][] getMaxAndMin(int[][] array){
        int[][] result = new int[array.length][];
        for (int i = 0; i < array.length; i++){
            result[i] = findMaxAndMin(array[i]);
        }
        return result;
    }

    public static void printArray(String[] array) {
        Arrays.stream(array).map(s -> s + " ").forEach(System.out::print);
        System.out.println();
    }

    public static void printArray(int[] array) {
        Arrays.stream(array).mapToObj(i -> i + " ").forEach(System.out::print);
        System.out.println();
    }

    public static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static int getMaxElementIndex(int[] array) {
        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int[] findMaxAndMin(int[] array) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        return new int[]{min, max};
    }

    public static int[] generateArray(int numberOfElement) {
        int[] array = new int[numberOfElement];
        Random random = new Random();
        for (int i = 0; i < numberOfElement; i++) {
            array[i] = random.nextInt(-15, 16);
        }
        return array;
    }

    public static void reverse(String[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            String left = array[i];
            String right = array[array.length - 1 - i];
            String temp = left;
            left = right;
            right = temp;
            array[i] = left;
            array[array.length - 1 - i] = right;
        }
    }


    public static int[][] generateArray(int rows, int columns) {
        int[][] array = new int[rows][columns];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(-100, 101);
            }
        }
        return array;
    }
}
