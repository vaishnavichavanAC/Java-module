
package org.Vaishnavi;

import java.util.TreeSet;

public class GreaterTreeElement {

    public static void main(String[] args) {

        // Create a TreeSet
        TreeSet<String> colors = new TreeSet<String>();

        // Add colors
        colors.add("BLACK");
        colors.add("GREEN");
        colors.add("PINK");
        colors.add("PURPLE");
        colors.add("YELLOW");

        // Print the TreeSet
        System.out.println("TreeSet: " + colors);

        // Given element
        String givenColor = "PINK";

        // Find element greater than or equal to given element
        String result = colors.ceiling(givenColor);

        // Print result
        System.out.println("Given element: " + givenColor);
        System.out.println("Element greater than or equal to "
                + givenColor + ": " + result);
    }
}

