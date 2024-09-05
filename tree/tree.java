import java.util.*;

class Node {
  Node left, right;

  int data;

  Node(int data) {
    this.data = data;
  }

  Node(int data, Node left, Node right) {
    this.data = data;
    this.left = left;

    this.right = right;
  }
}

class tree {
  static Scanner sc = new Scanner(System.in);

  static Node createTree() {
    Node root = null;
    System.out.println("enter data");

    int data = sc.nextInt();
    if (data == -1) {
      return null;
    }

    root = new Node(data);

    System.out.println("enter left node" + data);
    root.left = createTree();

    System.out.println("enter right node" + data);
    root.right = createTree();

    System.out.println(root.data);

    return root;
  }

  public static void main(String[] args) {

    createTree();

  }
}