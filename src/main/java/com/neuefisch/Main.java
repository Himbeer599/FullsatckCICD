package com.neuefisch;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("BMW", "X3", "Black", 2022);
        myCar.starts();

        Car mySecondCar = new Car("BMW", "X3", "Black", 2022);
        mySecondCar.accelerates(50);

        Person girl = new Person("Sofie",18, "woman");
        girl.introduction();

        System.out.println(girl.name);

    }
}
