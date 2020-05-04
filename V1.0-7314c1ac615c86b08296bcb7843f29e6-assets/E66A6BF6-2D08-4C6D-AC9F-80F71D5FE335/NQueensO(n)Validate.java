public class Solution {
  public List<List<Integer>> nqueens(int n) {
    // Write your solution here
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> cur = new ArrayList<>();
    nqueens(n, cur, res);
    return res;
  }
  private void nqueens(int n, List<Integer> cur, List<List<Integer>> res){
    if(cur.size() == n){
      res.add(new ArrayList<Integer>(cur));
      return;
    }
    for(int col = 0; col < n; col++){
      if(valid(cur, col)){
        cur.add(col);
        nqueens(n, cur, res);
        cur.remove(cur.size() - 1);
      }
    }
    return;
  }
  private boolean valid(List<Integer> cur, int col){
    for(int row = 0; row < cur.size(); row++){
      if(cur.get(row) == col || cur.size() - row == Math.abs(cur.get(row) - col)){
        return false;
      }
    }
    return true;
  }
}
