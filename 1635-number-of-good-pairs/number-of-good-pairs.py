class Solution(object):
    def numIdenticalPairs(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        res = 0
        for i in range(len(nums)) : 
            for j in range(len(nums)) : 
                if (nums[i] == nums[j] and i < j ) : res += 1
        return res
        