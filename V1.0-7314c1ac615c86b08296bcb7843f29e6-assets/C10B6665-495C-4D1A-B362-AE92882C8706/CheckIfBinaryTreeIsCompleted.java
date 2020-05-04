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
  public boolean isCompleted(TreeNode root) {
    // Write your solution here
    if(root == null){
      return true;
    }
    boolean flag = false;
    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.offer(root);
    while(!queue.isEmpty()){
      TreeNode cur = queue.poll();
      if(cur.left == null){
        flag = true;
      }else if(flag){
        return false;
      }else{
        queue.offer(cur.left);
      }
      if(cur.right == null){
        flag = true;
      }else if(flag){
        return false;
      }else{
        queue.offer(cur.right);
      }
    }
    return true;
  }
}
