import java.util.Scanner;

public class matrixAddition{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no. of rows and coloum");
        int n= sc.nextInt();
        int m= sc.nextInt();
        int a[][]=new int [n][m];
        int b[][]=new int [n][m];

System.out.println("enter elements of a");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("eneter elements of b");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                b[i][j]= sc.nextInt();
            }
        }
System.out.println("elements of a ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("elemnts of b");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        int c[][]=new int[n][m];

        //addition
        if(a.length==b.length && a[0].length == b[0].length){
       
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               c[i][j]=a[i][j]+b[i][j];
            }
        }
    }
    else{
        System.out.println("a and b lenght are not same");
    }
        System.out.println("after addition");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}