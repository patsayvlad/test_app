package com.company.task4;

public class Rectangle implements Shape{
    private final double base;
    private final double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double square() {
        return base * height / 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "square=" + square() +
                '}';
    }
}
