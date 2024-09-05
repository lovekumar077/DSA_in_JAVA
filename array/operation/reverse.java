

public class reverse {
    public static void reverseArray(int num[]){
        int first=0, end=num.length-1;
        while(first<end){
            //swap

           int temp =num[first];
           num[first]=num[end];
           num[end]=temp;

    }

    public static void main(String[] args) {
        int arr[]={2,4,6,8,9};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ "  ");
        }
        reverseArray(arr);
      
    }
    
}
