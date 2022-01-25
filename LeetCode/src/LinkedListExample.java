
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author deepanshu
 */
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
        ListNode lastNode = new ListNode();
        ListNode tempNode = new ListNode();
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
    }
}
