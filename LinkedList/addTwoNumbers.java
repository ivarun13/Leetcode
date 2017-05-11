package LinkedList;

/**
 * Created by varun on 3/26/17.
 */
public class addTwoNumbers {

    public static void solution(ListNode l1, ListNode l2){
        int carry = 0;
        ListNode l = new ListNode(0);
        ListNode head = l;
        while(l1 != null || l2 != null || carry != 0){
            ListNode temp = new ListNode(0);
            int l1val = l1 != null ? l1.val : 0;
            int l2val = l2 != null ? l2.val : 0;
            int value = l1val + l2val + carry;
            carry = value/10;
            int nodeVal = value%10;
            temp.val = nodeVal;
            l.next = temp;
            l = l.next;
            l1 = l1 == null ? l1 : l1.next;
            l2 = l2 == null ? l2 : l2.next;

        }
        System.out.println(head.next.val);
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l4.next = l5;
        l5.next = l6;
        solution(l1,l4);

    }
}
