public class largest{
    public static int largestnumber(int num[]){
        int largest =Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
            
        }
       return largest;
       
    }
    public static void main(String[] args) {
        int num[]={2,3,4,5,4,6};
        int large=largestnumber(num);
        System.out.println(large);
        
    }
}