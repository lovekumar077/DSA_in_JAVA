import java.util.*;

public class queueJCF {
    //java collection framework
    public static void main(String[] args) {
        
    

    Queue<Integer> q=new LinkedList<>();  //or ArrayDeque

    //we cannot make object of Queue because 
    //Queue is not a class it is a interface
    
    q.add(11);
    q.add(12);
    q.add(13);
    q.add(14);

    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }
}
}
