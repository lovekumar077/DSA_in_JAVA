package operation;

public class largest {
        public static int largestnumber(int num[]){
            int large =Integer.MAX_VALUE;
            for(int i=0;i<num.length;i++){
                if(large<=num[i]){
                    large=num[i];
                }
                
            
           return large;
            }
           return -1;
        }
        public static void main(String[] args) {
            int num[]={2,3,4,5,4,6};
            int large=largestnumber(num);
            System.out.println(large);
            
        }
    }

