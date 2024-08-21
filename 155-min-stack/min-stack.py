class MinStack(object):

    def __init__(self):
        self.stack = []

    def push(self, val):
        """
        :type val: int
        :rtype: None
        """
        self.stack.append(val)
        

    def pop(self):
        """
        :rtype: None
        """
        if not self.is_empty():
            return self.stack.pop()

    def top(self):
        """
        :rtype: int
        """
        if not self.is_empty():
            return self.stack[-1]
        

    def getMin(self):
        """
        :rtype: int
        """
        return min(self.stack)

    def is_empty(self):
        return len(self.stack) == 0
        
    def size(self):
        return len(self.stack)  


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()