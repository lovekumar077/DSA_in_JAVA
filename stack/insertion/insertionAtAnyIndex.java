package insertion;
import java.util.Stack;

public class insertionAtAnyIndex {
    public static void insertion(Stack<Integer> st,int index,int element){
            Stack<Integer> temp = new Stack<>();

            while(st.size()>index){
                if(st.size()==0){
                    return;
                }
                temp.push(st.pop());
            }
            st.push(element);

            while(temp.size()>0){
                st.push(temp.pop());
            }

            System.out.println(st);
    }
    public static void main(String[] args) {
        Stack <Integer> st =new Stack<>();
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(8);
        st.push(9);
        st.push(10);
         System.out.println(st);

         insertion(st,3,7);

    }
}
