import math

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
'''
list6 = ListNode("6", None)
list5 = ListNode("5", list6)
list4 = ListNode("4", list5)
list3 = ListNode("3", list4)
list2 = ListNode("2", list3)
head = ListNode("1", list2)        
'''
 
list5 = ListNode("5", None)
list4 = ListNode("4", list5)
list3 = ListNode("3", list4)
list2 = ListNode("2", list3)
head = ListNode("1", list2)        

def print_list(head):
    while head:
        print(head.val)
        if head.next == None:
            print("last element", head.val)
            break
        head = head.next

def get_length(head):
    count = 0
    while head:
        if head.next == None:
            break
        count = count + 1
        head = head.next
    return count + 1

def middleNode(head, length):
    middle = math.floor(length / 2)
    count = 0

    while head:
        if middle == count:
            return head   
        middle = middle - 1
        head = head.next

 
length = get_length(head)
answer = middleNode(head, length)
print_list(answer)
 