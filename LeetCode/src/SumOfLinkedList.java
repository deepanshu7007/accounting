public class SumOfLinkedList {
    static ListNode sumOfBothTheList(ListNode l1, ListNode l2) {
        double sumOfL1 = 0, MultipleOf10 = 1;
        double sumOfL2 = 0;
        while (l1 != null) {
            sumOfL1 = sumOfL1 + l1.data * MultipleOf10;
            MultipleOf10 *= 10;
            l1 = l1.link;
        }
        System.out.println(sumOfL1);
        MultipleOf10 = 1;
        while (l2 != null) {
            sumOfL2 = sumOfL2 + l2.data * MultipleOf10;
            MultipleOf10 *= 10;
            l2 = l2.link;
        }
        System.out.println(sumOfL2);
        double totalSum = sumOfL1 + sumOfL2;
        double temp = totalSum,rem=0;
        ListNode head=null;
        ListNode prev=null;

        while (temp != 0) {
            rem = temp % 10;
            temp = temp / 10;
            ListNode newNode = new ListNode((int)rem,null);
            if(head == null)
            {
                head = newNode;
                prev = newNode;
            }
            else{
                prev.link = newNode;
                prev=newNode;
            }
        }
        return head;
    }

    static void displayList(ListNode l1) {
        System.out.print("head->");
        while(l1!=null)
        {
            System.out.print(l1.data+"->");
            l1 = l1.link;

        }
        System.out.print("tail");
    }

    public static void main(String[] args) {
        // from here list 1
        ListNode l6 = new ListNode(2, null);
        ListNode l5 = new ListNode(4, l6);
        ListNode l4 = new ListNode(3, l5);
        
        ListNode head1 = l4;
        // from here list 2
        ListNode l3 = new ListNode(5, null);
        ListNode l2 = new ListNode(6, l3);
        ListNode l1 = new ListNode(4, l2);
        ListNode head2 = l1;
        displayList(sumOfBothTheList(head1, head2));
    }
}
