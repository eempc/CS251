package com.company;

public class Circle {
    private double radius;
    private String colour;

    public Circle(double radius) {
        this.radius = radius;
        this.colour = "Red";
    }

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }
}
