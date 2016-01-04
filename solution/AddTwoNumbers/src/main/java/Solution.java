/**
 * Created by yes on 4/1/16.
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode head = null;
        ListNode act = null;
        int num = (l1.val + l2.val) / 10;
        head = new ListNode((l1.val + l2.val) % 10);
        act = head;
        l1 = l1.next;
        l2 = l2.next;
        while (l1 != null && l2 != null) {
            int cur = (l1.val + l2.val + num) % 10;
            num = (l1.val + l2.val + num) / 10;
            act.next = new ListNode(cur);
            l1 = l1.next;
            l2 = l2.next;
            act = act.next;
        }
        while (l1 != null) {
            int cur = (l1.val + num) % 10;
            num = (l1.val + num) / 10;
            act.next = new ListNode(cur);
            l1 = l1.next;
            act = act.next;
        }
        while (l2 != null) {
            int cur = (l2.val + num) % 10;
            num = (l2.val + num) / 10;
            act.next = new ListNode(cur);
            l2 = l2.next;
            act = act.next;
        }
        if (num > 0) {
            act.next = new ListNode(num);
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Solution solution = new Solution();
        ListNode l = solution.addTwoNumbers(l1, l2);

        while (l != null) {
            System.out.println(l.val);
            l = l.next;
        }
    }
}
