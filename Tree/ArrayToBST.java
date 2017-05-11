package Tree;

/**
 * Created by varun on 4/12/17.
 */
public class ArrayToBST {

    public TreeNode sortedArrayToBST(int[] num) {
        if (num.length == 0) {
            return null;
        }
        TreeNode head = helper(num, 0, num.length - 1);
        return head;
    }

    public TreeNode helper(int[] num, int low, int high) {
        if (low > high) { // Done
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = helper(num, low, mid - 1);
        node.right = helper(num, mid + 1, high);
        return node;
    }

    public static void main(String[] args) {
        ArrayToBST ab = new ArrayToBST();
        int[] nums = {1,2,3,4,5};
        System.out.println(ab.sortedArrayToBST(nums).right.right.val);
    }
}
