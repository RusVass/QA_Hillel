package org.brit.lesson13;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Serg", "Bryt"));
        users.add(new User("Svet","Voronka"));
        users.add(new User("Oleg","Voron"));

        List<Integer> integers = new ArrayList<>(List.of(1,4,6,15,-8));
     //   Collections.sort(users);
        Collections.sort(integers);
        System.out.println(integers);

        Collections.sort(users);
        System.out.println(users);


    }
}
