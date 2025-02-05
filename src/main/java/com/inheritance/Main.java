package com.inheritance;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("VW", "Golf", 2020);
        Car car = new Car("Benz", "330S", 2022, 4);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, 1200, "Cruiser");
        System.out.println("Vehicle" + vehicle.toString());
        System.out.println("Car" + car.toString());
        System.out.println("Motorcycle" + motorcycle.toString());
    }
}
