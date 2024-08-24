class Solution(object):
    def maximumWealth(self, accounts):
        """
        :type accounts: List[List[int]]
        :rtype: int
        """
        Max = sum(accounts[0])
        for i in range(len(accounts)) : 
            if (sum(accounts[i]) > Max ) : Max = sum(accounts[i])
        return Max