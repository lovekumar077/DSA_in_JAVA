class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
    }
}
public class removeNtjNode {
    public static void traverse(Node head)
    {
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static Node removeNthFromEnd(Node head,int n){
        if(head ==null || n==0){
            return head;
            

        }
        Node curr =head;
        int count =0;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        if(count==n){
            Node temp=head;
            head=head.next;
        }
        curr = head;
        for(int i=0;i<count-n-1;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node a= new Node(1);
        Node b = new Node(2);
        Node c= new Node(3);
        Node d =new Node(3);
        Node e =new Node(2);
        Node f = new Node(1);
    
         Node head  = a;
        head.next=b;
        b.next = c;
        c.next =d;
        d.next=e;
        e.next = f;
        f.next=null;
        traverse(a);
        Node p= removeNthFromEnd(a, 3);
        System.out.println(p);
    
}
}
