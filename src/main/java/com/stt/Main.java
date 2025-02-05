package com.stt;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person.incrementTotalCount();
        Person.incrementTotalCount();
//        Person.incrementTotalCount();
        person1.incrementInstanceCount();
        person2.incrementInstanceCount();
        person2.incrementInstanceCount();
        person3.incrementInstanceCount();
        person3.incrementInstanceCount();
        person3.incrementInstanceCount();

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());

    }
}
