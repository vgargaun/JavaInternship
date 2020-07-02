package com.company;

public class Car {
    private int yearManufacturing;
    private String color;
    private String brand;
    private static int numberCar = 0;
    public Car(int yearManufacturing, String color, String brand)
    {
        this.yearManufacturing = yearManufacturing;
        this.color = color;
        this.brand = brand;
        numberCar++;
    }

    @Override
    public String toString() {
        return "Car: " +
                "Year Manufacturing = " + yearManufacturing +
                ", Color = " + color +
                ", Brand = " + brand ;
    }
    public int GetNumberCar()
    {
        return numberCar;
    }

}
