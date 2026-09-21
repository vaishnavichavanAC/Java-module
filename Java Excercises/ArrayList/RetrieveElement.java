package org.Vaishnavi;
import java.util.ArrayList;
import java.util.Iterator;
public class RetrieveElement {

//	Modify the above Java program to retrieve an element (at a specified index) from a given array list.

	
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
	      
        int specifiedIndex = 2;
        
        String retrievedColor = colorObj.get(specifiedIndex);
       
        System.out.println("The element at index " + specifiedIndex + " is: " + retrievedColor);
	}

}
