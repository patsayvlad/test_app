package com.company.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(Math.random() * 10);
        Rectangle rectangle = new Rectangle(Math.random() * 10, Math.random() * 10);
        Triangle triangle = new Triangle(Math.random() * 10, Math.random() * 10);
        Circle circle = new Circle(Math.random() * 10);

        List<Shape> shapeList = new ArrayList<>(Arrays.asList(square, rectangle, triangle, circle));

        System.out.println("Original list:");
        shapeList.forEach(System.out::println);

        shapeList.sort(Comparator.comparingDouble(Shape::square));

        System.out.println("Sorted list:");
        shapeList.forEach(System.out::println);
    }
}
