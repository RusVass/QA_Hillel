package org.brit.HomeTask;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    public static void main(String[] args) {
        ArrayList<Integer> guessDigit = new ArrayList<>();
        for (int i = 1; i< 100;i++){
            guessDigit.add(i);
        }

        Random random = new Random();
        List<Integer> resalt = new ArrayList<>();
    for (int i = 0; i< 10; i++){
        int index = random.nextInt(0, guessDigit.size());
        resalt.add(guessDigit.get(index));
        guessDigit.remove(index);
    }

        System.out.println(resalt);
    }
}
