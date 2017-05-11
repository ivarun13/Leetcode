package LinkedList;

/**
 * Created by varun on 12/15/16.
 */
public class DeleteNode {

    public void Delete(ListNode node)
    {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
