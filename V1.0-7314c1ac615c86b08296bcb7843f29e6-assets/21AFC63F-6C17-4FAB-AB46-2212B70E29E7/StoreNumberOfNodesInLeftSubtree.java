/**
 * public class TreeNodeLeft {
 *   public int key;
 *   public TreeNodeLeft left;
 *   public TreeNodeLeft right;
 *   public int numNodesLeft;
 *   public TreeNodeLeft(int key) {
 *     this.key = key;
 *   }
 * }
 */
public class Solution {
  public void numNodesLeft(TreeNodeLeft root) {
    // Write your solution here
    helper(root);
  }
  private int helper(TreeNodeLeft root){
    if(root == null){
      return 0;
    }
    int numLeft = helper(root.left);
    int numRight = helper(root.right);
    root.numNodesLeft = numLeft;
    return numLeft + numRight + 1;
  }
}
