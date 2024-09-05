
public class queue{
   
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
            return rear ==-1 ;
        }

        public static boolean isFull(){
            System.out.println("queue is full");
            return size-1==rear;
        }

        //add enqueue

        public static void add(int data){
            if(rear == size-1){
                System.out.println("queue is full");
                return;
            }
            else if(front == -1 && rear==-1){
                front =front+1;
                rear =rear+1;
                arr[rear]=data;
            }
            else{
            rear=rear+1;
            arr[rear]=data;
            }

        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            front =arr[0];

            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
                //ek ek aage badane k liye
            } 
            rear =rear-1;

            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            return arr[0];
            
        }
    }
    public static void main(String[] args) {
         QueueA q1 =new QueueA(5);
         q1.add(1);
         q1.add(2);
         q1.add(3); 
         q1.add(4);
         q1.add(6);

         System.out.println(q1.isFull());
         q1.add(7);
        

         while (!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
           
            
         }
    }
}


