package org.brit.lesson8;

// Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
// Определите какой элемент является в этом массиве максимальным и
// сообщите индекс его последнего вхождения в массив.

public class Task2 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.generateArray(10, -15, 15);
        ArrayUtils.printArray(array);
        int maxIndex = minElementIndex(array);
        System.out.println(maxIndex);
    }

    public static int minElementIndex(int[] array) {
        int index = 0;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

}
