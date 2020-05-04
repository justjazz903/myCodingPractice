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
  public TreeNode lowestCommonAncestor(TreeNode root,
      TreeNode one, TreeNode two) {
    // Write your solution here.
    if(root == null){
      return null;
    }
    if(root == one || root == two){
      return root;
    }
    TreeNode ll = lowestCommonAncestor(root.left, one, two);
    TreeNode lr = lowestCommonAncestor(root.right, one, two);
    if(ll != null && lr != null){
      return root;
    }
    return ll == null ? lr : ll;
  }
}
