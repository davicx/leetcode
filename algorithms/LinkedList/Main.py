from operator import le
from re import M
from linked_list import ListNode, LinkedList 


def main():
    print("Run main")
    example()
    print("Stop main")

def example():
    ll = LinkedList()
    ll.add(1)
    ll.add(2)
    ll.add(3)

    current = ll.head

    while current is not None:
        print(current.data)
        current = current.next
    
    


'''
def deleteDuplicates(self, head: ListNode) -> ListNode:
    current = head
    while current and current.next:
        if current.val == current.next.val:
            current.next = current.next.next  
        else:
            current = current.next
    return head

# Example usage
if __name__ == "__main__":
    linked_list = LinkedList.from_list([1, 1, 2])
    solution = Solution()
    result = solution.deleteDuplicates(linked_list)

    LinkedList.print_list(result)
'''

if __name__ == "__main__":
    main()




