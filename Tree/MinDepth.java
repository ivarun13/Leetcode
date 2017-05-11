//public class MinDepth{
//
//  public int solution(TreeNode node){
//      if(node == null) return 0;
//      int left = solution(node.left);
//      int right = solution(node.right);
//      return (left == 0 || right == 0) ? left+right+1 : Math.min(left,right)+1;
//  }
//
//}
