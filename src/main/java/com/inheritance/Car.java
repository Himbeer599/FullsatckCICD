package com.inheritance;

public class Car extends Vehicle {
    protected int numberOfDoors;

    public Car() {

    }

    public Car(String manufacturer, String model, int yearOfManufacture, int numberOfDoors) {
        super(manufacturer, model, yearOfManufacture);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
//        return "Vehicle{" +
//                "manufacturer='" + manufacturer + '\'' +
//                ", model='" + model + '\'' +
//                ", yearOfManufacture=" + yearOfManufacture +
//                "number of doors=" + numberOfDoors +
//                '}';
        return super.toString().replace("}", "")+
                "number of doors=" + numberOfDoors +
                '}';

    }
}
