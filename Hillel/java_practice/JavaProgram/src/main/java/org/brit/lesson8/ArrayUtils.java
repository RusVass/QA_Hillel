package org.brit.lesson8;

import java.util.Random;

public class ArrayUtils {
    public static int[] generateArray(int size, int min, int max) {
        int[] result = new int[size];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(min, max + 1);
        }
        return result;
    }

    public static int[][] generateArray(int rows, int columns, int min, int max) {
        int[][] result = new int[rows][];
        for (int i = 0; i < result.length; i++){
            result[i] = generateArray(columns, min, max);
        }
        return result;
    }

    public static void printArray(int[] array) {
        for (int arrayElement : array) {
            System.out.print(arrayElement + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void printArray(String[] array) {
        for (String arrayElement : array) {
            System.out.print(arrayElement + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void printArray(String[][] array) {
        for (String[] row : array) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }


}
