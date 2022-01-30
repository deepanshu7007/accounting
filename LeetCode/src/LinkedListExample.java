
import java.util.Scanner;

class ListNode {

    int data;
    ListNode link;

    ListNode() {
    }

    ListNode(int data, ListNode link) {
        this.data = data;
        this.link = link;
    }

    ListNode(int data) {
        this.data = data;
    }
}

public class LinkedListExample {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ListNode headNode = new ListNode();
        ListNode prevNode = new ListNode();
        // ListNode endNode = new ListNode();
        ListNode tempNode = new ListNode(); // Writting just to test git 
        headNode = null;
        
        while (true) {
            System.out.println("Press (-1) to exit:");
            int data = s.nextInt();
            if (data == -1) {
                break;
            } else {
                ListNode ln = new ListNode(data, null);
                if (headNode == null) {
                    headNode = ln;
                    prevNode = ln;
                } else {
                    prevNode.link = ln;
                    prevNode = ln;
                }
            }
        }
        tempNode = headNode;
                   System.out.print("Start->");
        while (tempNode != null) {
           System.out.print(tempNode.data+"->");

           tempNode=tempNode.link;
        }
        System.out.print("End");
        s.close();
    }
}
