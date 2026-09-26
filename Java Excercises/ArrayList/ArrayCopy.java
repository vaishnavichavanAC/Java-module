package org.Vaishnavi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayCopy {

    public static void main(String[] args) {

        ArrayList<String> colorObj = new ArrayList<String>();

        System.out.println("The original list:");

        colorObj.add("PINK");
        colorObj.add("PURPLE");
        colorObj.add("BABY PINK");
        colorObj.add("LEVENEDER");

        colorObj.add(0, "GREEN");

        Iterator<String> iterator = colorObj.iterator();

        while (iterator.hasNext()) {
            String data = iterator.next();
            System.out.println(data);
        }

        System.out.println("================================");

        int specifiedIndex = 2;

        String retrievedColor = colorObj.get(specifiedIndex);

        System.out.println("The element at index " + specifiedIndex
                + " is: " + retrievedColor);

        System.out.println("--------------------------------");

        colorObj.set(1, "BLACK");

        System.out.println("The updated list is: " + colorObj);

        System.out.println("================================");

        colorObj.remove(3);

        System.out.println("The new updated list after removal: "
                + colorObj);

        System.out.println("--------------------------------");

        Boolean hasBLACK = colorObj.contains("BLACK");
        System.out.println("Does the list contain BLACK: " + hasBLACK);

        Boolean hasYellow = colorObj.contains("Yellow");
        System.out.println("Does the list contain Yellow: " + hasYellow);

        System.out.println("==================================");

        Collections.sort(colorObj);

        System.out.println("After sorting: " + colorObj);

        System.out.println("==================================");

        // Creating another ArrayList
        ArrayList<String> copiedColors = new ArrayList<String>();

        // Destination list must have the same size
        // as the source list
        for (int i = 0; i < colorObj.size(); i++) {
            copiedColors.add("");
        }

        // Copy colorObj into copiedColors
        Collections.copy(copiedColors, colorObj);

        System.out.println("Original list: " + colorObj);
        System.out.println("Copied list: " + copiedColors);
    }
}
