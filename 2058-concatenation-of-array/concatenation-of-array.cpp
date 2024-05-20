class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        vector<int> Result;
        for(int i = 0 ; i <=nums.size() -1 ; i++)
        {
            Result.push_back(nums[i]);
        }
         for(int i = 0 ; i <=nums.size() -1 ; i++)
        {
            Result.push_back(nums[i]);
        }
        return Result;
        
    }
};