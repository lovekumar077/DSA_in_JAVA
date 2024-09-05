import java.util.Scanner;
import java.util.Stack;

class creation{
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(8);
        System.out.println(st);
        System.out.println(st.peek());
        Stack<Integer> rt = new Stack<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter elements");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            int x = sc.nextInt();
            rt.push(x);

        }
        System.out.println(rt);

        while(rt.size()>1){
            rt.pop();
        }
        System.out.println(rt.peek());
        System.out.println(rt);

    }
}