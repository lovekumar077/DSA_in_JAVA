 class LinkedList {
    Node head;
   

    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next =null;
        }
    }
    
    public void display(){
        Node current = head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }

    }
    void insertoinatbeginning(int newData){
        Node toAdd =new Node(newData);
        toAdd.next =head;
        head = toAdd;

    }
    void insertionAfter(int newData,int index){
        Node toAdd = new Node(newData);
        Node prev=head;

        for(int i=0;i<index-1;i++){
            prev=prev.next;
        }
        toAdd.next=prev.next;
        prev.next=toAdd;

    }
   public void insertionEnd(int newData){
        Node toAdd =new Node(newData);
        if(head == null){
            head = new Node(newData);
            return;

        }

        toAdd.next=null;
        Node temp =head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next =toAdd;
        return;

    }
    void deletion(int index){
        if(index==0){
            head =head.next;
            return;
        }
        Node prev = head;
        for(int i=0;i<index-1;i++){
            prev =prev.next;
        }
        prev.next=prev.next.next;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.insertionEnd(4);
        list.insertionEnd(5);
        list.insertionEnd(6);

        list.display();

       // list.insertionEnd(8);
        
       list.insertoinatbeginning(1);
       list.display();

       System.out.println(" \n");

       list.insertionAfter(55, 2);
       list.insertionAfter(23, 3);
       list.display();
       System.out.println(" ");

       
    }



    
}
