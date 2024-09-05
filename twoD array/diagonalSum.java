
// O(n^2) time complexity  two for loops

public class diagonalSum {
    public static int DiagonalSum(int matrix[][]){
        int sum=0;
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){

                //primary
                if(i==j){
                    sum+=matrix[i][j];
                }

                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
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
