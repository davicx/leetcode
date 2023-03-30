# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Node:
    def __init__(self, val=None, next=None):
        self.val = val
        self.next = next


#Notes
node3 = Node(val="b", next= None)
node2 = Node(val="a", next= node3)
head = Node(val="a", next= node2)

itr = head

while itr:
    print(itr.val)
    itr = itr.next

print(" ")

def deleteDuplicates(head):
    cur = head
    
    while cur: 
        #delete operation 
        while cur.next and cur.next.val == cur.val:
            cur.next = cur.next.next
        cur = cur.next 

        return head


newHead = deleteDuplicates(head)
itr = newHead

while itr:
    print(itr.val)
    itr = itr.next

'''
node5 = Node(val="d", next=None)
node4 = Node(val="c", next=node5)
node3 = Node(val="b", next= node4)
node2 = Node(val="b", next= node3)
node1 = Node(val="a", next= node2)

itr = node1
 
while itr: 
    if itr.next != None:
        current = itr.val
        next = itr.next.val
    else: 
        current = itr.val
        next = None

    print("Current ", current, ": Next ", next)
    print()

'''


'''
while node1.next:
    print(node1.val)
    node1 = node1.next

    if node1.next == None:
        print(node1.val)
'''

  
    

#With Iterator 


'''
    if count == remove_index - 1:
        itr.next = itr.next.next
        break

    itr = itr.next
    count+=1
'''




