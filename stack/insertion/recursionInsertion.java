package insertion;
import java.util.Stack;
public class recursionInsertion {
    public static void pushTBottom(Stack<Integer> st , int x){
        if(st.size()==0){
            st.push(x);
            return;
        }

        int top =st.pop();
        System.out.println(top);
        System.out.println(" ");
        pushTBottom(st, x);
        st.push(top);
       // System.out.println(top);
        System.out.println(st);
    }
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(8);
        System.out.println(st);
        pushTBottom(st, 01);
    }
}
