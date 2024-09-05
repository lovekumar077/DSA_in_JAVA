public class searchingInSortedArray {
    public static boolean stairCaseTopRight(int matrix[][],int key){
        int row=0;
        int col= matrix[0].length-1;
        //(0,m-1)

        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("element found at  {"+row +" ," + col+"}");
                return true;
            }
            else if(key<matrix[row][col]){
                                //(0,m-1)
                    col--;   //left
            }
            else{
                row++;  //bottom
            }
        }
        System.out.println("element not found");
        return false;

    }  


    public static boolean stairCaseBottomLeft(int matrix[][],int key){
        int row=0;
        int col= matrix[0].length-1;
        //(n-1,0)

        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("element found at  {"+row +" ," + col+"}");
                return true;
            }
            else if(key<matrix[row][col]){
                                //(n-1,0)
                    row--;   //top
            }
            else{
                col++;  //right
            }
        }
        System.out.println("element not found");
        return false;

    }  
    
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};    

System.out.println(stairCaseTopRight(matrix, 10));
System.out.println(stairCaseBottomLeft(matrix, 3));
}
}
