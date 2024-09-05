package practice;

import java.util.Stack;

public class insertBottom {

  public static void main(String[] args) {

    Stack<Integer> st = new Stack<>();

    st.push(2);
    st.push(22);
    st.push(23);
    st.push(24);
    st.push(25);
    st.push(27);

    System.out.println(st);

    Stack<Integer> temp = new Stack<>();

    int index = 1;

    while (st.size() > index) {
      temp.push(st.pop());
    }

    st.push(21);

    while (temp.size() > 0) {
      st.push(temp.pop());
    }

    System.out.println(st);
  }

}
