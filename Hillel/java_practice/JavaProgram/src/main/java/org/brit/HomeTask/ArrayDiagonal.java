package org.brit.HomeTask;

import java.util.Scanner;

public class ArrayDiagonal {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
  //Входные данные
//      3
//      1 2 3
//      4 5 6
//      7 8 9


     int n = scanner.nextInt();
      int m = n;
      int k = args.length;
      int[][] array = new int[n][m];
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            array[i][j] = scanner.nextInt();
         }
      }

      int maxIdx = array.length - 1;

      for (int i = maxIdx; i >= 0; i--) {
         System.out.print(array[i][i] + " ");
      }
      System.out.println();

      for (int i = maxIdx; i >= 0; i--) {
         System.out.print(array[i][maxIdx - i] + " ");
      }
      System.out.println();

   }
}