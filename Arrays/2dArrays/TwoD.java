
public class TwoD {
    public static int x(int[] arr){
        int count=0;
        int max_count=0;
       for(int i=0 ; i<arr.length ; i++){
           if (arr[i]==arr[i++] && arr[i]==1) {
            count++;
            max_count=Math.max(count,max_count);
           }
           else{
            count=0;
           }
       }
       return max_count;
    }
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 },
                           { 4, 6, 7, 8 },
                          { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 } };
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;
       while (startCol<=endCol && startRow <=endRow) {
        //top
           for (int i = startCol; i <= endCol; i++) {
               System.out.print(matrix[startRow][i]+" ");
           }
        //rigth down
           for (int i = startRow+1; i <= endRow; i++) {
            System.out.print(matrix[i][endCol]+" ");
           }
            // 3. Bottom row
            if (startRow < endRow) {
                for (int i = endCol - 1; i >= startCol; i--) {
                    System.out.print(matrix[endRow][i] + " ");
                }
            }

            // 4. Left column
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
            }


          startRow++;
          startCol++;
          endCol--;
          endRow--;
       }
    }
}
