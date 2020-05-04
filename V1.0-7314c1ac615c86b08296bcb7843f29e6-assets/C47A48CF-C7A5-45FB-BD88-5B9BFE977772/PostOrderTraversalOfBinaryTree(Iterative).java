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

 /**
    There is a tricky solution: post-order is the reverse of pre-order.
    But here we use the general method.
 **/

public class Solution {
  public List<Integer> postOrder(TreeNode root) {
    // Write your solution here
    List<Integer> res = new ArrayList<>();
    if(root == null){
      return res;
    }
    Deque<TreeNode> stack = new ArrayDeque<>();
    TreeNode prev = null;
    stack.push(root);
    while(!stack.isEmpty()){
      TreeNode cur = stack.peek();
      //going down
      if(prev == null || cur == prev.left || cur == prev.right){
        if(cur.left != null){
          stack.push(cur.left);
        }else if(cur.right != null){
          stack.push(cur.right);
        }else{
          stack.pop();
          res.add(cur.key);
        }
      }
      //going up
      else if(prev == cur.right || (prev == cur.left && cur.right == null)){
        stack.pop();
        res.add(cur.key);
      }
      //going down again
      else{
        stack.push(cur.right);
      }
      prev = cur;
    }
    return res;
  }
}
