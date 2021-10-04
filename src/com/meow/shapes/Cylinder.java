package com.meow.shapes;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getVolume() {
        return this.getArea() * height;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter() * 2;
    }

    @Override
    public String toString() {
        return "Meow: " + super.getColour() + super.getRadius() + height;
    }
}
