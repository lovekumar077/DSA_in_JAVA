package operation;

public class binarySearch {
    public static int binarysearching(int num[],int key){
        int start=0, end=num.length-1;

        while(start<=end){
            int mid= (start + end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,7,8,9};
        int large=binarysearching(arr,7 );
        System.out.println(large);
    }
    
}
