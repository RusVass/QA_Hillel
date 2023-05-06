package org.brit.lesson15;

public class Student extends Person {
//    private String fistName;
//    private String lastName;
    private  Integer age;

    private String group;


    public Student(String fistName, String lastName, Integer age, String group) {
//        this.fistName = fistName;
//        this.lastName = lastName;
          super(fistName,lastName);
          this.age = age;
    }

    public Student() {
    super();
    }
//    public String getFistName() {
//        return fistName;
//    }
//
//    public void setFistName(String fistName) {
//        this.fistName = fistName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fistName='" + getFistName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + age +
                '}';
    }





}
