package org.brit.lesson13;

import java.util.Objects;

public class User implements  Comparable<User>{
    private String fistName;
    private String lastName;

    public User(String fistName, String bryt) {
        this.fistName = fistName;
    }

    public User() {
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    @Override
    public String toString() {
        return "User{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(fistName, user.fistName) && Objects.equals(lastName, user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fistName, lastName);
    }

    @Override
    public int compareTo(User o) {

        return fistName.compareTo(o.getFistName());
    }
}
