package org.Vaishnavi;
import java.util.ArrayList;
import java.util.Iterator;
public class RemoveElement {

//	Modify the above Java program to remove the third element from a array list.

	
	public static void main(String[] args) {
		
		
		ArrayList color = new ArrayList();
		
		ArrayList<String> colorObj = new ArrayList<String>();
		System.out.println("The original list: ");
		colorObj.add("PINK");
		colorObj.add("PURPLE");
		colorObj.add("BABY PINK");
		colorObj.add("LEVENEDER");
		
		colorObj.add(0, "GREEN");
		
		
		Iterator<String> iterator = colorObj.iterator(); 
		
		while(iterator.hasNext()) {
			String data = iterator.next();
		System.out.println(data);
		}
		
		System.out.println("******************************");
	      
        int specifiedIndex = 2;
        
        String retrievedColor = colorObj.get(specifiedIndex);
       
        System.out.println("The element at index " + specifiedIndex + " is: " + retrievedColor);
        
        System.out.println("--------------------------------");
        
        
        colorObj.set(1, "BLACK");

        System.out.println("The updated is :" +colorObj);
        
        System.out.println("================================");
        
        colorObj.remove(3);
        System.out.println("The new upadted list after removal of third element is: " +colorObj);
        
	
	}
	
	

}
