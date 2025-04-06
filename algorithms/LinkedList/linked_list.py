# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

#head = [1,1,2]

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class LinkedList:
    def __init__(self):
        self.head = None

    def add(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            return
        last = self.head
        while last.next:
            last = last.next
        last.next = new_node

    def traverse(self):
        current = self.head
        while current:
            print(current.data)
            current = current.next

    # Build a linked list from a Python list
    @staticmethod
    def from_list(values):
        linked_list = LinkedList()
        for value in values:
            linked_list.add(value)
        return linked_list.head

    # Display the linked list
    @staticmethod
    def print_list(head):
        current = head
        result = []
        while current:
            result.append(str(current.val))
            current = current.next
        print(" -> ".join(result))



