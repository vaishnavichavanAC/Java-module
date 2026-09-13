
public class Triangle {

	
	/*2. Write a program to print the area and perimeter of a triangle having sides of 3, 4 
and 5 units by creating a class named 'Triangle' with constructor having the three 
sides as its parameters. */
	

	    int s1;
	    int s2;
	    int s3;

	    // Constructor
	    Triangle(int s1, int s2, int s3) {
	        this.s1 = s1;
	        this.s2 = s2;
	        this.s3 = s3;
	    }

	    void calculate() {

	        int perimeter = s1 + s2 + s3;

	        double semi = perimeter / 2.0;

	        double area = Math.sqrt(semi * (semi - s1)
	                * (semi - s2) * (semi - s3));

	        System.out.println("Area = " + area);
	        System.out.println("Perimeter = " + perimeter);
	    }

	    public static void main(String[] args) {

	        Triangle obj = new Triangle(3, 4, 5);

	        obj.calculate();
	    }
}
