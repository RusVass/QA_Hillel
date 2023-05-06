package org.brit.HomeTask;

import java.util.*;

public class Lot {
    public static void main(String[] args) {
        int entry1 = (int)(Math.random()*150)+20;

        if(entry1>= 5 && entry1<=50){
            System.out.println("You won the lottery!");}
        System.out.println(entry1);
    }
}
