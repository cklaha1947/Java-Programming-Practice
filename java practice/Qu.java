import java.util.LinkedList;
import java.util.Queue;

public class Qu {
    public static void main(String[] args) {
        // Creating a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the Queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        // Displaying the Queue
        System.out.println("Queue: " + queue);

        // Removing an element from the Queue
        String removedElement = queue.remove();
        System.out.println("Removed Element: " + removedElement);

        // Displaying the Queue after removal
        System.out.println("Queue after removal: " + queue);

        // Peeking the element (Getting the front element without removing it)
        String frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement);

        // Displaying the Queue after peek
        System.out.println("Queue after peek: " + queue);

        // Checking if the Queue contains a specific element
        boolean containsBob = queue.contains("Bob");
        System.out.println("Queue contains Bob? " + containsBob);

        // Checking if the Queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the Queue empty? " + isEmpty);

        // Getting the size of the Queue
        int size = queue.size();
        System.out.println("Size of the Queue: " + size);

        // Clearing the Queue
        queue.clear();
        System.out.println("Queue after clearing: " + queue);
    }
}

