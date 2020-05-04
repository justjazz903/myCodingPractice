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
  public List<Integer> preOrder(TreeNode root) {
    // Write your solution here
    List<Integer> res = new ArrayList<>();
    preOrder(root, res);
    return res;
  }
  private void preOrder(TreeNode root, List<Integer> res){
    if(root == null){
      return;
    }
    res.add(root.key);
    preOrder(root.left, res);
    preOrder(root.right, res);
  }
}
