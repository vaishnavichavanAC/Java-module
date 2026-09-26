
package org.Vaishnavi;

import java.util.TreeSet;

public class GetFirst {

    public static void main(String[] args) {

        // Create a TreeSet
        TreeSet<String> colors = new TreeSet<String>();

        // Add colors
        colors.add("PINK");
        colors.add("PURPLE");
        colors.add("GREEN");
        colors.add("BLACK");
        colors.add("YELLOW");

        // Print the TreeSet
        System.out.println("TreeSet: " + colors);

        // Get first element
        String firstColor = colors.first();

        // Get last element
        String lastColor = colors.last();

        // Print first and last elements
        System.out.println("First element: " + firstColor);
        System.out.println("Last element: " + lastColor);
    }
}

