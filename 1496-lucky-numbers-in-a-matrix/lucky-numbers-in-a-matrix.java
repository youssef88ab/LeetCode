class Solution 
{

    static int findmin( int i , int[][] matrix)
    {
        int min = matrix[i][0] ;
        for (int k = 0 ; k < matrix[i].length  ; k++ )
        {
            if (matrix[i][k] <= min) {min = matrix[i][k];}
        }
        return min;
    }

    static int findmax( int j , int[][]matrix)
    {
        int max = matrix[0][j] ;
        for (int k = 0 ; k < matrix.length  ; k++ )
        {
            if (matrix[k][j] > max ) {max = matrix[k][j];}
        }
        return max;
    }

    static boolean islucky(int number , int i , int j  , int[][]matrix)
    {
        if ((findmin(i,matrix) == number) && (findmax(j,matrix) == number)) return true;
        else {return false;}
    }
 
    

    public List<Integer> luckyNumbers(int[][] matrix) 
    {
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < matrix.length ; i++)
        {
            for (int j = 0 ; j < matrix[i].length ; j++)
            {
                if ( islucky(matrix[i][j], i , j , matrix)) 
                {    
                            list.add(matrix[i][j]);
                            return list;
                }
            }
        }
        return list;

    }
}