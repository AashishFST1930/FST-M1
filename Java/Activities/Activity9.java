package Activities;

import java.util.ArrayList;

public class Activity9 {
	public static void main(String[] args) {
		// Create an ArrayList of type String
		ArrayList<String> myList = new ArrayList<>();

		// Add 5 names using add() method
		myList.add("Amit");
		myList.add("Neha");
		myList.add("Ravi");
		myList.add("Priya");
		myList.add("Karan");

		// Print all names using a for loop
		System.out.println("All names in the list:");
		for (String name :myList) {
			System.out.println(name);
		}

		// Retrieve and print the 3rd name (index 2)
		System.out.println("\n3rd name in the list: " + myList.get(2));

		// Check if a name exists using contains()
		String nameToCheck = "Ravi";
		if (myList.contains(nameToCheck)) {
			System.out.println(nameToCheck + " exists in the list.");
		} else {
			System.out.println(nameToCheck + " does not exist in the list.");
		}

		// Print the size of the list
		System.out.println("\nSize of list: " + myList.size());

		// Remove a name and print the new size
		myList.remove("Neha");
		System.out.println("After removing 'Neha', size of list: " + myList.size());
	}
}
