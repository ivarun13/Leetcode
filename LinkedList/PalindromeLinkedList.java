package LinkedList;

/**
 * Created by varun on 3/26/17.
 */
public class PalindromeLinkedList {

    public static boolean solution(ListNode head){
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null){
            slow = slow.next;
        }
        slow = reverse(slow);
        while(slow != null){
            if(slow.val != head.val){
                return false;
            }
            slow = slow.next;
            head = head.next;
        }
        return  true;

    }

    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        System.out.println(solution(l1));
    }
}
