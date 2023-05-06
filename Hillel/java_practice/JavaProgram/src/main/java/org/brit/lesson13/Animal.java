package org.brit.lesson13;

import java.util.Objects;

public abstract class Animal {
    private  int legs;
    private int eyes;
    private boolean hasTail;
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public void walk(){
        System.out.println("Just walking");
    }

    public  abstract String say();

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        if (legs<0 || legs > 40){
            System.out.println("This is fantastic beast!!!");
            return;
        }
        this.legs = legs;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "legs=" + legs +
                ", eyes=" + eyes +
                ", hasTail=" + hasTail +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return legs == animal.legs
                && eyes == animal.eyes
                && hasTail == animal.hasTail
                && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(legs, eyes, hasTail, name);
    }
}
