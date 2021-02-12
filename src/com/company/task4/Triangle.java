package com.company.task4;

public class Triangle implements Shape{
    private final double width;
    private final double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double square() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "square=" + square() +
                '}';
    }
}
