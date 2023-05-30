package com.company;

import java.lang.Math;

public class Cube {

    // FIELDS -----------------------------------------------

    private double sideLength;

    // METHODS ------------------------------------------------


    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double calcSurfaceArea() {
        // Calculate the surface area of the cube
        double fResult = (6 * Math.pow(sideLength, 2));
        return fResult;
    }

    public double calcVolume() {
        // Calculate the volume of the triangular based prism
        double fResult = (Math.pow(sideLength, 3));
        return fResult;
    }

    public void display() {
        // Display all user-inputted values to the screen
        System.out.println("Cube: \nSide Length: " + sideLength + "cm");
    }

} // END Cube CLASS
