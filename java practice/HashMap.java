import java.util.HashMap;
public class HashMap {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> ages = new HashMap<>();

        // Adding key-value pairs
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        ages.put("Charlie", 35);

        // Accessing values
        System.out.println("Bob's age is " + ages.get("Bob"));

        // Iterating over entries
        for (String name : ages.keySet()) {
            System.out.println(name + " is " + ages.get(name) + " years old.");
        }
    }
}
