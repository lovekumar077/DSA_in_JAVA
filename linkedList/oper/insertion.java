package oper;

public class insertion {
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

    public static void main(String[] args) {
        insert(25, head,2);
    }
    
}
