
public class StringReverse {

	public static void main(String[] args) {
		
		
		String str ="The quick brown fox jumps";
		System.out.println("The given string is:" +str);
		
		String reversedstr = new StringBuilder(str).reverse().toString();
		System.out.println("The string in reverse order is:" );
		System.out.println(reversedstr);

	}

}
