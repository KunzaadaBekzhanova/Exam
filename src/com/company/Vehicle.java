package com.company;

public abstract class Vehicle extends Teh implements OperateCar {
    private int counter;

    public Vehicle(String name, int counter) {
        super(name);
        this.counter = counter;
    }

    public Vehicle() {
    }

    public Vehicle(int counter) {
        this.counter = counter;
    }


    abstract void drive();



    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }





    @Override
    public String toString() {
        return "Vehicle{" +
                "counter=" + counter +
                "} " + super.toString();
    }
}
