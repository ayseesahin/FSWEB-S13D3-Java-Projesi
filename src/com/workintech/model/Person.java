package com.workintech.model;

public class Person {
    String firstname;
    String lastname;
    int age;
    String hometown;
    double salary;
    boolean isMarried;

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Person(String firstname, String lastname, int age, String hometown, double salary, boolean isMarried) {
        this(firstname, lastname, age);
        this.hometown = hometown;
        this.salary = salary;
        this.isMarried = isMarried;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen(int age) {
        return age > 13 && age < 19;
    }

    @Override
    public String toString() {
        return String.format("Firstname: %s, Lastname: %s, Age: %d, Salary: %.2f", firstname, lastname, age, salary);
    }
}
