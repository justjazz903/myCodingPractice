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
  public List<Integer> inOrder(TreeNode root) {
    // Write your solution here
    List<Integer> res= new ArrayList<>();
    inOrder(root, res);
    return res;
  }
  private void inOrder(TreeNode root, List<Integer> res){
    if(root == null){
      return;
    }
    inOrder(root.left, res);
    res.add(root.key);
    inOrder(root.right, res);
  }
}
