package practice;

import java.util.Stack;

public class reverseRecursion {

  static void displayRev(Stack<Integer> rt) {
    if (rt.size() == 0)
      return;

    int top = rt.pop();
    System.out.println(top);

    displayRev(rt);
    rt.push(top);
    // System.out.println(rt);
  }

  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(2);
    st.push(22);
    st.push(23);
    st.push(24);
    st.push(25);
    st.push(27);

    System.out.println(st);

    displayRev(st);
    System.out.println(st);

  }
}
