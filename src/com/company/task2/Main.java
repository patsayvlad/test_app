package com.company.task2;

public class Main {
    public static void main(String[] args) {
        int original = (int) (Math.random() * 10000);
        System.out.println("Original:" + original);
        System.out.println("Transformed:" + transform(original));
    }

    public static int transform(int number) {

        int transformed = 0;
        int num;

        for (int i = 0; number > 0; i++) {
            num = number % 10;
            number = number / 10;
            if (num != 9) {
                transformed += (num + 1) * Math.pow(10, i);
            } else {
                transformed += Math.pow(10, ++i);
            }
        }
        return transformed;
    }

}
