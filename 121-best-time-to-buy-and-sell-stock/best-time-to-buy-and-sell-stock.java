class Solution {
    public int maxProfit(int[] prices) {
        // Var 
        int min = prices[0] ; 
        int max = 0 ; 


        // Iterate Through Loop 
        for (int i = 1 ; i < prices.length ; i++)
        {
            if (prices[i] < min) min = prices[i] ; 
            if ((prices[i] - min) > max ) max = prices[i] - min ;
        }

        return max ; 
    }
}