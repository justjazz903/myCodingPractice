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
    List<Integer> res = new ArrayList<>();
    Deque<TreeNode> stack = new ArrayDeque<>();
    TreeNode cur = root;
    while(cur != null || !stack.isEmpty()){
      if(cur != null){
        stack.push(cur);
        cur = cur.left;
      }
      else{
        cur = stack.pop();
        res.add(cur.key);
        cur = cur.right;
      }
    }
    return res;
  }
}
