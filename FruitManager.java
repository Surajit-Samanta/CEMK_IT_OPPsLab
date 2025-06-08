import java.util.*;

public class FruitManager {
    public static void main(String[] args) {
        // Step 1: Create a Vector and add fruits from command-line arguments
        Vector<String> fruits = new Vector<>();
        Collections.addAll(fruits, args);
        System.out.println("Initial fruits in the Vector: " + fruits);

        // Step 2a: Add another fruit at the end
        fruits.add("Mango");
        System.out.println("After adding 'Mango' at the end: " + fruits);

        // Step 2b: Insert another fruit at a specified location
        int insertIndex = 1; // Example: Insert at index 1
        String newFruit = "Pineapple";
        if (insertIndex >= 0 && insertIndex <= fruits.size()) {
            fruits.add(insertIndex, newFruit);
            System.out.println("After inserting 'Pineapple' at index " + insertIndex + ": " + fruits);
        } else {
            System.out.println("Invalid insertion index: " + insertIndex);
        }

        // Step 2c: Remove a fruit from a specified location
        int removeIndex = 2; // Example: Remove at index 2
        if (removeIndex >= 0 && removeIndex < fruits.size()) {
            String removedFruit = fruits.remove(removeIndex);
            System.out.println("After removing '" + removedFruit + "' from index " + removeIndex + ": " + fruits);
        } else {
            System.out.println("Invalid removal index: " + removeIndex);
        }

        // Step 2d: Copy all the elements of the Vector into an array
        String[] fruitArray = new String[fruits.size()];
        fruits.copyInto(fruitArray);

        // Step 2e: Display the contents of the array
        System.out.println("Contents of the array:");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }
    }
}
