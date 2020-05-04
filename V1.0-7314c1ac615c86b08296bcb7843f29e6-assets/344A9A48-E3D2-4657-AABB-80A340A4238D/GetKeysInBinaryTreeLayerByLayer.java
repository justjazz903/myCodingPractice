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
  public List<List<Integer>> layerByLayer(TreeNode root) {
    // Write your solution here
    List<List<Integer>> res = new ArrayList<>();
    if(root == null){
      return res;
    }
    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.offer(root);
    while(!queue.isEmpty()){
      List<Integer> curLayer = new ArrayList<>();
      int size= queue.size();
      for(int i = 0; i < size; i++){
        TreeNode curNode = queue.poll();
        curLayer.add(curNode.key);
        if(curNode.left != null){
          queue.offer(curNode.left);
        }
        if(curNode.right != null){
          queue.offer(curNode.right);
        }
      }
      res.add(curLayer);
    }
    return res;
  }
}
