package com.neuefisch;


public class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void introduction(){
        System.out.println("Hello, I am "+ name +" and " +age +" years old");
    }
}
