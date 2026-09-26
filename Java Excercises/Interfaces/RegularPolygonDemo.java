package org.Vaishnavi;

// Interface
interface RegularPolygon {

    // Abstract methods
    int getNumSides();

    double getSideLength();

    // Default method to calculate perimeter
    default double getPerimeter() {
        return getNumSides() * getSideLength();
    }

    // Default method to calculate interior angle
    default double getInteriorAngle() {
        int n = getNumSides();
        return ((n - 2) * Math.PI) / n;
    }
}

// Equilateral Triangle class
class EquilateralTriangle implements RegularPolygon {

    private double sideLength;

    // Constructor
    public EquilateralTriangle(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getNumSides() {
        return 3;
    }

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

    @Override
    public int getNumSides() {
        return 4;
    }

    @Override
    public double getSideLength() {
        return sideLength;
    }
}

// Main class
public class RegularPolygonDemo {

    // Static method to calculate total number of sides
    public static int totalSides(RegularPolygon[] polygons) {

        int total = 0;

        for (RegularPolygon polygon : polygons) {
            total = total + polygon.getNumSides();
        }

        return total;
    }

    public static void main(String[] args) {

        // Create triangle object
        EquilateralTriangle triangle =
                new EquilateralTriangle(10.5);

        // Create square object
        Square square =
                new Square(20.0);

        // Store both objects in RegularPolygon array
        RegularPolygon[] polygons = {
                triangle,
                square
        };

        // Calculate total number of sides
        int total = totalSides(polygons);

        System.out.println("Total number of sides: " + total);

        System.out.println("----------------------------");

        // Triangle details
        System.out.println("Triangle sides: "
                + triangle.getNumSides());

        System.out.println("Triangle side length: "
                + triangle.getSideLength());

        System.out.println("Triangle perimeter: "
                + triangle.getPerimeter());

        System.out.println("Triangle interior angle: "
                + triangle.getInteriorAngle()
                + " radians");

        System.out.println("----------------------------");

        // Square details
        System.out.println("Square sides: "
                + square.getNumSides());

        System.out.println("Square side length: "
                + square.getSideLength());

        System.out.println("Square perimeter: "
                + square.getPerimeter());

        System.out.println("Square interior angle: "
                + square.getInteriorAngle()
                + " radians");
    }
}
