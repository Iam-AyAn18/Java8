package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Examples {

	public static void main(String[] args) {

		// Create a HashMap
		HashMap<String, Integer> scores = new HashMap<>();

		// Add key-value pairs
		scores.put("John", 90);
		scores.put("Alice", 85);
		scores.put("Bob", 95);

		// HashMap can have one null key and multiple null values
		scores.put(null, null);
		scores.put("Sandesh", null);

		// Getting the size of the map
		System.out.println("Size Of The Map : " + scores.size());
		System.out.println("-----------------");

		// Displaying the elements
		System.out.println("The elements are :");
		Set<String> set = scores.keySet();
		Iterator<String> keySetIterator = set.iterator();

		while (keySetIterator.hasNext()) {
			Object key = keySetIterator.next();

			System.out.println(key + "  : " + scores.get(key));
		}

		scores.entrySet().stream().filter(s -> s.getKey() != null && s.getValue() != null && s.getValue() > 80)
				.forEach(System.out::println);

		System.out.println("-----------------");

		// Retrieve values
		int johnScore = scores.get("John");
		System.out.println("John's score: " + johnScore);

		// Check if a key exists
		boolean containsAlice = scores.containsKey("Alice");
		System.out.println("Contains Alice? " + containsAlice);
		System.out.println("Does this map has 90 as value? " + scores.containsValue(90));

		// Update a value
		scores.put("Bob", 98);

		// Iterate over key-value pairs
		for (String name : scores.keySet()) {
			int score = scores.get(name);
			System.out.println(name + ": " + score);
		}

		// Remove a key-value pair
		scores.remove("Alice");

		System.out.println(scores);
	}

}
