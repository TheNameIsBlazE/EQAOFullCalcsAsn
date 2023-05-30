package com.company;

public class Cone {
    // FIELDS ---------------------------------------------------------------------

    private double radius;
    private double height;
    private double slantHeight;
    private Circle circle;

    // METHODS ----------------------------------------------------------------------

    public void setRadius(double radius) {
        if (circle == null) {
            circle = new Circle();
        }

        this.radius = radius;
        circle.setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setSlantHeight(double slantHeight) {
        this.slantHeight = slantHeight;
    }

    public double getSlantHeight() {
        return slantHeight;
    }

    public double calcSurfaceArea() {
        // Calculate the surface area of the cone
        double fResult = ((circle.calcArea()) + (Math.PI * radius * slantHeight));
        return fResult;
    }

    public double calcVolume() {
        // Calculate the volume of the triangular based prism
        double fResult = ((circle.calcArea() * height) / 3);
        return fResult;
    }

    public void display() {
        // Display all user-inputted values to the screen
        System.out.println("Cone: \nRadius: " + radius + "cm \nHeight: " + height + "cm \nSlant Height: " + slantHeight + "cm");
    }
} // END Cone CLASS
