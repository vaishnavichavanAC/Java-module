
public class Employee2 {

	
	/*6. Write a program by creating an 'Employee' class having the following methods 
and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee
as parameter
2 - 'addSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'addWork()' which adds $5 to salary of employee if the number of hours of 
work per day is more than 6 hours
*/
	

	    double salary;
	    int hours;

	    // Method to get employee information
	    void getInfo(double salary, int hours) {
	        this.salary = salary;
	        this.hours = hours;
	    }

	    // Add $10 if salary is less than $500
	    void addSal() {
	        if (salary < 500) {
	            salary = salary + 10;
	        }
	    }

	    // Add $5 if working hours are more than 6
	    void addWork() {
	        if (hours > 6) {
	            salary = salary + 5;
	        }
	    }

	    public static void main(String[] args) {

	        Employee2 e = new Employee2();

	        e.getInfo(450, 8);

	        e.addSal();
	        e.addWork();

	        System.out.println("Final Salary = $" + e.salary);
	    }
	

}
