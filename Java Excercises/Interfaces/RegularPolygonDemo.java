	package org.Vaishnavi;

// Interface
interface RegularPolygon {

    int getNumSides();

    double getSideLength();
}


// Equilateral Triangle class
class EquilateralTriangle implements RegularPolygon {

    private double sideLength;

    // Constructor
    public EquilateralTriangle(double sideLength) {
        this.sideLength = sideLength;
    }

    // Implementing getNumSides()
    @Override
    public int getNumSides() {
        return 3;
    }

    // Implementing getSideLength()
    @Override
    public double getSideLength() {
        return sideLength;
    }
}


// Square class
class Square implements RegularPolygon {

    private double sideLength;

    // Constructor
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    // Implementing getNumSides()
    @Override
    public int getNumSides() {
        return 4;
    }

    // Implementing getSideLength()
    @Override
    public double getSideLength() {
        return sideLength;
    }
}


// Main class
public class RegularPolygonDemo {

    public static void main(String[] args) {

        // Create EquilateralTriangle object
        EquilateralTriangle triangle =
                new EquilateralTriangle(10.5);

        System.out.println("Equilateral Triangle");
        System.out.println("Number of sides: "
                + triangle.getNumSides());
        System.out.println("Side length: "
                + triangle.getSideLength());

        System.out.println("-------------------------");

        // Create Square object
        Square square = new Square(20.0);

        System.out.println("Square");
        System.out.println("Number of sides: "
                + square.getNumSides());
        System.out.println("Side length: "
                + square.getSideLength());
    }
}

