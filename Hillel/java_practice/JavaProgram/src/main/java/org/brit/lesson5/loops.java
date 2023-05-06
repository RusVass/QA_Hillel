package org.brit.lesson5;

public class loops {
    public static void main(String[] args) {

    //int i = 0; можна обявити тут 'і'

      for (int i = 1; i <= 100; i++){
        System.out.print(i + " ");
       }

      System.out.println();

       // System.out.println(i);

// виводимо число кратне 4

        for (int i = 0; i <= 100; i++) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
            System.out.println();
        System.out.println();
// виводить  число через  4
          for (int i = 0; i <= 100; i+=4) {
              System.out.print(i + " ");
                  }
        System.out.println();
          // виводить також число через 4
        for (int i = 1; i <= 100; i+=4) {
            if (i % 4 == 0)
                System.out.print(i + " ");
        }
        System.out.println();

// виводить число від 100 до 1
          for (int i = 100; i >= 1; i--) {
              System.out.print(i + " ");
          }
        System.out.println();
          // виводить число через 4 від 100 і вниз
        for (int i = 100; i>=1; i-=4) {
            System.out.print(i+" ");
        }
        System.out.println();

        // викидує на break і iгнорує на continue

        for (int i = 100; i>=1; i-=4) {
            if (i == 52){
                break;
            }
            else if (i == 64){
                continue;
            }
            System.out.print(i + " ");
        }

    }

}
