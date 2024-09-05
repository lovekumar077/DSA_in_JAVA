
import java.util.ArrayList;
import java.util.Collections;

class Node {
    int data;
    Node next;
    Node child;

    // Constructors to initialize the
    // data, next, and child pointers
    Node() {
        data = 0;
        next = null;
        child = null;
    }

    Node(int x) {
        data = x;
        next = null;
        child = null;
    }

    Node(int x, Node nextNode, Node childNode) {
        data = x;
        next = nextNode;
        child = childNode;
    }
}

public class FlattenLinkedList {

    // Function to convert an ArrayList to a linked list
    static Node convertArrToLinkedList(ArrayList<Integer> arr) {
        // Create a dummy node to serve as
        // the head of the linked list
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;

        // Iterate through the ArrayList and
        // create nodes with elements
        for (int i = 0; i < arr.size(); i++) {
            // Create a new node with the element
            temp.child = new Node(arr.get(i));
            // Move the temporary pointer
            // to the newly created node
            temp = temp.child;
        }
        // Return the linked list starting
        // from the next of the dummy node
        return dummyNode.child;
    }

    // Function to flatten a linked list with child pointers
    static Node flattenLinkedList(Node head) {
        ArrayList<Integer> arr = new ArrayList<>();

        // Traverse through the linked list
        while (head != null) {
            // Traverse through the child
            // nodes of each head node
            Node t2 = head;
            while (t2 != null) {
                // Store each node's data in the ArrayList
                arr.add(t2.data);
                // Move to the next child node
                t2 = t2.child;
            }
            // Move to the next head node
            head = head.next;
        }

        // Sort the ArrayList containing
        // node values in ascending order
        Collections.sort(arr);

        // Convert the sorted ArrayList
        // back to a linked list
        return convertArrToLinkedList(arr);
    }

    // Print the linked list by
    // traversing through child pointers
    static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.child;
        }
        System.out.println();
    }

    // Print the linked list
    // in a grid-like structure
    static void printOriginalLinkedList(Node head, int depth) {
        while (head != null) {
            System.out.print(head.data);

            // If child exists, recursively
            // print it with indentation
            if (head.child != null) {
                System.out.print(" -> ");
                printOriginalLinkedList(head.child, depth + 1);
            }

            // Add vertical bars
            // for each level in the grid
            if (head.next != null) {
                System.out.println();
                for (int i = 0; i < depth; ++i) {
                    System.out.print("| ");
                }
            }
            head = head.next;
        }
    }

    public static void main(String[] args) {
        // Create a linked list with child pointers
        Node head = new Node(5);
        head.child = new Node(14);

        head.next = new Node(10);
        head.next.child = new Node(4);

        head.next.next = new Node(12);
        head.next.next.child = new Node(20);
        head.next.next.child.child = new Node(13);

        head.next.next.next = new Node(7);
        head.next.next.next.child = new Node(17);

        // Print the original
        // linked list structure
        System.out.println("Original linked list:");
        printOriginalLinkedList(head, 0);

        // Flatten the linked list
        // and print the flattened list
        Node flattened = flattenLinkedList(head);
        System.out.println("\nFlattened linked list: ");
        printLinkedList(flattened);
    }
}
