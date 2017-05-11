//import javax.swing.tree.TreeNode;
//import java.util.*;
//public class PathSumII{
//
//List<List<Integer>> result = new ArrayList<>();
//  public List<List<Integer>> solution(TreeNode root, int sum){
//    if(root == null) return result;
//        Stack<Integer> stack = new Stack<>();
//        dfs(root,sum,stack);
//        return result;
//  }
//
//  public void dfs(TreeNode node,int sum,Stack<Integer> stack){
//       stack.push(node.val);
//       if(node.left == null && node.right == null && sum-node.val == 0){
//               result.add(new ArrayList<Integer>(stack));
//       }
//       if(node.left != null) dfs(node.left,sum - node.val, stack);
//       if(node.right != null) dfs(node.right,sum - node.val,stack);
//       stack.pop();
//   }
//}
