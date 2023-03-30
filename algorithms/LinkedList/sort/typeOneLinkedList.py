#TYPE 1: This is Leetcode Style 
class Node:
    def __init__(self, data, nextNode=None):
        self.data = data  
        self.nextNode = nextNode


node1 = Node("3")
node2 = Node("7")
node3 = Node("10")
node4 = Node("77")

node1.nextNode = node2
node2.nextNode = node3
node3.nextNode = node4

currentNode = node1

while True:
    print(currentNode.data)
    if currentNode.nextNode is None:
        print("your done")
        break
    currentNode = currentNode.nextNode
