package com.company;

public class Cylinder {

    // FIELDS ---------------------------------------------------------------------

    private double radius;
    private double height;
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

    public double calcSurfaceArea() {
        // Calculate the surface area of the cylinder
        double fResult = ((2 * circle.calcArea()) + (2 * Math.PI * radius * height));
        return fResult;
    }

    public double calcVolume() {
        // Calculate the volume of the triangular based prism
        double fResult = (circle.calcArea() * height);
        return fResult;
    }

    public void display() {
        // Display all user-inputted values to the screen
        System.out.println("Cylinder: \nRadius: " + radius + "cm \nHeight: " + height + "cm");
    }

} // END Cylinder CLASS
