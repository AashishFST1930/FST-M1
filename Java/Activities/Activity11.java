package Activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
	public static void main(String[] args) {
		// Create a Map with Integer keys and String values
		Map<Integer, String> colours = new HashMap<>();

		// Add 5 random colours
		colours.put(1, "Red");
		colours.put(2, "Blue");
		colours.put(3, "Green");
		colours.put(4, "Yellow");
		colours.put(5, "Purple");

		// Print the Map
		System.out.println("Initial Map: " + colours);

		// Remove one colour using remove() method
		colours.remove(4); // Removing "Yellow"
		System.out.println("Map after removing key 4: " + colours);

		// Check if "Green" exists using containsValue()
		if (colours.containsValue("Green")) {
			System.out.println("The colour 'Green' exists in the Map.");
		} else {
			System.out.println("The colour 'Green' does not exist in the Map.");
		}

		// Print the size of the Map
		System.out.println("Size of the Map: " + colours.size());
	}
}
