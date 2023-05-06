package org.brit.lesson7;

public class MyMatrix {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
// виводить матрицю числа основний код дляя використання
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ==>");
            }
            System.out.println();
        }
        System.out.println();
//   }
//  }
        //      вивести матрицю те саме за допомогою функції

        for (int i = 0; i < array.length; i++) {
            printArray(array[i]);
        }
        System.out.println();
//    }

        // або те саме за допомогою функції
        for (int i = 0; i < array.length; i++) {
            int[] row = array[i];
            printArray(row);
            //int[] row = array[i];
        }
    }


// або
//               for (int i = 0; i < array.length; i++) {
//               for (int j = 0; j < array.length; j++) {
//              }
//              System.out.println(i);
//             }
//             }
        //  }
//  функція яка виводить матрицю кусок кода вище працює в парі
        public static void printArray ( int[] arrayToPrint){
            for (int j = 0; j < arrayToPrint.length; j++) {
                System.out.print(arrayToPrint[j] + " <==");
            }
            System.out.println();

        }
    }







