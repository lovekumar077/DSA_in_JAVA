public class DiagonalSumOn{

    public static int DiagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++)
        {
            //primary
            sum+=matrix[i][i];

            //secondry i + j = matrix.length-1   ==> j = matrix.length-1 -i

            if(i!=matrix.length-1-i){
            sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{5,6,7},{9,10,11}};    

        int result=DiagonalSum(matrix);
        System.out.println(result);
}
    
}
