class Solution(object):
    def addToArrayForm(self, num, k):
        """
        :type num: List[int]
        :type k: int
        :rtype: List[int]
        """
        # Transform Array To number
        sum_val = 0
        for digit in num:
            sum_val = sum_val * 10 + digit
        
        sum_val += k
        
        # If sum is 0, return [0]
        if sum_val == 0:
            return [0]
        
        solution = []
        
        # Convert num to array
        while sum_val > 0:
            solution.append(sum_val % 10)
            sum_val //= 10  # Integer division
        
        # Reverse Array
        solution.reverse()
        
        return solution