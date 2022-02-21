package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

	    Car car1 = new Car("Toyota",2000,100);


        Car car2 = new Car("Tesla",1000,200);


        Car car3 = new Car("Van",3000,50);


        Car car4 = new Car("Bicycle",10,20);

        Vehicle[] vehicles = {car1,car2,car3,car4};

        Vehicle theCar = findTheCar(vehicles);

        System.out.println(theCar);

    }

    static Vehicle findTheCar(Vehicle[] vehicles) {
        Vehicle theCar = null;
        for (Vehicle vehicle : vehicles) {
            if (theCar == null) {
                theCar = vehicle;
                continue;
            }

            if (theCar.getCounter() < vehicle.getCounter()) {
                theCar = vehicle;
            }
        }
        return theCar;
    }
}
