public class Reverse01 {
    public static void reverse(int num[],int n){
        int first=0 ;int last=num.length;

        for(int i=0;i<n/2;i++){
            int t=num[i];
            num[i]=num[n-i-1];
            num[n-i-1]=t;

        }
        // for(int j=0;j<num.length;j++){
        //     System.out.print(num[j]+ "  ");
        // }
    }
    static void display(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+ "  ");
        }
    }
    public static void main(String[] args) {
        int num[]={3,4,5,6};
        display(num);
        System.out.println(" ");
        reverse(num,num.length);
        display(num );
       

    }
}

