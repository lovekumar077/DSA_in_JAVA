class Node {

  int data;
  Node next;

  Node(int data) {
    this.data = data;
  }
}

class palindrome {

  static void traverse(Node head) {
    Node curr = head;

    while (curr != null) {
      System.out.println(curr.data);
      curr = curr.next;
    }
  }

  static boolean ispalindrome(Node head) {
    if (head == null)
      return true;

    Node mid = middle(head);
    Node last = reverse(mid.next);
    Node curr = head;
    while (curr != null) {
      if (last.data != curr.data) {
        return false;
      }
      last = last.next;
      curr = curr.next;
    }
    return true;
  }

  static Node middle(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

    }
    return slow;
  }

  static Node reverse(Node head) {
    Node prev = null;
    Node curr = head;
    Node nextPtr;

    while (curr != null) {
      nextPtr = curr.next;
      curr.next = prev;

      prev = curr;
      curr = nextPtr;
    }
    return prev;
  }

  public static void main(String[] args) {
    Node N1 = new Node(2);
    Node N2 = new Node(4);
    Node N3 = new Node(8);
    Node N4 = new Node(4);
    Node N5 = new Node(22);

    Node head = N1;
    head.next = N2;
    N2.next = N3;
    N3.next = N4;
    N4.next = N5;
    N5.next = null;
    traverse(head);

    System.out.println(ispalindrome(head));
  }

}
