package com.meow.shapes;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Meow: " + super.getColour() + super.getRadius() + height;
    }
}
