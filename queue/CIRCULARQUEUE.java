public class CIRCULARQUEUE {
    static class QueueA{
       static int arr[];
       static int size;
       static int rear;
       static int front;

       QueueA(int n){

            //n=size
            arr =new int[n];
            size=n;
            rear=-1;
            front=-1;
        }

        public  static boolean isEmpty(){
            return rear ==-1 && front==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }


        //add enqueue
        public static void add(int data){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }

            //if first element is added
            else if(front == -1 && rear==-1){
                front =front+1;
                rear =rear+1;
                arr[rear]=data;
            }
            else{
            rear=(rear+1)%size;
            arr[rear]=data;
            }

        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            int result =arr[front];

            //last element delete
            if (rear ==front){
                rear=front= -1;
            } 
            else{
                front =(front+1)%size;
            }
            return result;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            return arr[front];
            
        }
    }
    public static void main(String[] args) {
         QueueA q1 =new QueueA(3);
         q1.add(1);
         q1.add(2);
         q1.add(3); 

         System.out.println(q1.remove());

         q1.add(4);

         System.out.println(q1.remove() );
         q1.add(5);

         while (! q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
           
            
         }
    }
}