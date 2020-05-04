/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */
public class Solution {
  public boolean isBalanced(TreeNode root) {
    // Write your solution here
    if(root == null){
      return true;
    }
    return getHeight(root) != -1;
  }
  private int getHeight(TreeNode root){
    if(root == null){
      return 0;
    }
    int left = getHeight(root.left);
    if(left == -1){
      return -1;
    }
    int right = getHeight(root.right);
    if(right == -1){
      return -1;
    }
    if(Math.abs(left - right) > 1){
      return -1;
    }
    return Math.max(left, right) + 1;
  }
}
