
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Add element at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Add element at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    // Search for an element
    public boolean search(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Get the size of the linked list
    public int size() {
        return size;
    }

    // Remove the first element
    public void removeFirst() {
        if (head == null)
            return;
        head = head.next;
        size--;
    }

    // Remove the last element
    public void removeLast() {
        if (head == null)
            return;
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }

    // Remove element at given index
    public void remove(int index) {
        if (index < 0 || index >= size)
            return;
        if (index == 0) {
            removeFirst();
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    // Reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node nextNode = null;
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;
    }

    // Print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        System.out.println("Linked List:");
        list.printList();

        System.out.println("Is 3 present? " + list.search(3));
        System.out.println("Size of the linked list: " + list.size());

        list.removeFirst();
        list.removeLast();
        list.remove(1);

        System.out.println("Linked List after removing first, last and element at index 1:");
        list.printList();

        list.reverse();
        System.out.println("Reversed Linked List:");
        list.printList();
    }
}
