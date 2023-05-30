package com.company;

public class Trapezoid {

//FIELDS ------------------------------------------

    private double base;
    private double height;
    private double sideTwo; //C
    private double sideOne; // A
    private double sideThree; //D

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

    public void setSideThree(double sideThree) {
        this.sideThree = sideThree;
    }

    public double getSideThree() {
        return sideThree;
    }

    public double calcPerimeter() {
        // Calculate the perimeter of the parallelogram
        double fResult = (sideOne + base + sideTwo + sideThree);
        return fResult;
    }

    public double calcArea() {
        // Calculate the area of the trapezoid
        double fResult = (((sideOne + base) * height) / 2);
        return fResult;
    }

    public void display() {
        // Display all user-inputted values to the screen
        System.out.println("Trapezoid: \nBase One: " + base + "cm \nBase Two: " + sideOne + "cm \nHeight: " + height + "cm \nSide C (ARM 1): " + sideTwo + "cm \nSide D (ARM 2): " + sideThree + "cm");
    }

} // END Trapezoid CLASS
