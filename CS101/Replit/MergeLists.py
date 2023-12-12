class ListNode:
    def __init__(self, x, node=None):
        self.info = x
        self.next = node

def weave(a, b):
    result = ListNode(0)
    current = result
    while a is not None and b is not None:
        current.next = ListNode(a.info)
        current = current.next
        current.next = ListNode(b.info)
        current = current.next
        a = a.next
        b = b.next
    if a is not None:
        current.next = a
    if b is not None:
        current.next = b
    return result.next.next