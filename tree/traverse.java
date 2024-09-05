
import java.util.*;

class Node {
  Node left, right;

  int data;

  Node(int data) {
    this.data = data;
  }
}

public class traverse {
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

    // System.out.println(root.data);

    return root;
  }

  static void InOrder(Node root) {
    if (root == null)
      return;

    InOrder(root.left);
    System.out.println(root.data + " ");

    InOrder(root.right);
  }

  static void preOrder(Node root) {
    if (root == null)
      return;

    System.out.println(root.data);

    preOrder(root.left);
    preOrder(root.right);
  }

  static void postOrder(Node root) {
    if (root == null)
      return;

    postOrder(root.left);
    postOrder(root.right);

    System.out.println(root.data);
  }

  public static void main(String[] args) {

    Node rootttt = createTree();

    InOrder(rootttt);
    System.out.println(" ");

    preOrder(rootttt);

    System.out.println();

    postOrder(rootttt);

  }
}
