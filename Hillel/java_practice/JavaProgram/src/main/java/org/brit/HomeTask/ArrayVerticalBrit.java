package org.brit.HomeTask;

public class ArrayVerticalBrit {

    public static void main(String[] args) {

        int [][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

// головна
        for (int i = 0; i < array.length;i++){
            System.out.print(array[i][i]+" " );
        }
        System.out.println();
        //побічна
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i][array.length-1-i]+" ");

        }
    }
}
