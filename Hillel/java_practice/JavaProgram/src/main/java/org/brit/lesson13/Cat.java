package org.brit.lesson13;

import java.util.Objects;

public class Cat extends Animal{

    private long sleepTime;


    public Cat(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Myr";
    }

    @Override
    public void walk() {
        System.out.println("Cat always walk along");
    }


    public long getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(long sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "sleepTime=" + sleepTime +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return sleepTime == cat.sleepTime;
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sleepTime);
    }
}
