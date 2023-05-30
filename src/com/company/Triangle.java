package com.company;

public class Triangle {

    //FIELDS ------------------------------------------

    private double base;
    private double height;
    private double sideTwo;
    private double sideOne;

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

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideOne() {
        return sideOne;
    }

    public double calcPerimeter() {
        // Calculate the perimeter of the triangle
        double fResult = (sideOne + base + sideTwo);
        return fResult;
    }

    public double calcArea() {
        // Calculate the area of the triangle
        double fResult = ((base * height) / 2);
        return fResult;
    }

    public void display() {
        // Display all user-inputted values to the screen
        System.out.println("Triangle: \nBase: " + base + "cm \nHeight: " + height + "cm \nSide A (ARM 1): " + sideOne + "cm \nSide C (ARM 2): " + sideTwo + "cm");
    }

} // END Triangle CLASS
