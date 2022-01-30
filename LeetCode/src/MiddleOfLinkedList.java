class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1() {
    }

    ListNode1(int val) {
        this.val = val;
    }

    ListNode1(int val, ListNode1 next) {
        this.val = val;
        this.next = next;
    }
}

class LinkedList {
}

public class MiddleOfLinkedList {
    public static void main(String[] arhs) {
        ListNode1 head = new ListNode1();
        ListNode1 l4 = new ListNode1(5, null);
        ListNode1 l3 = new ListNode1(4, l4);
        ListNode1 l2 = new ListNode1(3, l3);
        ListNode1 l1 = new ListNode1(2, l2);
        ListNode1 l0 = new ListNode1(1, l1);
        head = l0;
        
        System.out.println("Head->");
        while (head != null) {
            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.println("Tail");
    }
}
