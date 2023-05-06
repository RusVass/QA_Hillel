package org.brit.lesson7;


import java.time.DayOfWeek;
import java.util.Locale;
import java.util.Scanner;

public class MyEnum {
    // вивести фрази по дням неділі
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.SUNDAY;

        switch (dayOfWeek) {
            case SATURDAY:
            case SUNDAY: {
                System.out.println("This is weekend");
                break;
            }
            case TUESDAY: {
                System.out.println("This is fish day");
                break;
            }
            case WEDNESDAY: {
                System.out.println("This the middle of week! ");
            }
            case FRIDAY:
            case MONDAY:
            case THURSDAY: {
                System.out.println("This is week day");
                break;
            }
        }
        System.out.println();
// вивести дні неділі

        DayOfWeek[] values = DayOfWeek.values();

        for (DayOfWeek day : values) {
            System.out.println(day.name()+ "==>" + day.ordinal() + "==>" + day.getValue() + "==>" + day.toString());
        }
        System.out.println();
        //вивести день неділі
        DayOfWeek dayOfWeek1 = DayOfWeek.valueOf("MONDAY");
        System.out.println(dayOfWeek1);

        System.out.println();

// дає можливість записувать  слово в консоль

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        dayOfWeek1 = DayOfWeek.valueOf(s.toUpperCase());

//      виводить деь тижня по числу
//
//           dayOfWeek1 = DayOfWeek.valueOf( 5);
//           System.out.println(dayOfWeek1);

        enum DayOfWeek {
            MONDAY("Понеділок"),
            TUESDAY("Вівторок"),
            WEDNSDAY("Середа"),
            THURSDAY("Чутверг"),
            FRIDAY("Пятниця"),
            SATURDAY("Субота"),
            SUNDAY("Неділя");

            private String value;

            DayOfWeek(String value) {
                this.value = value;
            }

            public String getValue() {
                return value;
            }

            //
           @Override
           public String toString() {
              return  value ;
           }
           
//  вивести день по цифрі  див строка 54,55
            public static DayOfWeek valueOf(int ordinal) {
                if (ordinal < 0 && ordinal > 6) {
                   return MONDAY;
                }
               for (DayOfWeek day : DayOfWeek.values()) {
                    if (day.ordinal() == ordinal) {
                        return day;
                   }
                }
                return MONDAY;
            }
        }
    }
}



