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
  public TreeNode deleteTree(TreeNode root, int key) {
    // Write your solution here
    if(root == null){
      return root;
    }
    if(key == root.key){
      if(root.left == null){
        return root.right;
      }else if(root.right == null){
        return root.left;
      }else if(root.right.left == null){
        root.right.left = root.left;
        return root.right;
      }else{
        TreeNode newNode = deleteSmallest(root.right);
        newNode.left = root.left;
        newNode.right = root.right;
        return newNode;
      }
    }else if(key > root.key){
      root.right = deleteTree(root.right, key);
    }else{
      root.left = deleteTree(root.left, key);
    }
    return root;
  }
  private TreeNode deleteSmallest(TreeNode root){
    while(root.left.left != null){
      root = root.left;
    }
    TreeNode smallest = root.left;
    root.left = root.left.right;
    return smallest;
  }
}
