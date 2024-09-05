import java.util.Stack;

public class reverseRecrursion {
    public static void displayRev(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int top = st.pop();
         System.out.println(top);
        displayRev(st);
        // System.out.println(top);
        st.push(top);
        System.out.println(st);
    }
     public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(8);
        System.out.println(st);
      displayRev(st);

        
     }
}
