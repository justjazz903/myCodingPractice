/**
 * public class GraphNode {
 *   public int key;
 *   public List<GraphNode> neighbors;
 *   public GraphNode(int key) {
 *     this.key = key;
 *     this.neighbors = new ArrayList<GraphNode>();
 *   }
 * }
 */
public class Solution {
  public boolean isBipartite(List<GraphNode> graph) {
    // write your solution here
    HashMap<GraphNode, Integer> visited = new HashMap<>();
    for(GraphNode node : graph){
      if(!BFS(node, visited)){
        return false;
      }
    }
    return true;
  }
  private boolean BFS(GraphNode node, HashMap<GraphNode, Integer> visited){
    if(visited.containsKey(node)){
      return true;
    }
    Queue<GraphNode> queue = new ArrayDeque<>();
    visited.put(node, 0);
    queue.offer(node);
    while(!queue.isEmpty()){
      GraphNode cur = queue.poll();
      int curGroup = visited.get(cur);
      int neiGroup = curGroup == 0 ? 1 : 0;
      for(GraphNode nei : cur.neighbors){
        if(!visited.containsKey(nei)){
          visited.put(nei, neiGroup);
          queue.offer(nei);
        }else if(visited.get(nei) != neiGroup){
          return false;
        }
      }
    }
    return true;
  }
}
