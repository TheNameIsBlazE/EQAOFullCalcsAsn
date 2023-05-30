package com.company;

public class TriangleBasedPrism {

    // FIELDS ------------------------------------------------------------------------

    private double base;
    private double triangleFaceHeight; // SIDE L  --> "Please enter the height of the triangular face in centimetres"
    private double triangleArmOne; // SIDE A
    private double triangleArmTwo; // SIDE C
    private double prismHeight;
    private Triangle triangle;

    // METHODS ----------------------------------------------------------------------


    public void setBase(double base) {
        // Ensure triangle object has been created appropriately
        if (triangle == null) {
            triangle = new Triangle();
        }

        this.base = base;
        triangle.setBase(base);
    }

    public double getBase() {
        return base;
    }

    public void setTriangleFaceHeight(double triangleFaceHeight) {
        // Ensure triangle object has been created appropriately
        if (triangle == null) {
            triangle = new Triangle();
        }

        this.triangleFaceHeight = triangleFaceHeight;
        triangle.setHeight(triangleFaceHeight);
    }

    public double getTriangleFaceHeight() {
        return triangleFaceHeight;
    }

    public void setTriangleArmOne(double triangleArmOne) {
        this.triangleArmOne = triangleArmOne;
    }

    public double getTriangleArmOne() {
        return triangleArmOne;
    }

    public void setTriangleArmTwo(double triangleArmTwo) {
        this.triangleArmTwo = triangleArmTwo;
    }

    public double getTriangleArmTwo() {
        return triangleArmTwo;
    }

    public void setPrismHeight(double prismHeight) {
        this.prismHeight = prismHeight;
    }

    public double getPrismHeight() {
        return prismHeight;
    }

    public double calcSurfaceArea() {
        // Calculate the surface area of the triangular based prism
        double fResult = ((2 * triangle.calcArea()) + (triangleArmTwo * prismHeight) + (triangleArmOne * prismHeight) + (base * prismHeight));
        return fResult;
    }

    public double calcVolume() {
        // Calculate the volume of the triangular based prism
        double fResult = ((triangle.calcArea() * prismHeight));
        return fResult;
    }


    public void display() {
        // Display all user-inputted values to the screen
        System.out.println("Triangle-Based Prism: \nBase of Triangular Face: " + base + "cm \nHeight of Triangular Face: " + triangleFaceHeight + "cm \nArm One (Side A): " + triangleArmOne + "cm \nArm Two (Side C): " + triangleArmTwo + "cm \nPrism Height: " + prismHeight + "cm");
    }
} // END TriangleBasedPrism CLASS
