
package org.Vaishnavi;

import java.util.TreeSet;

public class AddElementsTreeset {

    public static void main(String[] args) {

        // Create first TreeSet
        TreeSet<String> colors1 = new TreeSet<String>();

        // Add colors to first TreeSet
        colors1.add("PINK");
        colors1.add("PURPLE");
        colors1.add("GREEN");
        colors1.add("BLACK");
        colors1.add("YELLOW");

        System.out.println("First TreeSet: " + colors1);

        TreeSet<String> colors2 = new TreeSet<String>();

        
        colors2.add("BLUE");
        colors2.add("RED");

        System.out.println("Second TreeSet before adding: " + colors2);

        
        colors2.addAll(colors1);

        System.out.println("Second TreeSet after adding: " + colors2);
    }
}
