class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;

        // If reshape not possible, return original
        if ((rows * cols) != r * c) {
            return mat; 
        }

        // Flatten into 1D
        int[] flat = new int[rows * cols];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flat[k++] = mat[i][j];
            }
        }

        // Build reshaped matrix
        int[][] matrix = new int[r][c];
        k = 0; 
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = flat[k++];
            }
        }

        return matrix; 
    }
}
