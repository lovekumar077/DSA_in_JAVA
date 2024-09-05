import java.util.Stack;

public class insertionBottom {

    public static void pushAtBotttom(Stack<Integer> st,int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBotttom(st, x);
        st.push(top);
    }
     public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(8);
        System.out.println(st);
        Stack<Integer> rt = new Stack<>();

        while(st.size()>0){
            rt.push(st.pop());

        }
        st.push(10);
        while(rt.size()>0){
            st.push(rt.pop());
        }
    System.out.println(st);
    pushAtBotttom(st, 20);
    System.out.println(st);
}
}