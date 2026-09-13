
public class ComplexNumber {
	
	
	
	/*4. Print the sum, difference and product of two complex numbers by creating a 
	class named 'Complex' with separate methods for each operation whose real and 
	imaginary parts are entered by user
*/

	    int real;
	    int imaginary;

	    // Constructor
	    ComplexNumber(int real, int imaginary) {
	        this.real = real;
	        this.imaginary = imaginary;
	    }

	    // Sum
	    void sum(ComplexNumber c) {
	        int realPart = this.real + c.real;
	        int imaginaryPart = this.imaginary + c.imaginary;

	        System.out.println("Sum = " + realPart + " + " + imaginaryPart + "i");
	    }

	    // Difference
	    void difference(ComplexNumber c) {
	        int realPart = this.real - c.real;
	        int imaginaryPart = this.imaginary - c.imaginary;

	        System.out.println("Difference = " + realPart + " + " + imaginaryPart + "i");
	    }

	    // Product
	    void product(ComplexNumber c) {
	        int realPart = (this.real * c.real) - (this.imaginary * c.imaginary);
	        int imaginaryPart = (this.real * c.imaginary) + (this.imaginary * c.real);

	        System.out.println("Product = " + realPart + " + " + imaginaryPart + "i");
	    }

	    public static void main(String[] args) {

	        System.out.println("Enter real part of first complex number:");
	        int r1 = ConsoleInput.getInt();

	        System.out.println("Enter imaginary part of first complex number:");
	        int i1 = ConsoleInput.getInt();

	        System.out.println("Enter real part of second complex number:");
	        int r2 = ConsoleInput.getInt();

	        System.out.println("Enter imaginary part of second complex number:");
	        int i2 = ConsoleInput.getInt();

	        ComplexNumber c1 = new ComplexNumber(r1, i1);
	        ComplexNumber c2 = new ComplexNumber(r2, i2);

	        c1.sum(c2);
	        c1.difference(c2);
	        c1.product(c2);
	    }
	}



