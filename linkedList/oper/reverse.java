class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class reverse {
    public static void traverse(Node head){
        Node current = head;
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    public static void insert(int data,Node head,int index){
        Node toAdd = new Node(data);
        if(index==0){
            toAdd.next=head;
            head = toAdd;
            return;
        }

        Node prev = head;
        for(int i=0;i<=index-1;i++){
            prev =prev.next;
        }

        toAdd.next = prev.next;
        prev.next = toAdd;
    }
     static void delete(int index){
        if(index==0){
            head=head.next;
            return;
        }
        Node prev =head;
        for(int i=0;i<index-1;i++){
            prev=prev.next;
        }
        prev.next=prev.next.next;
    }
    public static void Reverse(Node head){
        Node curr =head;
        Node nextptr ;
        Node prev = null;

        while(curr!=null){
            nextptr = curr.next;
            curr.next = prev;

            prev = curr;
            curr= nextptr;
        }
        System.out.println(prev);


    }
    public static void main(String [] args){
    Node n1 = new Node(10);
    Node n2 = new Node(20);
    Node n3 = new Node(30);
    Node n4 = new Node(40);
    Node n5 = new Node(50);

    Node head =n1;
    head.next=n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = null;

    traverse(head);
    Reverse(head);
    
}
}
