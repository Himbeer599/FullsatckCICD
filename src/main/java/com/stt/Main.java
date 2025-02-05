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
        System.out.println(Calculator.add(2, 3));
        System.out.println(Calculator.subtraction(2, 3));
        System.out.println(Calculator.multiplication(2, 3));
        System.out.println(Calculator.division(2, 3));
    }
}
