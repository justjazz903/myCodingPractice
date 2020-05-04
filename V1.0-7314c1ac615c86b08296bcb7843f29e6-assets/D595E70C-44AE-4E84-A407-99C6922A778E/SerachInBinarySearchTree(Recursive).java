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
    if(root == null || root.key == key){
      return root;
    }
    return search(key > root.key ? root.right : root.left, key);
  }
}
