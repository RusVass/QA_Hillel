package org.brit.lesson13;

public class Dog extends Animal  {


    public Dog(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Dog";
    }
}
