package org.brit.lesson13;

public class Main {
    public static void main(String[] args) {
Animal cat = new Cat("Zevs");
      Animal cat1 =  new Cat("Murka");
      cat1.setLegs(2);
      cat.walk();

      System.out.println(cat.equals(cat1));

      System.out.println(cat);

//  приводимо до cat до cat і викликаємо getSleepTime
//  або в п5 прописати cat буде те саме

     ((Cat)cat).getSleepTime();

        System.out.println(cat.getName());

Animal dog = new Dog("Leo");
        dog.walk();
        System.out.println(dog.getName());

      System.out.println(cat.equals(dog));

    Main main = new Main();
    main.method1();


    }
    public void  method1(){
      System.out.println("Methot 1");
    }
    public void  method2(){
        System.out.println("Methot 2");
    }



}
