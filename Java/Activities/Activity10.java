package Activities;

import java.util.HashSet;

public class Activity10 {
	public static void main(String[] args) {
		// Create a HashSet
		HashSet<String> hs = new HashSet<>();

		// Add 6 objects using add() method
		hs.add("Apple");
		hs.add("Banana");
		hs.add("Mango");
		hs.add("Grapes");
		hs.add("Orange");
		hs.add("Pineapple");

		// Print the size of the HashSet
		System.out.println("Initial size of HashSet: " + hs.size());

		// Remove an element
		hs.remove("Mango");
		System.out.println("Removed 'Mango' from HashSet.");

		// Try to remove an element that is not in the set
		boolean removed = hs.remove("Papaya");
		if (!removed) {
			System.out.println("'Papaya' was not found in the HashSet.");
		}

		// Check if a specific element is present
		String checkItem = "Banana";
		if (hs.contains(checkItem)) {
			System.out.println(checkItem + " is present in the HashSet.");
		} else {
			System.out.println(checkItem + " is not present in the HashSet.");
		}

		// Print the updated HashSet
		System.out.println("Updated HashSet: " + hs);
	}
}
