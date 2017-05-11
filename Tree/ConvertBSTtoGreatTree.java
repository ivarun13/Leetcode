//public class ConvertBSTtoGreatTree {
//  int sum = 0;
//  public void solution(TreeNode root){
//      dfs(root);
//      return sum;
//  }
//  public void dfs(TreeNode node){
//    if(node == null) return;
//    dfs(node.right);
//    sum += node.val;
//    node.val = sum;
//    dfs(node.left);
//  }
//}
