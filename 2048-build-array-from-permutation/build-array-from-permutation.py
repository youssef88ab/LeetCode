class Solution(object):
    def buildArray(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        rlist = list()
        for i in range(len(nums)) :
            rlist.append(nums[nums[i]])
        return rlist 
        