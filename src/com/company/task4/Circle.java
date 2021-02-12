package com.company.task4;

public class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "square=" + square() +
                '}';
    }
}
