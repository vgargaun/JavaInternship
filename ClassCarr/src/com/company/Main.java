package com.company;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.logging.*;
public class Main {
    static Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        LOGGER.setLevel(Level.INFO);

        Car car1 = new Car(2000, "Red", "BMW");
        Car car2 = new Car(2010, "Black", "VW");
        Car car3 = new Car(1999, "White", "Volvo");

//        ArrayList<Car> car = new ArrayList<>();
//
//        car.add(car1);
//        car.add(new Car(2010, "Black", "VW"));
//        car.add(new Car(1999, "White", "Volvo"));
//
//        for(Car i : car)
//        {
//            System.out.println(i);
//        }
//        System.out.println(car.size());


        LinkedList<Car> car = new LinkedList<>();

        car.add(new Car(2000, "Red", "BMW"));
        car.add(new Car(2020, "Yellow", "Mazda"));
        car.add(car3);

        for(Car i : car)
        {
            System.out.println(i);
        }

        LOGGER.info("Car Number = " + car.size());

        LOGGER.config("================================================\n");

        car.remove(2);

        for(Car i : car)
        {
            System.out.println(i);
        }

        System.out.println(car.size());

        System.out.println(car1.GetNumberCar());





    }
}
