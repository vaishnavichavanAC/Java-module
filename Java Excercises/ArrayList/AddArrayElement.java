package org.Vaishnavi;
import java.util.ArrayList;
import java.util.Iterator;
public class AddArrayElement {

//	Modify the above Java program to insert an element into the array list at the first position.

	
	public static void main(String[] args) {
		
		
		ArrayList color = new ArrayList();
		
		ArrayList<String> colorObj = new ArrayList<String>();
		
		colorObj.add("PINK");
		colorObj.add("PURPLE");
		colorObj.add("Baby pink");
		colorObj.add("Levender");
		
		colorObj.add(0, "GREEN");
		
		Iterator<String> iterator = colorObj.iterator(); 
		
		while(iterator.hasNext()) {
			String data = iterator.next();
		System.out.println(data);
		}
	
	}

}
