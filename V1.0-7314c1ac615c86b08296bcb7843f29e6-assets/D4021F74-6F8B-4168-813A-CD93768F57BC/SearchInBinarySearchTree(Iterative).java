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
  public TreeNode search(TreeNode root, int key) {
    // Write your solution here
    TreeNode cur = root;
    while(cur != null && cur.key != key){
      cur = key > cur.key ? cur.right : cur.left;
    }
    return cur;
  }
}
