package org.brit.lesson6;

import java.nio.file.OpenOption;

public class task3 {
    public static void main(String[] args) {

        int x1 = 15;
        int y1 = 0;

        int rez;
        rez = 5;





        switch (rez) {
            case 1 :
                rez  = x1+y1;
                break;

            case 2 :
                rez  = x1-y1;
                break;

            case 3 :
                rez = x1%y1;
                break;

            case 4 :
                rez  = x1-y1;
                break;

            case 5 :
                rez  = x1/y1;
                break;


            default:
                rez = x1*y1;
        }

        System.out.println(rez);
    }
}
