package org.brit.lesson8;



//1. Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3. Введенное пользователем число сохраняется в переменную n.
//2. Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
//3. Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
//4. Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.

public class Task4 {
    public static void main(String[] args) {
        int n = 100;
        int[] array = ArrayUtils.generateArray(n, 0, n);
        ArrayUtils.printArray(array);
        int[] evenElements = getEvenElements(array);
        ArrayUtils.printArray(evenElements);

    }

    public static int[] getEvenElements(int[] array){
        int countOgEvenDigits = countOfEvenElements(array);
        int[] result = new int[countOgEvenDigits];
        int i = 0;
        for (int element: array){
            if (isEven(element)){
                result[i] = element;
                i++;
            }
        }
        return result;
    }

    public static int countOfEvenElements(int[] array){
        int count = 0;
        for (int element: array){
            if (isEven(element)){
                count++;
            }
        }
        return count;
    }

    public static boolean isEven(int digit){
        return digit % 2 == 0;
    }
}
