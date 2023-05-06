package org.brit.HomeTask;

import java.util.Arrays;
import java.util.Random;

public class arraySum {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                result[i] += array[i][j];

            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

//    private static int[][] generateMatrix(int rows, int columns) {
//        int[][] result = new int[rows][columns];
//        Random random = new Random();
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result.length; j++) {
//                result[i][j] = random.nextInt(0, 101);
//            }
//        }
//        return result;
//    }

}
