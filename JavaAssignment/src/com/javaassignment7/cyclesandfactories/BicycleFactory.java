package com.javaassignment7.cyclesandfactories;

public class BicycleFactory implements CyclesFactory{
    @Override
    public Cycle produceCycle() {
        return new Bicycle();
    }
}
