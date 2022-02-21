package com.company;

public abstract class Teh {
    private String name;

    public Teh(String name) {
        this.name = name;
    }

    public Teh() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void run();

    @Override
    public String toString() {
        return "Teh{" +
                "name='" + name + '\'' +
                '}';
    }
}