
package org.Vaishnavi;

import java.util.TreeSet;

public class ReverseTreeset {

    public static void main(String[] args) {

        // Create a TreeSet
        TreeSet<String> colors = new TreeSet<String>();

        // Add colors
        colors.add("PINK");
        colors.add("PURPLE");
        colors.add("GREEN");
        colors.add("BLACK");
        colors.add("YELLOW");

        // Print original TreeSet
        System.out.println("Original TreeSet: " + colors);

        // Create reverse order view
        TreeSet<String> reverseColors =
                (TreeSet<String>) colors.descendingSet();

        // Print reverse order TreeSet
        System.out.println("Reverse order TreeSet: " + reverseColors);
    }
}
