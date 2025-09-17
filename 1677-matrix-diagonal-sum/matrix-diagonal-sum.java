class Solution {
    public int diagonalSum(int[][] mat) {

      
          int sum = 0 ;
        int rows = mat.length ;
        int cols = mat[0].length ;
        int limit = Math.min(rows, cols);
        for (int i = 0 ; i < limit ; i++)
        {
            int col = cols - 1 - i ;
            sum += mat[i][col];
            sum += mat[i][i] ;
        }

        // If n is odd, subtract the middle element once
        if (rows % 2 == 1) {
            sum -= mat[rows / 2][rows / 2];
        }

        return sum ;

    }
}