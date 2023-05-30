package com.company;

import java.util.Scanner;

public class Main {

    // FIELDS ---------------------------------------------------------------------------------------------------------

    final private static String SEPARATOR = "=====================================================================================================================";
    final private static String HalfSEPARATOR = "============================================";

    // programInfo METHOD --------------------------------------------------------------------------------------------

    public static void programInfo() {
        System.out.println(SEPARATOR);
        System.out.println("Hello!  This program will calculate properties of shapes and prisms!");
        System.out.println("By entering the given characteristics, this program will calculate area and perimeter of 2D shapes, and surface area and volume of 3D shapes!");
        System.out.println("This is done according to the Grade 9 EQAO Formula Sheet!");
        System.out.println("PLEASE NOTE: Do not include any spaces when entering integer or decimal numbers.  In this case, the program will only accept the first value entered.");
        System.out.println(SEPARATOR);
    } // END programInfo METHOD

    // inputErrorNoDouble METHOD -----------------------------------------------------------------------------------

    public static void inputErrorNoDouble() {
        System.out.println(SEPARATOR);
        System.out.println("\t\tINPUT ERROR: Entered value MUST be an INTEGER or a DECIMAL!!!");
        System.out.println(SEPARATOR);
    } // END inputErrorNoDouble METHOD

    // inputErrorWrongDouble METHOD ---------------------------------------------------------------------------------

    public static void inputErrorWrongDouble() {
        System.out.println(SEPARATOR);
        System.out.println("\t\tINPUT ERROR: Entered value MUST be GREATER than 0!!!");
        System.out.println(SEPARATOR);
    } // END inputErrorWrongDouble METHOD

    public static void invalidIntegerMainMenu() {
        System.out.println(SEPARATOR);
        System.out.println("\t\tINPUT ERROR: Entered value MUST be a VALID INTEGER!!");
        System.out.println(SEPARATOR);
    } // END invalidIntegerMainMenu METHOD

    // exitProgram METHOD ------------------------------------------------------------------------------------------

    public static void exitProgram() {
        System.out.println(SEPARATOR);
        System.out.println("Thank you for using this program!");
        System.out.println("Have a good day! 😄");
        System.out.println(SEPARATOR);
    } // END exitProgram METHOD

    // MAIN METHOD --------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        // CONSTANTS/VARIABLES ------------------------------------------------------------------------------------

        // BOOLEANS -------------------------------------------------

        boolean secondDone; // Used for user input DO/WHILE loops
        boolean circleDone; // Used for an additional DO/WHILE loop for Circle
        boolean optionDone; // Used for primary interface DO/WHILE loop

        // STRINGS --------------------------------------------------

        String garbage;
        String response;

        // INTEGERS -------------------------------------------------

        int option = 0;
        // int circleOption is defined later in the program as a local variable

        // DOUBLE PRECISION VALUES ----------------------------------

        double perimeter;
        double area;
        double surfaceArea;
        double volume;

        // OBJECTS --------------------------------------------------

        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Parallelogram parallelogram = new Parallelogram();
        Triangle triangle = new Triangle();
        Trapezoid trapezoid = new Trapezoid();
        Cube cube = new Cube();
        RectangularBasedPrism rectangularBasedPrism = new RectangularBasedPrism();
        SquareBasedPyramid squareBasedPyramid = new SquareBasedPyramid();
        Cylinder cylinder = new Cylinder();
        Cone cone = new Cone();
        TriangleBasedPrism triangleBasedPrism = new TriangleBasedPrism();


        // SCANNERS -------------------------------------------------

        Scanner s = new Scanner(System.in);
        // ERROR CAUGHT WITH SCANNER: When entering information for a shape, s.nextLine prints two error messages
        // the first time (Java issue)
        // This sometimes occurs at other points as well

        // PROGRAM CODE ---------------------------------------------------------------------------------------------


        // PROGRAM DESCRIPTION -----------------------------------------------------------------

        System.out.println();
        programInfo();

        // ASKING THE USER IF THEY WOULD LIKE TO CONTINUE ---------------------------------------------------------

        do {

            optionDone = false;
            System.out.println("Would you like to select a new shape? (yes/no)");
            response = s.nextLine().toUpperCase();

            // OPTION: IF THE USER SAYS YES --------------------------------------------------------------------------

            if (response.equals("YES")) {
                System.out.println(SEPARATOR);

                // MAIN MENU ------------------------------------------------------------------------------

                System.out.println("Please enter the corresponding integer for a shape:");
                System.out.println("1. Rectangle \n2. Circle \n3. Parallelogram \n4. Triangle \n5. Trapezoid \n6. Cube \n7. Rectangular-Based Prism \n8. Square-Based Pyramid \n9. Cylinder \n10. Cone \n11. Triangular-Based Prism \n0. Exit");

                // CASE STATEMENT ---------------------------------------------------

                if (s.hasNextInt()) {
                    option = s.nextInt();

                    switch (option) {

                        // RECTANGLE --------------------------------------------------------------------------------

                        case 1: {
                            System.out.println(SEPARATOR);
                            System.out.println("You have selected rectangle!");
                            System.out.println(SEPARATOR);

                            // LENGTH ----------------------------

                            garbage = s.nextLine();

                            do {
                                secondDone = false;
                                System.out.println("Please enter the length of the rectangle in centimetres:");
                                if (s.hasNextDouble()) {
                                    rectangle.setLength(s.nextDouble());
                                    if (rectangle.getLength() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // WIDTH -----------------------

                            garbage = s.nextLine();

                            do {
                                secondDone = false;
                                System.out.println("Please enter the width of the rectangle in centimetres:");
                                if (s.hasNextDouble()) {
                                    rectangle.setwidth(s.nextDouble());
                                    if (rectangle.getwidth() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // DISPLAY -------------------------

                            System.out.println(HalfSEPARATOR);
                            rectangle.display();
                            perimeter = rectangle.calcPerimeter();
                            area = rectangle.calcArea();
                            System.out.println("Area: " + area + "cm^2");
                            System.out.println("Perimeter: " + perimeter + "cm");
                            System.out.println(HalfSEPARATOR);
                            System.out.println(SEPARATOR);
                            garbage = s.nextLine();

                            break;

                        } // END CASE 1

                        // CIRCLE --------------------------------------------------------------------------------

                        case 2: {
                            System.out.println(SEPARATOR);
                            System.out.println("You have selected circle!");
                            System.out.println(SEPARATOR);
                            do {
                                garbage = s.nextLine();
                                circleDone = false;
                                int circleOption = 0;
                                System.out.println("Please specify if you would like to enter the diameter or the radius of the circle");
                                System.out.println("1. Radius \n2. Diameter");

                                if (s.hasNextInt()) {
                                    circleOption = s.nextInt();

                                    switch (circleOption) {

                                        // CIRCLE --> RADIUS

                                        case 1: {

                                            garbage = s.nextLine();
                                            do {
                                                secondDone = false;
                                                System.out.println("Please enter the radius of the circle in centimetres:");
                                                if (s.hasNextDouble()) {
                                                    circle.setRadius(s.nextDouble());
                                                    if (circle.getRadius() <= 0) {
                                                        inputErrorWrongDouble();
                                                        garbage = s.nextLine();
                                                    } else {
                                                        secondDone = true;
                                                    }
                                                } else {
                                                    inputErrorNoDouble();
                                                    garbage = s.nextLine();
                                                }
                                            } while (!secondDone);

                                            // DISPLAY -------------------------

                                            circleDone = true;
                                            System.out.println(HalfSEPARATOR);
                                            circle.display();
                                            perimeter = circle.calcPerimeter(); // CIRCUMFERENCE VARIABLE IS USING PERIMETER HERE
                                            area = circle.calcArea();
                                            System.out.println("Area: " + area + "cm^2");
                                            System.out.println("Circumference " + perimeter + "cm");
                                            System.out.println(HalfSEPARATOR);
                                            System.out.println(SEPARATOR);
                                            garbage = s.nextLine();

                                            break;
                                        } // END CASE 1 --> CIRCLE SWITCH STATEMENT

                                        // CIRCLE --> DIAMETER ----------------------

                                        case 2: {
                                            garbage = s.nextLine();
                                            do {
                                                secondDone = false;
                                                System.out.println("Please enter the diameter of the circle in centimetres:");
                                                if (s.hasNextDouble()) {
                                                    circle.setDiameter(s.nextDouble());
                                                    if (circle.getDiameter() <= 0) {
                                                        inputErrorWrongDouble();
                                                        garbage = s.nextLine();
                                                    } else {
                                                        secondDone = true;
                                                    }
                                                } else {
                                                    inputErrorNoDouble();
                                                    garbage = s.nextLine();
                                                }
                                            } while (!secondDone);

                                            // DISPLAY -------------------------

                                            circleDone = true;
                                            System.out.println(HalfSEPARATOR);
                                            circle.display();
                                            perimeter = circle.calcPerimeter(); // CIRCUMFERENCE VARIABLE IS USING PERIMETER HERE
                                            area = circle.calcArea();
                                            System.out.println("Area: " + area + "cm^2");
                                            System.out.println("Circumference " + perimeter + "cm");
                                            System.out.println(HalfSEPARATOR);
                                            System.out.println(SEPARATOR);
                                            garbage = s.nextLine();

                                            break;
                                        } // END CASE 2 --> CIRCLE SWITCH STATEMENT

                                        // DEFAULT ---------------------------------------

                                        default: {
                                            System.out.println(SEPARATOR);
                                            System.out.println("\tINPUT ERROR: Entered value MUST be 1 OR 2!!!");
                                            System.out.println(SEPARATOR);
                                            break;
                                        }

                                    } // END SWITCH STATEMENT --> CIRCLE

                                } else {
                                    inputErrorNoDouble();
                                }

                            } while (!circleDone);

                            break;
                        } // END CASE 2

                        // PARALLELOGRAM ------------------------------------------------------------------------------------

                        case 3: {
                            System.out.println(SEPARATOR);
                            System.out.println("You have selected parallelogram!");
                            System.out.println(SEPARATOR);
                            garbage = s.nextLine();

                            do {
                                secondDone = false;

                                // BASE --------------

                                System.out.println("Please enter the length of the base in centimetres:");
                                if (s.hasNextDouble()) {
                                    parallelogram.setBase(s.nextDouble());
                                    if (parallelogram.getBase() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // SIDE C / LEG ---------------------

                            garbage = s.nextLine();

                            do {
                                secondDone = false;
                                System.out.println("Please enter the length of the leg in centimetres:");
                                if (s.hasNextDouble()) {
                                    parallelogram.setLeg(s.nextDouble());
                                    if (parallelogram.getLeg() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // HEIGHT ---------------------------

                            garbage = s.nextLine();

                            do {
                                secondDone = false;
                                System.out.println("Please enter the height of the parallelogram in centimetres:");
                                if (s.hasNextDouble()) {
                                    parallelogram.setHeight(s.nextDouble());
                                    if (parallelogram.getHeight() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // DISPLAY -------------------------

                            System.out.println(HalfSEPARATOR);
                            parallelogram.display();
                            perimeter = parallelogram.calcPerimeter();
                            area = parallelogram.calcArea();
                            System.out.println("Area: " + area + "cm^2");
                            System.out.println("Perimeter: " + perimeter + "cm");
                            System.out.println(HalfSEPARATOR);
                            System.out.println(SEPARATOR);
                            garbage = s.nextLine();

                            break;
                        } // END CASE 3

                        // TRIANGLE -----------------------------------------------------------------------------------------

                        case 4: {
                            System.out.println(SEPARATOR);
                            System.out.println("You have selected triangle!");
                            System.out.println(SEPARATOR);
                            garbage = s.nextLine();

                            do {
                                secondDone = false;

                                // BASE -------------------------

                                System.out.println("Please enter the base of the triangle in centimetres:");
                                if (s.hasNextDouble()) {
                                    triangle.setBase(s.nextDouble());
                                    if (triangle.getBase() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // HEIGHT -----------------------------------

                            garbage = s.nextLine();

                            do {
                                secondDone = false;
                                System.out.println("Please enter the height of the triangle in centimetres:");
                                if (s.hasNextDouble()) {
                                    triangle.setHeight(s.nextDouble());
                                    if (triangle.getHeight() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // SIDE A (ARM 1) ----------------------------------

                            garbage = s.nextLine();

                            do {
                                secondDone = false;
                                System.out.println("Please enter the length of side A (arm one) in centimetres:");
                                if (s.hasNextDouble()) {
                                    triangle.setSideOne(s.nextDouble());
                                    if (triangle.getSideOne() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // SIDE C (ARM TWO) ---------------------------------------

                            garbage = s.nextLine();

                            do {
                                secondDone = false;
                                System.out.println("Please enter the length of side C (arm two) in centimetres:");
                                if (s.hasNextDouble()) {
                                    triangle.setSideTwo(s.nextDouble());
                                    if (triangle.getSideTwo() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // DISPLAY ------------------------------

                            System.out.println(HalfSEPARATOR);
                            triangle.display();
                            perimeter = triangle.calcPerimeter();
                            area = triangle.calcArea();
                            System.out.println("Area: " + area + "cm^2");
                            System.out.println("Perimeter: " + perimeter + "cm");
                            System.out.println(HalfSEPARATOR);
                            System.out.println(SEPARATOR);
                            garbage = s.nextLine();

                            break;

                        } // END CASE 4

                        // TRAPEZOID -----------------------------------------------------------------------------------

                        case 5: {
                            System.out.println(SEPARATOR);
                            System.out.println("You have selected trapezoid!");
                            System.out.println(SEPARATOR);
                            garbage = s.nextLine();

                            do {
                                secondDone = false;

                                // BASE ONE (A) ------------------------------------

                                System.out.println("Please enter the length of base one in centimetres:");
                                if (s.hasNextDouble()) {
                                    trapezoid.setBase(s.nextDouble());
                                    if (trapezoid.getBase() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // BASE TWO (B) -------------------------------------

                            garbage = s.nextLine();

                            do {
                                secondDone = false;
                                System.out.println("Please enter the length of base two in centimetres:");
                                if (s.hasNextDouble()) {
                                    trapezoid.setSideOne(s.nextDouble());
                                    if (trapezoid.getSideOne() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // HEIGHT (H) ----------------------------------

                            garbage = s.nextLine();

                            do {
                                secondDone = false;
                                System.out.println("Please enter the height of the trapezoid in centimetres:");
                                if (s.hasNextDouble()) {
                                    trapezoid.setHeight(s.nextDouble());
                                    if (trapezoid.getHeight() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // SIDE C (ARM 1) ----------------------------------

                            garbage = s.nextLine();

                            do {
                                secondDone = false;
                                System.out.println("Please enter the length of side C (arm one) in centimetres:");
                                if (s.hasNextDouble()) {
                                    trapezoid.setSideTwo(s.nextDouble());
                                    if (trapezoid.getSideTwo() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // SIDE D (ARM TWO) ------------------------------------

                            garbage = s.nextLine();

                            do {
                                secondDone = false;
                                System.out.println("Please enter the length of side D (arm two) in centimetres:");
                                if (s.hasNextDouble()) {
                                    trapezoid.setSideThree(s.nextDouble());
                                    if (trapezoid.getSideThree() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // DISPLAY ---------------------------------

                            System.out.println(HalfSEPARATOR);
                            trapezoid.display();
                            perimeter = trapezoid.calcPerimeter();
                            area = trapezoid.calcArea();
                            System.out.println("Area: " + area + "cm^2");
                            System.out.println("Perimeter: " + perimeter + "cm");
                            System.out.println(HalfSEPARATOR);
                            System.out.println(SEPARATOR);
                            garbage = s.nextLine();

                            break;
                        } // END CASE 5

                        // CUBE -------------------------------------------------------------------------------------------

                        case 6: {
                            System.out.println(SEPARATOR);
                            System.out.println("You have selected cube!");
                            System.out.println(SEPARATOR);
                            garbage = s.nextLine();

                            do {
                                secondDone = false;
                                System.out.println("Please enter the side length of the cube in centimetres:");
                                if (s.hasNextDouble()) {
                                    cube.setSideLength(s.nextDouble());
                                    if (cube.getSideLength() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // DISPLAY -------------------------

                            System.out.println(HalfSEPARATOR);
                            cube.display();
                            surfaceArea = cube.calcSurfaceArea();
                            volume = cube.calcVolume();
                            System.out.println("Surface Area: " + surfaceArea + "cm^2");
                            System.out.println("Volume: " + volume + "cm^3");
                            System.out.println(HalfSEPARATOR);
                            System.out.println(SEPARATOR);
                            garbage = s.nextLine();

                            break;

                        } // END CASE 6

                        // RECTANGULAR-BASED PRISM -----------------------------------------------------------

                        case 7: {
                            System.out.println(SEPARATOR);
                            System.out.println("You have selected rectangular-based prism!");
                            System.out.println(SEPARATOR);
                            garbage = s.nextLine();

                            // LENGTH ------------------------

                            do {
                                secondDone = false;
                                System.out.println("Please enter the length of the prism in centimetres:");
                                if (s.hasNextDouble()) {
                                    rectangularBasedPrism.setLength(s.nextDouble());
                                    if (rectangularBasedPrism.getLength() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // WIDTH -------------------------

                            garbage = s.nextLine();

                            do {
                                secondDone = false;
                                System.out.println("Please enter the width of the prism in centimetres:");
                                if (s.hasNextDouble()) {
                                    rectangularBasedPrism.setWidth(s.nextDouble());
                                    if (rectangularBasedPrism.getWidth() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // HEIGHT ---------------------------

                            garbage = s.nextLine();

                            do {
                                secondDone = false;
                                System.out.println("Please enter the height of the prism in centimetres:");
                                if (s.hasNextDouble()) {
                                    rectangularBasedPrism.setHeight(s.nextDouble());
                                    if (rectangularBasedPrism.getHeight() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // DISPLAY -------------------------

                            System.out.println(HalfSEPARATOR);
                            rectangularBasedPrism.display();
                            surfaceArea = rectangularBasedPrism.calcSurfaceArea();
                            volume = rectangularBasedPrism.calcVolume();
                            System.out.println("Surface Area: " + surfaceArea + "cm^2");
                            System.out.println("Volume: " + volume + "cm^3");
                            System.out.println(HalfSEPARATOR);
                            System.out.println(SEPARATOR);
                            garbage = s.nextLine();

                            break;

                        } // END CASE 7

                        // SQUARE-BASED PYRAMID ---------------------------------------------------------------------

                        case 8: {
                            System.out.println(SEPARATOR);
                            System.out.println("You have selected square-based pyramid!");
                            System.out.println(SEPARATOR);
                            garbage = s.nextLine();

                            // BASE ----------------------------------------

                            do {
                                secondDone = false;
                                System.out.println("Please enter the length of the base in centimetres:");
                                if (s.hasNextDouble()) {
                                    squareBasedPyramid.setBase(s.nextDouble());
                                    if (squareBasedPyramid.getBase() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // HEIGHT -------------------------

                            garbage = s.nextLine();

                            do {
                                secondDone = false;
                                System.out.println("Please enter the height of the prism in centimetres:");
                                if (s.hasNextDouble()) {
                                    squareBasedPyramid.setHeight(s.nextDouble());
                                    if (squareBasedPyramid.getHeight() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // SLANT LENGTH ---------------------------

                            garbage = s.nextLine();

                            do {
                                secondDone = false;
                                System.out.println("Please enter the slant length (height of the triangular face) in centimetres:");
                                if (s.hasNextDouble()) {
                                    squareBasedPyramid.setSlantLength(s.nextDouble());
                                    if (squareBasedPyramid.getSlantLength() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // DISPLAY -------------------------

                            System.out.println(HalfSEPARATOR);
                            squareBasedPyramid.display();
                            surfaceArea = squareBasedPyramid.calcSurfaceArea();
                            volume = squareBasedPyramid.calcVolume();
                            System.out.println("Surface Area: " + surfaceArea + "cm^2");
                            System.out.println("Volume: " + volume + "cm^3");
                            System.out.println(HalfSEPARATOR);
                            System.out.println(SEPARATOR);
                            garbage = s.nextLine();

                            break;

                        } // END CASE 8

                        // CYLINDER ---------------------------------------------------------------------------------------

                        case 9: {
                            System.out.println(SEPARATOR);
                            System.out.println("You have selected cylinder!");
                            System.out.println(SEPARATOR);
                            garbage = s.nextLine();

                            // RADIUS -------------------------------------------

                            do {
                                secondDone = false;
                                System.out.println("Please enter the radius in centimetres:");
                                if (s.hasNextDouble()) {
                                    cylinder.setRadius(s.nextDouble());
                                    if (cylinder.getRadius() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // HEIGHT -------------------------

                            garbage = s.nextLine();

                            do {
                                secondDone = false;
                                System.out.println("Please enter the height in centimetres:");
                                if (s.hasNextDouble()) {
                                    cylinder.setHeight(s.nextDouble());
                                    if (cylinder.getHeight() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // DISPLAY -------------------------

                            System.out.println(HalfSEPARATOR);
                            cylinder.display();
                            surfaceArea = cylinder.calcSurfaceArea();
                            volume = cylinder.calcVolume();
                            System.out.println("Surface Area: " + surfaceArea + "cm^2");
                            System.out.println("Volume: " + volume + "cm^3");
                            System.out.println(HalfSEPARATOR);
                            System.out.println(SEPARATOR);
                            garbage = s.nextLine();

                            break;

                        } // END CASE 9

                        // CONE -----------------------------------------------------------------------------------------

                        case 10: {
                            System.out.println(SEPARATOR);
                            System.out.println("You have selected cone!");
                            System.out.println(SEPARATOR);
                            garbage = s.nextLine();

                            // RADIUS -------------------------------------------

                            do {
                                secondDone = false;
                                System.out.println("Please enter the radius of the base in centimetres:");
                                if (s.hasNextDouble()) {
                                    cone.setRadius(s.nextDouble());
                                    if (cone.getRadius() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // HEIGHT ------------------------------

                            garbage = s.nextLine();

                            do {
                                secondDone = false;
                                System.out.println("Please enter the height of the cone in centimetres:");
                                if (s.hasNextDouble()) {
                                    cone.setHeight(s.nextDouble());
                                    if (cone.getHeight() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // SLANT HEIGHT ------------------------------

                            garbage = s.nextLine();

                            do {
                                secondDone = false;
                                System.out.println("Please enter the slant height of the cone (distance between the vertex and the edge of the base) in centimetres:");
                                if (s.hasNextDouble()) {
                                    cone.setSlantHeight(s.nextDouble());
                                    if (cone.getSlantHeight() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);


                            // DISPLAY -------------------------

                            System.out.println(HalfSEPARATOR);
                            cone.display();
                            surfaceArea = cone.calcSurfaceArea();
                            volume = cone.calcVolume();
                            System.out.println("Surface Area: " + surfaceArea + "cm^2");
                            System.out.println("Volume: " + volume + "cm^3");
                            System.out.println(HalfSEPARATOR);
                            System.out.println(SEPARATOR);
                            garbage = s.nextLine();

                            break;

                        } // END CASE 10

                        // TRIANGLE-BASED PRISM ---------------------------------------------------------------------------

                        case 11: {
                            System.out.println(SEPARATOR);
                            System.out.println("You have selected triangle-based prism!");
                            System.out.println(SEPARATOR);
                            garbage = s.nextLine();

                            // BASE (TRIANGULAR FACE)  ------------------------

                            do {
                                secondDone = false;
                                System.out.println("Please enter the length of the base of the triangular face in centimetres:");
                                if (s.hasNextDouble()) {
                                    triangleBasedPrism.setBase(s.nextDouble());
                                    if (triangleBasedPrism.getBase() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // HEIGHT (TRIANGULAR FACE) -------------------------

                            garbage = s.nextLine();

                            do {
                                secondDone = false;
                                System.out.println("Please enter the height of the triangular face (side l) in centimetres:");
                                if (s.hasNextDouble()) {
                                    triangleBasedPrism.setTriangleFaceHeight(s.nextDouble());
                                    if (triangleBasedPrism.getTriangleFaceHeight() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // ARM ONE (TRIANGULAR FACE / SIDE A) ---------------------------

                            garbage = s.nextLine();

                            do {
                                secondDone = false;
                                System.out.println("Please enter the length of arm one (side a) in centimetres:");
                                if (s.hasNextDouble()) {
                                    triangleBasedPrism.setTriangleArmOne(s.nextDouble());
                                    if (triangleBasedPrism.getTriangleArmOne() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // ARM TWO (TRIANGULAR FACE / SIDE C) ---------------------------

                            garbage = s.nextLine();

                            do {
                                secondDone = false;
                                System.out.println("Please enter the length of arm two (side c) in centimetres:");
                                if (s.hasNextDouble()) {
                                    triangleBasedPrism.setTriangleArmTwo(s.nextDouble());
                                    if (triangleBasedPrism.getTriangleArmTwo() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);

                            // PRISM HEIGHT  -------------------------------------------------

                            garbage = s.nextLine();

                            do {
                                secondDone = false;
                                System.out.println("Please enter the height of the prism in centimetres:");
                                if (s.hasNextDouble()) {
                                    triangleBasedPrism.setPrismHeight(s.nextDouble());
                                    if (triangleBasedPrism.getPrismHeight() <= 0) {
                                        inputErrorWrongDouble();
                                        garbage = s.nextLine();
                                    } else {
                                        secondDone = true;
                                    }
                                } else {
                                    inputErrorNoDouble();
                                    garbage = s.nextLine();
                                }
                            } while (!secondDone);


                            // DISPLAY -------------------------

                            System.out.println(HalfSEPARATOR);
                            triangleBasedPrism.display();
                            surfaceArea = triangleBasedPrism.calcSurfaceArea();
                            volume = triangleBasedPrism.calcVolume();
                            System.out.println("Surface Area: " + surfaceArea + "cm^2");
                            System.out.println("Volume: " + volume + "cm^3");
                            System.out.println(HalfSEPARATOR);
                            System.out.println(SEPARATOR);
                            garbage = s.nextLine();

                            break;
                        } // END CASE 11

                        // EXIT COMMAND --------------------------------------------------------

                        case 0: {
                            exitProgram();
                            optionDone = true;
                            break;
                        }

                        // DEFAULT COMMAND (INTEGER LESS THAN 0 BUT GREATER THAN 11)

                        default: {
                            invalidIntegerMainMenu();
                            garbage = s.nextLine();
                            break;
                        }

                    } // END SWITCH STATEMENT

                    // ELSE COMMAND --> NO INTEGER ENTERED IN MAIN MENU -----------------------------------------------

                } else {
                    invalidIntegerMainMenu();
                    garbage = s.nextLine();
                }

                // OPTION: IF USER SAYS NO ------------------------------------------------------------------------------

            } else if (response.equals("NO")) {
                optionDone = true;
                exitProgram();

                // OPTION: ELSE COMMAND FOR ANY OTHER STRING VALUE  -------------------------------------------------------------------------------

            } else {
                System.out.println(SEPARATOR);
                System.out.println("\tINPUT ERROR: Entered string MUST be YES or NO!!!");
                System.out.println(SEPARATOR);
            }

        } while (!optionDone); // END SELECTION STATEMENT

    } // End Main Method
} // End Main Class