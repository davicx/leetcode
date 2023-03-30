#TYPE 2
"""
class linkedListNode:
	def __init__(self, value, message, nextNode=None):
    	self.value = value  
    	self.message = message
    	self.nextNode = nextNode

class LinkedList:
	def __init__(self, head = None):
    	self.head = head
    
	def insert(self, value, message):
    	insertNode = linkedListNode(value, message)
    	if self.head is None:
        	self.head = insertNode
        	return

    	currentNode = self.head
    	while True:
        	if currentNode.nextNode is None:
            	currentNode.nextNode = insertNode
            	break
        	currentNode = currentNode.nextNode

	def printLinkedList(self):
    	currentNode = self.head

    	if currentNode is not None:
        	#print(currentNode.message)
        	#print(currentNode.value)
        	print("")
    	else:
        	print("")


    	while currentNode is not None:
        	if currentNode.value is not None:
            	#print(currentNode.value)
            	print(currentNode.value)
            	print(currentNode.message)
        	else:
            	print("empty")

        	currentNode = currentNode.nextNode
    	print("all done")

myLinkedList = LinkedList()
myLinkedList.printLinkedList()
myLinkedList.insert("1", "hiya!")
myLinkedList.printLinkedList()

myLinkedList = LinkedList()
myLinkedList.printLinkedList()
myLinkedList.insert("3")
myLinkedList.printLinkedList()
myLinkedList.insert("44")
myLinkedList.printLinkedList()
myLinkedList.insert("55")
myLinkedList.printLinkedList()
myLinkedList.insert("77")
myLinkedList.printLinkedList()


"""



#TYPE 4: LEETCODE
"""
class ListNode:
	def __init__(self, val=0, next=None):
    	self.val = val
    	self.next = next

"""


#APPENDIX
"""
class Node:
	def __init__(self, data, nextNode=None):
    	self.data = data  
    	self.nextNode = nextNode
    
	def get_next (self):
    	return self.nextNode

	def set_next (self, n):
    	self.nextNode = n   

	def get_data (self):
    	return self.data

	def set_data (self, d):
    	self.data = d



class LinkedList:
	def __init__(self, head = None):
    	self.head = head
    

"""
