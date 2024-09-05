public class LinklistRepresentation {
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
        }
    }

    public static class LLStack {
        Node head = null;
        int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;

        }

        int pop() {
            if (head == null) {
                System.out.println("stack is empty");
                return -1;
            }
            int x = head.data;
            head = head.next;
            return x;
        }

        int size() {
            return size;
        }

        int peek() {
            if (head == null)
                return -1;
            return head.data;
        }

        void display() {
            displayRecur(head);
            System.out.println(" ");
        }

        void displayRecur(Node node) {
            if (node == null)
                return;

            displayRecur(node.next);
            System.out.println(node.data + " ");
        }

        void displayReverse() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LLStack l1 = new LLStack();
        l1.push(2);
        l1.push(4);
        l1.push(6);
        l1.push(8);

        l1.display();

        l1.peek();
        System.out.println(l1.peek());

        System.out.println("stack in reverse order");
        l1.displayReverse();
        System.out.println("peek");
        System.out.println(l1.peek());
        System.out.println("size");
        System.out.println(l1.size());
        System.out.println("\n");
        l1.pop();
        l1.display();
    }
}
