public class spiralMatrix {

    public static void printSpiral(int matrix[][]){
        int startRow=0;
        int startCol= 0;
        int endRow=matrix.length-1;
        int endCol=matrix.length-1;
        
        while (startRow<=endRow && startCol<=endCol) {
            //top elements
            for(int i=startCol;i<=endCol;i++){
                System.out.println(matrix[startRow][i]);
            }
            
            //right
            for(int j=startRow+1;j<=endRow;j++){
                System.out.println(matrix[j][endCol]);
            }

            //botttom
            for(int i=endCol-1;i>=startCol;i--){

                if(startRow==endRow){
                    break;
                }
                System.out.println(matrix[endRow][i]);

            }

            //left
            for(int j=endRow-1;j>=startRow+1;j--){

                if(startCol==endCol){
                    break;
                }
                System.out.println(matrix[j][startCol]);
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        printSpiral(matrix);
      
    }
    
}
