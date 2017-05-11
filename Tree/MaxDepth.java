package Tree;

/**
 * Created by varun on 11/5/16.
 */

//Definition for a binary tree node.

public class MaxDepth {

    public static int solution(TreeNode root)
    {
        if(root == null) return 0;
        return Math.max(solution(root.left),solution(root.right)) + 1;

    }
}
