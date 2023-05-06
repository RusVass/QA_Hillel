package org.brit.lesson8;

//Создать массив типа String размером 3х6.
//        И записать в него значения:
//        a1  a2  a3  a4  a5  a6
//        b1  b2  b3  b4  b5  b6
//        c1  c2   c3  c4  c5  c6
 //       Распечатать массив.


public class Task5 {
    public static void main(String[] args) {
        String[][] array = new String[3][6];
        String[] letters = {"a", "b", "c"};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = letters[i] + (j + 1);
            }
        }

        ArrayUtils.printArray(array);

    }
}
