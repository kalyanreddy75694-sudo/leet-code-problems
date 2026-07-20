class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;

        while (node != null && node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next; // skip the duplicate
            } else {
                node = node.next; // move ahead
            }
        }

        return head;
    }
}
