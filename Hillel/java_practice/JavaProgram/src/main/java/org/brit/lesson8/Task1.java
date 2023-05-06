package org.brit.lesson8;
//  1. Создайте массив из 8 случайных целых чисел из отрезка [1;10]
//  2. Выведите массив на экран в строку
//  3. Замените каждый элемент с нечётным индексом на ноль
// 4. Снова выведете массив на экран на отдельной строке
public class Task1 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.generateArray(10, -10, 40);
        ArrayUtils.printArray(array);
        changeArray(array);
        ArrayUtils.printArray(array);
    }

    public static void changeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
           if (i % 2 != 0) {
                array[i] = 0;
           }
        }
    }


}
