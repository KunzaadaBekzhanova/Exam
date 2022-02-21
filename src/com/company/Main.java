package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Car car1 = new Car("Toyota",2000,100);


        Car car2 = new Car("Tesla",1000,200);


        Car car3 = new Car("Van",3000,50);


        Car car4 = new Car("Bicycle",10,20);

        Vehicle[] vehicles = {car1,car2,car3,car4};

        int[] numbers = {5,9453,10,931};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        


    }
}
