package com.company.task4;

public class Square implements Shape{
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double square() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "square=" + square() +
                '}';
    }
}
