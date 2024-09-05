import java.util.Stack;

public class reverseStringUsingStack {
    public static String ReverseString(String str){
        S> st = new Stack<>();

        int idx=0;
        while(idx <str.length()){
           // int s=str.charAt(idx);
            st.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result =new StringBuilder(" ");

        while(!st.isEmpty()){
            char curr = st.pop();
            result.append(curr);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str =" abcd";
        System.out.println(str);
        String r = ReverseString(str);
        System.out.println(r);
    }
    
}
