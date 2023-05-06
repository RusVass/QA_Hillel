package org.brit.lesson9;

import java.util.*;

public class MyCollections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
// вивели цифри елемент
        list.add(4);
        list.add(6);
        list.add(-10);

        System.out.println(list);
        System.out.println();
// добавили цифру елемент
        list.add(33);

        System.out.println(list);
        System.out.println();
// вставити на перед першим числом

        list.add(4, -22);
        System.out.println(list);

        System.out.println();
// заміна 6 на 10 (перше число це індекс,
// друге на те число що міняємо )
        list.set(2,10);
        System.out.println(list);

        System.out.println();

// видалити за індексом
        list.remove(3);
        System.out.println(list);
// видалити за значенням
        list.remove(Integer.valueOf(4));
        System.out.println(list);

        System.out.println();
// показує який елемент видалии в данному
// випадку 3 елемент
        System.out.println(list.size());
        System.out.println();


// нова колекція
        List<Integer> list1 = List.of(3,5,-99,10,15,5,-99);

// зєднуємо дві колекціі  лист який вище та лист 1
        list.addAll(list1);
        System.out.println(list);

        System.out.println();

 //  робимо виборку  копію елементів

    List<Integer>  sublist = list.subList(2,6) ;
    System.out.println(sublist);

        System.out.println();
// відсортувати цифри  від меншого до найбільшого
   // list.sort(Comparator.naturalOrder());
   // System.out.println(list);

        System.out.println();

// виводить цифру за індексом починаючи з 0

        System.out.println(list.get(2));

        System.out.println();


 // виводиь цифри в колонку
    for (int i = 0; i < list.size(); i++){
    System.out.println(list.get(i));
    }

     System.out.println();
//  for etch використовуємо

        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println();

// виводить унікальне значення
    Set<Integer> set  = new HashSet<>();
        set.addAll(list);
        System.out.println(list);
        System.out.println(set);
        System.out.println();





    }
}
