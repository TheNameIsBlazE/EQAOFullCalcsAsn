package com.company;

public class Rectangle {

    //FIELDS ------------------------------------------

    private double length;
    private double width;

    // METHODS ---------------------------------------

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setwidth(double width) {
        this.width = width;
    }

    public double getwidth() {
        return width;
    }

    public double calcPerimeter() {
        // Calculate the perimeter of the rectangle
        double fResult = ((2 * length) + (2 * width));
        return fResult;
    }

    public double calcArea() {
        // Calculate the area of the rectangle
        double fResult = (length * width);
        return fResult;
    }

    public void display() {
        // Display all user-inputted values to the screen
        System.out.println("Rectangle: \nLength " + length + "cm \nWidth: " + width + "cm");
    }

} // END Rectangle CLASS
