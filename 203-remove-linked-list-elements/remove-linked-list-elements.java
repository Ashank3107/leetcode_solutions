class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node before head to handle cases where head needs removal
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next; // Remove the node
            } else {
                current = current.next;
            }
        }

        return dummy.next; // Return the new head
    }
}
