package org.brit.lesson15;

public class Person {
    private String fistName;
    private String lastName;

    public Person(String fistName, String lastName) {
        this.fistName = fistName;
        this.lastName = lastName;
    }

    public Person() {
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



}
