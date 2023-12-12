'''
Write method weave that takes two lists with the same number of nodes and weaves them together alternating one node from list a and one node from list b, returning the weaved-together list.
The weaved-list always starts with the first node/value from a, then chooses the next value from list b, and alternates, choosing successive values alternatively from each list. The last value in the returned list will always be the last value from b.

For example, if a = [1,3,5,7] and b = [2,4,6,8], then the call weave(a,b) returns [1,2,3,4,5,6,7,8].

You can create new nodes are weave together existing nodes.

The ListNode class will be accessible when your method is tested.


public class ListNode {
    int info;
    ListNode next;
    ListNode(int x){
        info = x;
    }
    ListNode(int x, ListNode node){
        info = x;
	next = node;
    }
}
'''

def weave(listnode1, listnode2):
    dummy = ListNode(None)
    current = dummy
    is_listnode1 = True

    while listnode1 and listnode2:
        if is_listnode1:
            current.next = listnode1
            listnode1 = listnode1.next
        else:
            current.next = listnode2
            listnode2 = listnode2.next

        current = current.next
        is_listnode1 = not is_listnode1

    # If either listnode1 or listnode2 is longer, attach the remaining nodes
    if listnode1:
        current.next = listnode1
    elif listnode2:
        current.next = listnode2

    return dummy.next

# Helper function to convert a list to a linked list
def list_to_linked_list(lst):
    dummy = ListNode(None)
    current = dummy
    for item in lst:
        current.next = ListNode(item)
        current = current.next
    return dummy.next

# Helper function to convert a linked list to a list
def linked_list_to_list(head):
    result = []
    current = head
    while current:
        result.append(current.info)
        current = current.next
    return result