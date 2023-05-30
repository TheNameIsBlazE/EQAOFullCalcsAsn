package com.company;

import java.lang.Math;

public class Circle {

    //FIELDS ------------------------------------------

    private double radius;
    private double diameter;

    // METHODS ---------------------------------------

    public void setRadius(double radius) {
        this.radius = radius;
        this.diameter = radius * 2;
    }

    public double getRadius() {
        return radius;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
        this.radius = diameter / 2;
    }

    public double getDiameter() {
        return diameter;
    }

    public double calcPerimeter() {
        // Calculate the perimeter of the circle
        double fResult = (2 * Math.PI * radius);
        return fResult;
    }

    public double calcArea() {
        // Calculate the area of the circle
        double fResult = (Math.PI * (Math.pow(radius, 2)));
        return fResult;
    }

    public void display() {
        // Display all user-inputted values to the screen
        System.out.println("Circle: \nRadius: " + radius + "cm \nDiameter: " + diameter + "cm");
    }
} // END Circle CLASS
