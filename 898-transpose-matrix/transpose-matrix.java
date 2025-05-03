class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] solution = new int[cols][rows];
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution[i].length; j++) {
                solution[i][j] = matrix[j][i];
            }
        }
        return solution;

    }
}