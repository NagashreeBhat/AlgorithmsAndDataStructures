//Given a sorted linked list, delete all duplicates such that each element appear only once.


public class RemoveDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode present = head;
        while (present != null && present.next != null) {
            if (present.next.val == present.val) {
                present.next = present.next.next;
            } else {
                present = present.next;
            }
        }
        return head;
    }
}
