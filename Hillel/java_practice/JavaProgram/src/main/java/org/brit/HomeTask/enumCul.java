package org.brit.HomeTask;


public class enumCul {
        private enum Operation {
            PLUS,
            MINUS,
            MULTILPLE,
            DIVIDED_BY;
           int rez = 0;


            public int calc(int x, int y) {
                switch (this) {
                    case PLUS:
                        rez = x + y;
                        break;
                    case MINUS:
                        rez = x - y;
                        break;
                    case MULTILPLE:
                        rez = x * y;
                        break;
                    case DIVIDED_BY:
                        if (y == 0) {
                            System.out.println("You cannot divide by 0");
                            return 0;
                        } else {
                          rez = x / y;
                          break;

                      }
                }
                        return (int) rez;
            }

            public static void main(String args[]) {

                int x = 15;
                int y = 5;

                for (Operation oprt : Operation.values()) {
                    System.out.println("%s %s %s = %s".formatted(x,oprt,y,oprt.calc(x, y)));

                }
            }
        }
    }



