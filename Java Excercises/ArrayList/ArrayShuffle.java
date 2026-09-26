
package org.Vaishnavi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayShuffle {

    public static void main(String[] args) {

        ArrayList<String> colorObj = new ArrayList<String>();

        // Adding elements to ArrayList
        System.out.println("The original list:");

        colorObj.add("PINK");
        colorObj.add("PURPLE");
        colorObj.add("BABY PINK");
        colorObj.add("LEVENEDER");

        // Adding GREEN at index 0
        colorObj.add(0, "GREEN");

        // Displaying elements using Iterator
        Iterator<String> iterator = colorObj.iterator();

        while (iterator.hasNext()) {
            String data = iterator.next();
            System.out.println(data);
        }

        System.out.println("================================");

        // Get element at specified index
        int specifiedIndex = 2;

        String retrievedColor = colorObj.get(specifiedIndex);

        System.out.println("The element at index "
                + specifiedIndex + " is: " + retrievedColor);

        System.out.println("--------------------------------");

        // Update an element
        colorObj.set(1, "BLACK");

        System.out.println("The updated list is: " + colorObj);

        System.out.println("================================");

        // Remove an element
        colorObj.remove(3);

        System.out.println("The new updated list after removal: "
                + colorObj);

        System.out.println("--------------------------------");

        // Check whether BLACK exists
        Boolean hasBLACK = colorObj.contains("BLACK");

        System.out.println("Does the list contain BLACK: "
                + hasBLACK);

        // Check whether Yellow exists
        Boolean hasYellow = colorObj.contains("Yellow");

        System.out.println("Does the list contain Yellow: "
                + hasYellow);

        System.out.println("==================================");

        // Sort the ArrayList
        Collections.sort(colorObj);

        System.out.println("After sorting: " + colorObj);

        System.out.println("==================================");

        // Shuffle the ArrayList
        Collections.shuffle(colorObj);

        System.out.println("After shuffling: " + colorObj);
    }
}
