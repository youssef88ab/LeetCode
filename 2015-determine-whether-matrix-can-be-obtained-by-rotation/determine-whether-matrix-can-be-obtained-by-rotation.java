class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int tmp = 0 ; tmp < 4 ; tmp++) 
        { 
            if (isEqual(mat , target)) 
            {
                return true ; 
            }
            mat = rotate90(mat) ; 
        }
        return false ; 
    }

    public int[][] rotate90(int[][] matrix)
    {
        int n = matrix.length ; 
        int[][] rotated = new int[n][n] ; 
            // Rotate Matrix & Check ; 
            for (int i = 0 ; i < n ; i++)
            {
                for (int j = 0 ; j < n ; j++)
                {
                    rotated[i][j] = matrix[j][n - i - 1] ; 
                }
            }
            return rotated ; 
    }

    public boolean isEqual(int[][] mat , int[][] mat2)
    {
        for (int i = 0 ; i < mat.length ; i++)
        {
            for (int j = 0 ; j < mat[0].length ; j++)
            {
                if (mat[i][j] != mat2[i][j]) return false ; 
            }
        }
        return true ; 
    }
}
