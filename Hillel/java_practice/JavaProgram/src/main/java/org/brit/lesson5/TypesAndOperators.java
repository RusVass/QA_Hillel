package org.brit.lesson5;

public class TypesAndOperators {
    public static void main(String[] args) {
        int operand1 = 8;
        int operand2 = 12;

        double result =  operand2 / operand1;

//     другий варіант double
//       double operand2 = 12.6;
//       double result =  operand1 % operand2;

        System.out.println(result);

        System.out.println();
// унарна операція

       operand1--;

      // те саме
       // operand1 = operand1 + 1;

        System.out.println(operand1);
        System.out.println();

// Бінарна оперція
        operand1+=5;
// можна і так записати
     //   operand1 = operand1 + 3;

        System.out.println(operand1);
        System.out.println();

        // логічна операція

        boolean boolVar = true;

        System.out.println(!boolVar);

        boolean  boolVar1 = false;

        System.out.println(!(boolVar && boolVar1 ));
        System.out.println();

        System.out.println((operand1 == operand2) || boolVar1);

        System.out.println();

        // тернарна операція

        int  ternar = operand1 > operand2 ? 1 : 0;
        // приклад char
        //char ternar = operand1 > operand2 ? 1 : 'c';

        System.out.println(ternar);

        long  l = 345_555_555l;

        System.out.println(345_555_555l);
        System.out.println();

        // клас стрінга

        String st = "HellO World" ;
        String st2 = "Hello World" ;
        System.out.println();

        // створюємо так нову стрічку
        st = st + "Same World";
        System.out.println(st);
        System.out.println();

        //так не можно порівнювати стрічки
        //System.out.println ( st == st2);

       System.out.println (st.equals(st));
        System.out.println();

        int i = st2.compareTo(st2);
        System.out.println(i);
        System.out.println();

        System.out.println((int)'O');
        System.out.println((int)'o');
        System.out.println();

        System.out.println(st2.compareToIgnoreCase(st));
        System.out.println();

        System.out.println(st.substring(3));
        System.out.println(st.substring(3,8));





    }
}
