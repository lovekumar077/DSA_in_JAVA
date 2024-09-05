public class doublyLL {
    static Node head;
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            this.data=d;
        }
    }
    static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    static void reverse(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.prev;
        }
    }
    public static Node insertionBegining(Node head,int x){
        Node t=new Node(x);
        t.next=head;
        head.prev=t;
        head=t;
        return t;
    }

    public static void insertion(Node head,int x,int index){
        
        // if(index==0){
        //     Node t =new Node(x);
        //     t.next=head;
        //     head.prev=t;
        //     head=t;
            
        // }
        Node temp=head;
        for(int i=0;i<=index-1;i++){
            temp=temp.next;
        }
        Node t=new Node(x);
        temp.next=t;
        t.prev=temp;
        t.next=temp.next;
        temp.next=t;



    }


    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(4);
        Node c=new Node(6);
        Node d=new Node(8);
        Node e=new Node(10);
        Node f=new Node(12);
        head=a;

        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=f;
        f.prev=e;
        f.next=null;
        a.prev=null;

        display(a);
      //  reverse(f);
      Node newHead = insertionBegining(a, 1);
      display(newHead);

      // insertion(a, 3, 2);
      //display(a);



        
        
    }
    
}
