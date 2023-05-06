package org.brit.lesson9;

import com.sun.jdi.IntegerValue;

import java.util.*;

public class MyMap {
    public static void main(String[] args) {
        Map< String, Integer> map = new HashMap<>();

//  створюємо словник
        map.put("Bryt ", 30);
        map.put ("Melnikova ", 40);
        map.put("Vasiliev", 50);
        map.put("Korzh", 50);

        System.out.println(map);

        System.out.println();
//  перезапис  значення 30 на 40 ("Bryt ", 30);
        map.put("Bryt ", 40);
        System.out.println(map);

        System.out.println();
  // пошук за ключем - буду пусте значення тому що відсутнє в словнику
  //
        map.get("ket");
        System.out.println(map);

        System.out.println();

// пусте значення виводить  NULL
        Integer i = map.get("Shyshko");
        System.out.println(i);

        System.out.println();
 // записати у map значення "Shyshko", 30)
        map.put("Shyshko", 30);
        System.out.println(map);

        System.out.println();
// видалити
//        map.remove("Shyshko",30 );
//        System.out.println(map);

 //    виводить слова окремо від цифр

        Set<String> strings = map.keySet();
        System.out.println(strings);

        System.out.println();
  //  виводить цифри окремо від слів
        Collection<Integer> values = map.values();
        System.out.println(values);

        System.out.println();
// виводиь цифри і словва  тобто ітерувати
    for (Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
      // те саме  System.out.println(entry);
    }

        System.out.println();
// виводить цифри
    for (Integer val : map.values()){
    System.out.println(val);
    }
        System.out.println();





//  зберігаемо юзерів
// створюємо Map
    Map<Integer, List<String>> map1 = new HashMap<>();
// створити дані користувачів
    List<Map<String, Object>> users = new ArrayList<>();

    Map<String,Object> user = new HashMap<>();
    user.put("Name" , "Serg" );
    user.put("LastName" , "Bryt" );
    user.put("Age", 40);

    users.add(user);

    user = new HashMap<>();
    user.put("Name" , "Roman" );
    user.put("LastName" , "Myha" );
    user.put("Age", 18);

    users.add(user);

    user = new HashMap<>();
    user.put("Name" , "Pet" );
    user.put("LastName" , "Mymy" );
    user.put("Age", 20);

    users.add(user);

    user = new HashMap<>();
    user.put("Name" , "Roman" );
    user.put("LastName" , "Myham" );
    user.put("Age", 11);

    users.add(user);

    System.out.print(users);

        System.out.println();

    for (Map<String,Object> user1 : users){
        System.out.println("User:");
        System.out.println("Name:"+user1.get("Name"));
        System.out.println("LastName:"+user1.get("LastName"));
        System.out.println("Age"+ user1.get("Age"));
        System.out.println();
        }

        String name = "Roman";

    for (Map<String, Object> user1: users) {
        if (user1.get("Name").equals("Roman")){
            System.out.println("User:");
            System.out.println("Name:"+user1.get("Name"));
            System.out.println("Last name:"+user1.get("LastName"));
            System.out.println("Age"+ user1.get("Age"));
            System.out.println();
        }
    }

    }

}
