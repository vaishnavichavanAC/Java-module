
public class Rectangle {

    int length;
    int breadth;

    // Constructor
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to print area
    void area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    // Method to print perimeter
    void perimeter() {
        System.out.println("Perimeter of Rectangle = " + (2 * (length + breadth)));
    }
}
