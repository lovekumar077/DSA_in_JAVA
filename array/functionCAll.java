public class functionCAll {
    public static void update(int num[],int value){
        for(int i=0;i<num.length;i++){
            num[i]=num[i]+value;
            System.out.println(num[i]);
        }
    }

    public static void main(String[] args) {
        int num[]= {1,2,3,4,5,6,7,8};
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
        update(num,10);
        
    }
    
}
