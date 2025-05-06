class Solution {
    public int[] sumZero(int n) {

        int[] result = new int[n] ;
        int num = 1; 

        for (int i = 0 ; i < n/2 ; i++) {
            result[i] = -num ;
            result[n - 1 - i] = num ;
            num++;
        }

        if (n%2 != 0) {
            result[n/2] = 0 ;
        }

        return result ;

    }
}