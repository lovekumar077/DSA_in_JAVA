public class subarray01 {
    static void printsubarray(int num[]){
        for(int i=0;i<num.length;i++){
            int start=i;
            int total_subarray=0;
            for(int j=i;j<num.length;j++){
                int end=j;
                for(int k=start;k<end;k++){
                    System.out.print(num[k] +" " );
                    total_subarray++;
                }
                System.out.println();
            }
         
            System.out.println("total sub array are  "+total_subarray);
        }
    }


    //BRUTTE APPORACH
    static void MaxSubArraySum(int num[]){
        int currSum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            int start =i;
            for(int j=i;j<num.length;j++){
                int end=j;
                currSum=0;
                for( int k=start;k<end;k++){
                    currSum+=num[k];
                }
                System.out.print(currSum+ " ");
                if(maxsum<currSum){
                    maxsum=currSum;
                }
            }
            System.out.println();
        }
        System.out.println("max sum="+maxsum);
    }
    public static void main(String[] args) {
        int num[]=  {2,4,6,8,9,5};
        printsubarray(num);

        MaxSubArraySum(num);
        }
}
