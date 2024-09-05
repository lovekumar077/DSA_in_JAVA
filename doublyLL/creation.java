public class creation{
    Node head;

    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
   
    public void insertionAtEnd(int newData){
        Node toAdd = new Node(newData);

        if(head == null){
            head=new Node(newData);
            return;
        }
        toAdd.next =null;
        Node temp = head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=toAdd;
       Node tail = temp.prev;
       while(tail!=null){
        tail=tail.prev;

       }
       toAdd.prev=temp;
        temp.prev=null;
        head.prev=null;

    }
    public void reverse(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.prev;
        }
    }

    public static void main(String[] args) {
        creation list = new creation();
        list.insertionAtEnd(2);
        list.insertionAtEnd(4);
        list.insertionAtEnd(6);
        list.display();
      //  list.reverse();
       

        
    }
}