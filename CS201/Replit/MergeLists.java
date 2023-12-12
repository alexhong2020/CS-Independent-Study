public ListNode weave(ListNode a, ListNode b) {
    ListNode result = new ListNode(a.info);
    ListNode curr = result;
    a = a.next;
    while (a != null && b != null) {
        curr.next = new ListNode(b.info);
        b = b.next;
        curr = curr.next;
        curr.next = new ListNode(a.info);
        a = a.next;
        curr = curr.next;
    }
    if (b != null) {
        curr.next = b;
    }
    return result;
}