package hashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Examples {

	public static void main(String[] args) {
        // Create a HashSet
        Set<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add(null);

        System.out.println("HashSet: " + hashSet);

        // Check if an element exists in the HashSet
        boolean containsBanana = hashSet.contains("Banana");
        System.out.println("Contains 'Banana': " + containsBanana);

        // Remove an element from the HashSet
        hashSet.remove("Orange");
        System.out.println("HashSet after removal: " + hashSet);

        // Get the size of the HashSet
        int size = hashSet.size();
        System.out.println("Size of HashSet: " + size);

        // Iterate over the elements of the HashSet
        System.out.println("Elements of HashSet:");
        for (String element : hashSet) {
            System.out.println(element);
        }
        System.out.println("===========");
        hashSet.stream().filter(s->s!=null).forEach(System.out::println);
        
        //getting synchronized set
        Set<String> syncSet = Collections.synchronizedSet(hashSet);
        System.out.println(syncSet);

        // Clear the HashSet
        hashSet.clear();
        System.out.println("HashSet after clearing: " + hashSet);
        
    }

}
