package com.zoo;

public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Alice",18,"Washington 101");
        Owner owner2 = new Owner("Mike",30,"Berlin 21");
        Owner owner3 = new Owner("Alex",40,"Dortmond 111");

        Species species1 = new Species("Bear", 2000);
        Species species2 = new Species("Big Cat", 1000);
        Species species3 = new Species("Mammal", 100);
        Animal animal1 = new Animal("1","Panda","Bear",3,owner1,species3);
        Animal animal2 = new Animal("2", "Tiger", "Big Cat", 5,owner2,species3);
        Animal animal3 = new Animal("3", "Elephant", "Mammal", 10,owner3,species3);
        System.out.println(animal1.toString());
        System.out.println(animal2.equals(animal3));

    }
}
