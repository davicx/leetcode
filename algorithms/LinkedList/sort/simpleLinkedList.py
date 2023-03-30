#TYPE 1: This is Leetcode Style 
from multiprocessing.dummy import current_process


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

root = node1 

def print_list(root):
    current_node = root
    while True:
        print(current_node.data)
        if current_node.nextNode is None:
            print("your done")
            break
        current_node = current_node.nextNode

#print_list(root)

def insert_at_position(root, value):
    current_node = root
    found = False

    while True:
        print(current_node.data)
        if current_node.data == value:
            print("found ", current_node.data, value)
            found = True

        if current_node.nextNode is None:
            print("your done")
            if found == False:
                print("No Findy ", value)
            else:
                print("found", value)
            break

        current_node = current_node.nextNode



insert_at_position(root, "10")       

"""
    current_node = root
    while True:
        if current_node.nextNode is None:
            print("your done")
            break
        current_node = current_node.nextNode   

    def insert_at(self, index, data):
        if index<0 or index>self.get_length():
            raise Exception("Invalid Index")

        if index==0:
            self.insert_at_begining(data)
            return
        count = 0
        itr = self.head
        while itr:
            if count == index - 1:
                node = Node(data, itr.next)
                itr.next = node
                break

            itr = itr.next
            count += 1
"""    

    
