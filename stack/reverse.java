import java.util.Stack;

public class reverse {
     public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(8);
        System.out.println(st);

        Stack<Integer> rt =new Stack<>();
        while(st.size()>0){
           int x= st.peek();
           rt.push(x);
           st.pop();

            // rt.push(st.pop());
            // rt.push(st.pop());
        }
        System.out.println(rt);
}
}