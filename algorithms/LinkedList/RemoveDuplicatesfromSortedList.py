from typing import Optional
from LinkedList.leetcode_linked_list import ListNode


class Solution:
    def printList(self, head: Optional[ListNode]):
        current = head
        while current:
            print(current.val)  # Print each value
            current = current.next

    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        current = head
        print(current)
        
        '''
        while current and current.next:
            print(current.next.val)  # Print next node's value
            current = current.next   # Move to the next node
        return head
        '''



'''
if current.val == current.next.val:
        current.next = current.next.next
    else:
        current = current.next
return head
'''    



# Example usage:
head = ListNode.from_list([1, 1, 2])  # ✅ Fix: Use ListNode instead of LinkedList
solution = Solution()
solution.deleteDuplicates(head)









#APPENDIX
'''
LinkedList.print_list(head)

solution = Solution()
new_head = solution.deleteDuplicates(head)

LinkedList.print_list(new_head)

'''
#SOLVED
'''
def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
    current = head
    while current and current.next:
        if current.val == current.next.val:
            current.next = current.next.next
        else:
            current = current.next
    return head

'''

























'''
while current and current.next:
    if current.val == current.next.val:
        current.next = current.next.next
    else:
        current = current.next
return head
'''