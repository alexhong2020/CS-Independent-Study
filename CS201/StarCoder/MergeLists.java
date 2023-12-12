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

import java.util.*;

public class MergeLists {
    public ListNode weave (ListNode a, ListNode b) {
        // Your code here
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while (a!= null && b!= null) {
            temp.next = a;
            temp = temp.next;
            temp.next = b;
            temp = temp.next;
            a = a.next;
            b = b.next;
        }
        if (a!= null) {
            temp.next = a;
        }
        if (b!= null) {
            temp.next = b;
        }
        return head.next;
    }
}

