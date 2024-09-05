// package oper;


class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
    }

}
public class palindrome{

     public static void traverse(Node head)
    {
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
     static boolean ispalindrome(Node head){
        if(head==null){
            return true;
        }
        Node mid = middle(head);
        Node last = reverse(mid.next);
        Node curr =head;
        while(last!=null){
            if(last.data !=curr.data){
                return false;
            }
            last =last.next;
            curr = curr.next;
        }
        return true;
      }

       public static Node reverse(Node node){
         Node prev =null;
         Node curr = node;
         Node nextptr=null;

         while(curr!=null){
             nextptr = curr.next;
             curr.next=prev;

             prev = curr;
             curr = nextptr;
             //System.out.println();
         }
         node = prev;
         return node;

      }

    public static Node middle(Node head){
        Node slow= head;
        Node fast = head;
        while( fast !=null && fast.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
public static void main(String[] args) {
    Node a= new Node(1);
    Node b = new Node(2);
    Node c= new Node(3);
    Node d =new Node(2);
    Node e =new Node(1);

     Node head  = a;
    head.next=b;
    b.next = c;
    c.next =d;
    d.next=e;
    e.next = null;
    traverse(a);
    //ispalindrome(a);
   //head =reverse(head);
   // System.out.println(r);
   
   // traverse(head);
  System.out.println(ispalindrome(a));
    //traverse(head);
    
}
}