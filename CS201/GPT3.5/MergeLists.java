/*
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

Each ListNode parameters will contain the same number of nodes, between 1 and 30.
*/

public class MergeLists {
    public ListNode weave(ListNode a, ListNode b) {
        if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        }

        ListNode result = new ListNode(a.info); // Initialize the result with the first node from list a
        ListNode current = result; // Current node in the result list
        ListNode currentA = a.next; // Current node in list a
        ListNode currentB = b; // Current node in list b

        // Alternate between lists a and b while weaving them together
        while (currentA != null || currentB != null) {
            if (currentA != null) {
                current.next = new ListNode(currentA.info); // Add a node from list a to the result
                current = current.next;
                currentA = currentA.next;
            }

            if (currentB != null) {
                current.next = new ListNode(currentB.info); // Add a node from list b to the result
                current = current.next;
                currentB = currentB.next;
            }
        }

        return result;
    }
}


