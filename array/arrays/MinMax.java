 import java.util.Scanner;
 class MinMaxDifference{
    public int Maxvalue(int arr[]){
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    public int Minvalue(int arr[]){
        int min =Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
     public  void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
public class MinMax{
    public static void main(String[] args) {
        MinMaxDifference m1=new MinMaxDifference();
        int arr[]={2,3,4,5,7,6,5,8,9,2,5,7,8};
        m1.display(arr);
        System.out.println(" ");

        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements in array");
        n=sc.nextInt();

        int num[]=new int[n];
        for(int i=0;i<num.length;i++){
            System.out.print("Enter ["+(i+1)+"] element :" );
            num[i]=sc.nextInt();
        }
        m1.display(num);
        int max=m1.Maxvalue(num);
        int min=m1.Minvalue(num);
      
        System.out.println("the maximum value is"+max + "\n"+ "the minimum value is"+min);
        int difference= m1.Maxvalue(num)-m1.Minvalue(num);
        System.out.println("differnce is"+ difference);


    }
}