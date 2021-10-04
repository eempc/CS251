package com.meow.shapes;

public class Circle extends Shape {
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

    public Circle(double radius, double d) {
        this.radius = radius;
        setColour(d);
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

    public void setColour(double d) {
        colour = (d < 10) ? "Red" : (d < 50) ? "Amber" : "Green";
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Meow, colour and radius: " + colour + " " + radius;
    }
}
