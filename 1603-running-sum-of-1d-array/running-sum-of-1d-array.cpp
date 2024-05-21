class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
     int Prev = nums[0];
     for (int i = 1 ; i < nums.size()  ; i++)
     {
        Prev+=nums[i];
        nums[i] = Prev;
     } 
     return nums; 
    }
};