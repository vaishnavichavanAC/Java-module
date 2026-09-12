
public class Program {

	public static void main(String[] args) {
	
		
		
//		int number1 =ConsoleInput.getInt();
//		int number2 =ConsoleInput.getInt();
//		
		
		ComplexNumber[] arr = new ComplexNumber[5];
		for (int i = 0; i < 5; i++) {

            arr[i] = new ComplexNumber();

            System.out.println("Enter number1 for object " + (i + 1) + ":");
            int n1 = ConsoleInput.getInt();
            arr[i].setNumber1(n1);

            System.out.println("Enter number2 for object " + (i + 1) + ":");
            int n2 = ConsoleInput.getInt();
            arr[i].setNumber2(n2);
        }

        // Displaying multiplication result
        System.out.println("Results:");

        for (int i = 0; i < 5; i++) {

            int result = arr[i].computeComplexNumber();

            System.out.println("Result for object " + (i + 1) + " = " + result);
        }
		
	
	}
}
