package LinkedList;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by varun on 12/14/16.
 */
public class InsertNode {

    public void Insert(ListNode newNode,ListNode head)
    {
        ListNode temp;

        if(head == null || head.val > newNode.val)
        {
            newNode.next = head;
            head = newNode;
        }
        else
        {
            temp = head;
            while(temp.next != null && temp.next.val < newNode.val)
            {
                temp = temp.next;
            }
           newNode.next = temp.next;
           temp.next = newNode;

        }


    }

    public static void main(String[] args) {
        List<ListNode> list = new LinkedList<>();
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(5);
        ListNode l4 = new ListNode(6);
        ListNode l5 = new ListNode(8);
        l1.setNext(l2);
        l2.setNext(l4);
        l4.setNext(l5);
        list.add(l1);
        list.add(l2);
        list.add(l4);
        list.add(l5);
        InsertNode i = new InsertNode();
        i.Insert(l3,l1);
    }
}
