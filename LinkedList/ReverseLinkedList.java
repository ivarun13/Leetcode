package LinkedList;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by varun on 12/14/16.
 */
public class ReverseLinkedList {

    public void Reverse(ListNode head){

        ListNode newNode = null;

        while(head != null)
        {
            ListNode next = head.next;
            head.next = newNode;
            newNode = head;
            head = next;
        }
        System.out.println(newNode.val);
    }

    public static void main(String[] args) {
        List<ListNode> list = new LinkedList<>();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.setNext(l2);
        l2.setNext(l3);
        l3.setNext(l4);
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        ReverseLinkedList r = new ReverseLinkedList();
        r.Reverse(l1);
    }
}
