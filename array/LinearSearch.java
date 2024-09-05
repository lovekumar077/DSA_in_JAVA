public class LinearSearch {
    public static void linearsearch(int n1[],int value){
        for(int i=0;i<n1.length;i++){
            if(n1[i]==value){
                System.out.println("eleement found at index"+ i);
            }
        }
    
           
        
    }
    public static void main(String[] args) {
        int n1[]={22,4,55,6,56,78,44,76,87,56,453,42,4,6,5,335,55,6,88,11};
        linearsearch(n1,335);

    }
    
}
