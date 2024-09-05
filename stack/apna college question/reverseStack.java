
import java.util.Stack;
public class reverseStack{

    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);

    }

    public static void Reverse(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        Reverse(s);
        pushAtBottom(s, top);
    }

    public static void print(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        System.out.println(s);
                                     //print(s);
        pushAtBottom(s, 0);
        System.out.println(s);
       System.out.println(" ");
                                       // print(s);

        System.out.println("reverse stack is");

        Reverse(s);
        
        System.out.println(s);
        print(s);
        

        
    }
}