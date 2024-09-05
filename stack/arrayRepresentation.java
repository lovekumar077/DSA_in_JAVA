public class arrayRepresentation{
    static class stack{
        private int arr[] = new int [7];
        private int idx =0;
        void push(int x){
            arr[idx]=x;
            idx++;
        }
        int pop(){
            if(idx==0){
                System.out.println("stack is empty");
                return -1; 
            }
            int top = arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
         void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.println(arr[i]+ " ");
            }
            System.out.println();
        }
        int peek(){
            if(idx==0){
                
                System.out.println("stack is empty");
                return-1;
            }
            return arr[idx-1];
        }
        Boolean isfull(){
            if(arr[idx]==arr.length){
                return true;
            }
            else 
            return false;
        }
        Boolean isempty(){
            if(idx==0) return true;
            else return false;
        }
        int size(){
            return idx;
        }
        int capacity(){
            return arr.length;
        }

    }
    public static void main(String[] args) {
        stack st =new stack();
        st.push(2);
        st.push(4);
        st.push( 6);
        st.push(8);
        st.display();
        st.pop();
        st.display();
       System.out.println( st.size());
        System.out.println(st.capacity());
        System.out.println(st.isfull());
        System.out.println(st.isempty());
    }
}