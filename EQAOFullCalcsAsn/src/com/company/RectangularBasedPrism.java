package com.company;

public class RectangularBasedPrism {


    // FIELDS ------------------------------------

    private double length;
    private double width;
    private double height;
    private Rectangle rectangle;

    // METHODS -------------------------------------


    public void setLength(double length) {

        if (rectangle == null) {
            rectangle = new Rectangle();
        }
        this.length = length;
        rectangle.setLength(length);
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if (rectangle == null) {
            rectangle = new Rectangle();
        }
        this.width = width;
        rectangle.setwidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double calcSurfaceArea() {
        // Calculate the surface area of the rectangular-based prism
        double fResult = (2 * ((width * height) + (length * width) + (length * height)));
        return fResult;
    }

    public double calcVolume() {
        // Calculate the volume of the triangular based prism
        double fResult = (rectangle.calcArea() * height);
        return fResult;
    }

    public void display() {
        // Display all user-inputted values to the screen
        System.out.println("Rectangular-Based Prism: \nLength: " + length + "cm \nWidth: " + width + "cm \nHeight: " + height + "cm");
    }


} // END RectangularBasedPrism CLASS
