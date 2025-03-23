package com.fmartinezvidal;

import com.fmartinezvidal.circle.Circle;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws RuntimeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("The area of the circle is: " + circle.area());
        scanner.close();
    }
}