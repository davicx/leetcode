class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

    @staticmethod
    def from_list(values):
        if not values:
            return None
        dummy = ListNode(0)  # Dummy node to simplify list creation
        current = dummy
        for value in values:
            current.next = ListNode(value)
            current = current.next
        return dummy.next  # Return the actual head

    @staticmethod
    def print_list(head):
        current = head
        result = []
        while current:
            result.append(str(current.val))
            current = current.next
        print(" -> ".join(result))
