package org.brit.lesson7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 6, 23, -4,20};
        System.out.println(Arrays.toString(array));

//виводить  значення починаючи з нуля
        System.out.println(array[0]+" "+ array[1]+" "+array[6]);
 //  виводить одне значення починаючи з нуля
        System.out.println(array[3]);
        System.out.println();
 //     виводить весь масив
        System.out.println(Arrays.toString(array));
        System.out.println();

        //  виводить по черзі цифри

     for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " +");
        }
            System.out.println();

// виводимо наоборот цифри
     for (int i = array.length -1; i>=0; i--){
           System.out.print(array[i]+ " ");
        }
           System.out.println();
 //виводить з кінців а потім наборот з середини
     for (int i=0,j=array.length-1;i<array.length;i++,j--){
          System.out.println(array[i]+ "__"+array[j]);
       }
          System.out.println();
//виводить з кінців а потім наборот з середини
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+" <=>" + array[array.length-1-i]);
        }
        System.out.println();
//виводить з кінців а потім наборот з середини

     for (int i = 0; i < array.length; i++) {
          int j= array.length-1-i;
          System.out.println(array[i]+" <<==>>" + array[j]+" ");
      }
        System.out.println();

     int arr[] = new int[31];
     arr[0] = 1;
     for (int i = 1; i < 31; i++)
          arr[i] = arr[i-1]*2;

     for (int i =0; i<30; i++)
         System.out.println(i+" "+arr[i]);





        }


    }

