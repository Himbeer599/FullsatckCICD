package com.inheritance;

public class Motorcycle extends Vehicle {
    int engineCapacity;
    String type;

    public Motorcycle() {

    }

    public Motorcycle(String manufacturer, String model, int yearOfManufacture, int engineCapacity, String type) {
        super(manufacturer, model, yearOfManufacture);
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                "engineCapacity=" + engineCapacity +
                "type=" + type +
                '}';
    }


}
