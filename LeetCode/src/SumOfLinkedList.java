public class SumOfLinkedList {
    static ListNode sumOfBothTheList(ListNode l1, ListNode l2) {
        int sumOfL1 = 0, MultipleOf10 = 1;

        int sumOfL2 = 0;

        while (l1 != null) {
            sumOfL1 = sumOfL1 + l1.data * MultipleOf10;
            MultipleOf10 *= 10;
            l1 = l1.link;
        }

        while (l2 != null) {
            sumOfL2 = sumOfL2 + l2.data * MultipleOf10;
            MultipleOf10 *= 10;
            l2 = l2.link;
        }

        return new ListNode();
    }

    static ListNode displayList(ListNode l1) {

        return new ListNode();
    }

    public static void main(String[] args) {
        // from here list 1
        ListNode l6 = new ListNode(2, null);
        ListNode l5 = new ListNode(4, l6);
        ListNode l4 = new ListNode(3, l5);

        ListNode head1 = l4;
        // from here list 2
        ListNode l3 = new ListNode(5, l4);
        ListNode l2 = new ListNode(6, l3);
        ListNode l1 = new ListNode(4, l2);
        ListNode head2 = l1;

    }
}
