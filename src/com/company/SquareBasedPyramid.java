package com.company;

import java.lang.Math;

public class SquareBasedPyramid {


    // FIELDS ------------------------------------

    private double base;
    private double height;
    private double slantLength;
    private Triangle triangle;

    // METHODS -------------------------------------


    public void setBase(double base) {
        if (triangle == null) {
            triangle = new Triangle();
        }

        this.base = base;
        triangle.setBase(base);

    }

    public double getBase() {
        return base;
    }

    public void setSlantLength(double slantLength) {
        if (triangle == null) {
            triangle = new Triangle();
        }

        this.slantLength = slantLength;
        triangle.setHeight(slantLength);
    }

    public double getSlantLength() {
        return slantLength;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double calcSurfaceArea() {
        // Calculate the surface area of the square-based pyramid
        double fResult = ((Math.pow(base, 2)) + (4 * (triangle.calcArea())));
        return fResult;
    }

    public double calcVolume() {
        // Calculate the volume of the triangular based prism
        double fResult = (((Math.pow(base, 2)) * height) / 3);
        return fResult;
    }

    public void display() {
        // Display all user-inputted values to the screen
        System.out.println("Square-Based Pyramid: \nBase: " + base + "cm \nHeight: " + height + "cm \nSlant Length: " + slantLength + "cm");
    }

} // END SquareBasedPyramid CLASS
