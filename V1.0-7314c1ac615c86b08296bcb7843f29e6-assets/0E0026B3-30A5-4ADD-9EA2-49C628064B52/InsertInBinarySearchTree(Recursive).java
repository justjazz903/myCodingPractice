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
  public TreeNode insert(TreeNode root, int key) {
    // Write your solution here
    if(root == null){
      return new TreeNode(key);
    }
    if(key < root.key){
      root.left = insert(root.left, key);
    }else if(key > root.key){
      root.right = insert(root.right, key);
    }
    return root;
  }
}
