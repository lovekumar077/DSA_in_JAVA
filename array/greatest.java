public class greatest {
    public static int largestnum(int num[]){
        int max= Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int a[]={2,34,54,67,45,67,87,45,78};
        int great= largestnum(a);
        System.out.println("the greatnumber is"+great);
    }
}
