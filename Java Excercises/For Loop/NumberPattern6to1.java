
public class NumberPattern6to1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*8. Using for loops write a program to display the following pattern
		1 2 3 4 5 6
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2 
        1
        */
		System.out.println("-Pattern 6 to 1-");		
		int num=0;
		for(int i=1; i<=6; i++) {
			
			for(int j=1;j<=7-i; j++) {
				
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
