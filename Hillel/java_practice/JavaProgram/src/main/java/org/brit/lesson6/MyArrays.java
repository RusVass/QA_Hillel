package org.brit.lesson6;

import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {

        int[] array = {1, 4, 6, 7, 8, 2, 10};
        System.out.println(Arrays.toString(array));
        System.out.println(array[0]+" "+array[2]+' '+array[5]);
        int[] array1 = new int[6];


// дані перезапишуться
//      array1 [0] =1;
//      array1 [3] = 7;
//      array1 = new int[8];

        for (int i =0; i < array.length; i++){
        System.out.print(array[i]+ "_ ");
        }
        System.out.println();

        for (int i = array1.length; i >= 0; i--){
            System.out.print(array[i]+ " _ _");
       }


        System.out.println();

//     те саме виводить назив фор ітч
//     значить іти з першого по останній

        for (int j : array){
        System.out.print(j + " __");

        }
        System.out.println();

       int[] array3 = {1, 4, 6, 7, 8, 2,10,7, 9,};

        int[] rez = addElementsToArray(array,  2 ,66);
        int[] rez1 = addElementsToArray(array3,  -5, 65);

      //  int [] array = addElementsToArray(array,  2, 66);
     //   int [] array3  = addElementsToArray(array3,  5, 65);
    }
//  ця функция додає додає два елемента
        private static int[] addElementsToArray(int[] array, int a, int b){
        int arrayLan = array.length;

        int [] rez = new int[arrayLan + 2];

        for (int i =0; i < arrayLan; i ++){
            rez[i] = array [i];
        }
        int rezLen = rez.length;

        rez[rezLen - 2] = a;
        rez[rezLen - 1] = b;
        return rez;

        }
    }
