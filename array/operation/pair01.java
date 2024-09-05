public class pair01 {
    static void printpair(int num[]){
        int totalpair=0;
        for(int i=0;i<num.length;i++){
            int current=num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("(" +current +" ,"+num[j]+")");
                totalpair++;
            }
            System.out.println();
        }
        System.out.println("totalpairs are "+totalpair);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,9};
        printpair(num);
    }
}
