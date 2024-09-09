# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        
        if (head is None or head.next is None) : 
            return head

        ptr = head 
        while (ptr.next != None) :
            if (ptr.val == ptr.next.val):
                ptr.next = ptr.next.next
            else : 
                ptr = ptr.next

        return head 