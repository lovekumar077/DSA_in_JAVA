 class Node{
    int data;
    Node next;
    Node(int data){
        this.data =data;

    }
}

public class creation{

   static void traverse(Node head){
        Node current = head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }

    }
   // public  static void insertionAtBeginning(int newData){
       // Node toAdd =new Node(newData);

     //   toAdd.next=head;
      //  head=toAdd;
        

  // }

  static void insertionAfter(Node prev,int index,int newData){
    Node toAdd = new Node(newData);
    if(index==0){
        toAdd.next=prev;
        prev=toAdd;
        return;
    }
    if(prev.next==null){
        System.out.println("value cannot be null");
        return;
    }
    toAdd.next=prev.next;
    prev.next=toAdd;
    
  }
    public static void main(String[] args) {
        Node N1 = new Node(2);
        Node N2= new Node(4);
        Node N3 = new Node(8);
        Node N4 = new Node(10);

        Node head =N1;
        head.next = N2;
        N2.next = N3;
        N3.next =N4;
        N4.next =null;
        traverse(head);
        insertionAfter(N2,2, 6);
        System.out.println("after inserton");
        traverse(head);
        N1.traverse();




    }

}