package com.neuefisch;

public class Car {
    public String brand;
    public String model;
    public String color;
    public int yearofManufacture;
    public int speed;

    public Car(String brand, String model, String color, int yearofmanufacture) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearofManufacture = yearofmanufacture;
        this.speed = 0;
    }

    public void starts() {
        System.out.println("The " + color + " " + brand + " " + model + " (Year: " + yearofManufacture + ") has started.");
    }
    public void accelerates(int increase) {
       speed+=increase;
        System.out.println("The car is now moving at " + speed + " km/h.");
    }
}
