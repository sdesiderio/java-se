package com.sistemi.informativi.bean;

public class Device {

    protected String brand;
    protected String model;

    public Device(String brand, String model) {

        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
