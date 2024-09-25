class Solution {
    public int findNumbers(int[] nums) {
        int Ans = 0 ;
        for (int i = 0 ; i < nums.length ; i++) {
            if ( (findDigits(nums[i]) % 2) == 0 ) { Ans++; }
        }
        return Ans;
    }

    public int findDigits(int num) {
        int Digits = 0 ;
        while (num > 0) {
            Digits++;
            num /= 10 ; 
        }
        return Digits;
    }
}