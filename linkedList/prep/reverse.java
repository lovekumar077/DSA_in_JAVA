class Node {

  int data;
  Node next;

  Node(int data) {
    this.data = data;
  }
}

class reverse {

  static void traverse(Node head) {
    Node curr = head;

    while (curr != null) {
      System.out.println(curr.data);
      curr = curr.next;
    }
  }

  public static void insert(int data, Node head, int index) {
    Node toAdd = new Node(data);
    if (index == 0) {
      toAdd.next = head;
      head = toAdd;
      return;
    }
    Node prev = head;
    for (int i = 0; i <= index - 1; i++) {
      prev = prev.next;
    }

    toAdd.next = prev.next;
    prev.next = toAdd;
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
    Node N4 = new Node(10);

    Node head = N1;
    head.next = N2;
    N2.next = N3;
    N3.next = N4;
    N4.next = null;
    traverse(head);
    insert(12, head, 2);
    traverse(head);
    System.out.println(" ");

    head = reverse(head);
    traverse(head);

  }
}