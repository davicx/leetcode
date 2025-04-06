from typing import Optional
from LinkedList.leetcode_linked_list import ListNode


class Solution:
    def printList(self, head: Optional[ListNode]):
        current = head

        while current:
            #print(current.val, end=" ")
            print(current.val)  # Print each value
            current = current.next



    def countSize(self, head: Optional[ListNode]): 
        current = head
        count = 0

        while current:
            count = count + 1
            current = current.next
        
        return count


    def removeSecondItem(self, head: Optional[ListNode]):
        
        # Check if the list has fewer than 2 nodes
        if not head or not head.next:
            return head
        
        # Remove the second item
        head.next = head.next.next
        return head


    def deleteNode(self, head: Optional[ListNode], value: int) -> Optional[ListNode]:
        # If the head is the node to delete
        if head and head.val == value:
            return head.next
        
        current = head
        
        while current and current.next:
            if current.next.val == value:
                current.next = current.next.next
                return head
            current = current.next
        
        return head

    def addDummyNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # Create a dummy node with a default value (e.g., 0)
        dummy = ListNode(0)
        
        # Point the dummy node to the current head
        dummy.next = head
        
        return dummy




# Example usage:
#head = ListNode.from_list([1, 1, 2]) 
#solution = Solution()
#solution.deleteDuplicates(head)

# Example usage:
head = ListNode.from_list([1, 1, 2]) 
solution = Solution()
count = solution.printList(head)
count = solution.removeSecondItem(head)
print(" ")
count = solution.printList(head)
print(count)


# Example usage
'''
head = ListNode(1)
head.next = ListNode(2)
head.next.next = ListNode(3)
head.next.next.next = ListNode(4)

solution = Solution()
print("Original List:")
solution.printList(head)

# Delete value 3
head = solution.deleteNode(head, 3)
print("After Deleting 3:")
solution.printList(head)

'''






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