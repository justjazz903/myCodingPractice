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
    if(root == null){
      return res;
    }
    Deque<TreeNode> stack = new ArrayDeque<>();
    stack.push(root);
    while(!stack.isEmpty()){
      TreeNode cur = stack.pop();
      if(cur.right != null){
        stack.push(cur.right);
      }
      if(cur.left != null){
        stack.push(cur.left);
      }
      res.add(cur.key);
    }
    return res;
  }
}
