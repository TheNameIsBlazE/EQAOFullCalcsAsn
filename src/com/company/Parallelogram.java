package com.company;

public class Parallelogram {
    //FIELDS ------------------------------------------

    private double base;
    private double height;
    private double leg;

    // METHODS ---------------------------------------

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setLeg(double leg) {
        this.leg = leg;
    }

    public double getLeg() {
        return leg;
    }

    public double calcPerimeter() {
        // Calculate the perimeter of the parallelogram
        double fResult = ((2 * base) + (2 * leg));
        return fResult;
    }

    public double calcArea() {
        // Calculate the area of the parallelogram
        double fResult = (base * height);
        return fResult;
    }

    public void display() {
        // Display all user-inputted values to the screen
        System.out.println("Parallelogram: \nBase " + base + "cm \nLeg: " + leg + "cm \nHeight: " + height + "cm");
    }

} // END Parallelogram CLASS
