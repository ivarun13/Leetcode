package Tree;

/**
 * Created by varun on 11/7/16.
 */

// Definition for a binary tree node.
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class InvertTree {

        public static TreeNode solution(TreeNode root)
        {
            if(root == null) return root;
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            solution(root.left);
            solution(root.right);
            return root;
        }
}
