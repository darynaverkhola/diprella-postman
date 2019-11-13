package com.company;

public class Person {
    String name;
    int age;

    public Person (String Name, int age) {
        this.name = "Myname";
        this.age= 28;
    }

    public void  whoAmI() {
        System.out.println("My name is:" +name);
    }
    public int getAge() {
        return age;
    }
    public Person getPerson () {
        return this;
    }
}
