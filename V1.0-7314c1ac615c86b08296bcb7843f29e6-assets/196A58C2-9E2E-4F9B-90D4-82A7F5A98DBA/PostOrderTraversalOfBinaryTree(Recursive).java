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
  public List<Integer> postOrder(TreeNode root) {
    // Write your solution here
    List<Integer> res = new ArrayList<>();
    postOrder(root, res);
    return res;
  }
  private void postOrder(TreeNode root, List<Integer> res){
    if(root == null){
      return;
    }
    postOrder(root.left, res);
    postOrder(root.right, res);
    res.add(root.key);
  }
}
