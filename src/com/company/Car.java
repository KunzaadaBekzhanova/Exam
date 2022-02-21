package com.company;

public class Car extends Vehicle{
    private int speed;

    public Car(String name, int counter, int speed) {
        super(name, counter);
        this.speed = speed;
    }

    public Car(int speed) {
        this.speed = speed;
    }

    public Car(int counter, int speed) {
        super(counter);
        this.speed = speed;
    }

    public Car() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    void run() {
        System.out.println("Running");

    }

    @Override
    void drive() {
        System.out.println("Driving");
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                "} " + super.toString();
    }

    @Override
    public void turnRight() {
        System.out.println("Car is turning Right");
    }

    @Override
    public void turnLeft() {
        System.out.println("Car is turning Left");
    }

    @Override
    public void goForward() {
        System.out.println("Car is going Forward");

    }

    @Override
    public void stop() {
        System.out.println("Car is Stop");
    }
}
