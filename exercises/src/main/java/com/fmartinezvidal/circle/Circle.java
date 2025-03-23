package com.fmartinezvidal.circle;

import com.fmartinezvidal.exception.RadiusException;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double area() throws RuntimeException {
        if (radius <= 0) {
            throw new RadiusException(
                    "The radius must be greater than zero");
        }
        return 3.14 * radius * radius;
    }
}
