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
    TreeNode cur = root;
    while(cur.key != key){
      if(key > cur.key){
        if(cur.right == null){
          cur.right = new TreeNode(key);
        }
        cur = cur.right;
      }else if(key < cur.key){
        if(cur.left == null){
          cur.left = new TreeNode(key);
        }
        cur = cur.left;
      }
    }
    return root;
  }
}
