class subarray{
    static void printsubarray(int []arr){
        int total_subarray=0;
        for(int i=0;i<arr.length+1;i++){
            int start =i;
            
            for(int j=i;j<arr.length+1;j++){
                int end =j;

                for(int k=start;k<end;k++){
                    System.out.print(arr[k] + " ");
                    
                    
                }
                
              System.out.println(" ");
              total_subarray++;
            }
            //System.out.println("totalsubarray is"+ total_subarray);
           // System.out.println(" ");
           System.out.println("totalsubarray is"+ total_subarray);

           
        }
        
    }
    public static void main(String[] args) {
        int arr[] ={2,4,6,8,10};
        printsubarray(arr);
    }
}