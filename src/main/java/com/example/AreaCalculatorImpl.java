package com.example;

public class AreaCalculatorImpl implements AreaCalculator {
    @Override
    public double calculateArea(double length, double width) {
        return length * width;
    }
}
