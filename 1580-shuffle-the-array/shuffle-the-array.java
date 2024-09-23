class Solution {
    public int[] shuffle(int[] nums, int n) {


        int[] ans = new int[nums.length];
        for (int i = 0 , j = 0 ; i < ans.length ; i+=2 , j++) {
            ans[i] = nums[j];   
        }

        for (int i = 1 , j = n ; i < ans.length ; i+=2 , j++) {
            ans[i] = nums[j];
        }

        return ans ;
        
    }
}