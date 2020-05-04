public class Solution {
  public List<List<Integer>> nqueens(int n) {
    // Write your solution here
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> cur = new ArrayList<>();
    boolean[] usedDia = new boolean[2 * n - 1];
    boolean[] usedRevDia = new boolean[2 * n - 1];
    boolean[] usedCol = new boolean[n];
    nqueens(n, cur, res, usedDia, usedRevDia, usedCol);
    return res;
  }
  private void nqueens(int n, List<Integer> cur, List<List<Integer>> res,
  boolean[] usedDia, boolean[] usedRevDia, boolean[] usedCol){
    if(cur.size() == n){
      res.add(new ArrayList<Integer>(cur));
      return;
    }
    for(int col = 0; col < n; col++){
      int row = cur.size();
      if(valid(n, row, col, usedDia, usedRevDia, usedCol)){
        mark(n, row, col, usedDia, usedRevDia, usedCol);
        cur.add(col);
        nqueens(n, cur, res, usedDia, usedRevDia, usedCol);
        cur.remove(cur.size() - 1);
        mark(n, row, col, usedDia, usedRevDia, usedCol);
      }
    }
    return;
  }
  private boolean valid(int n, int row, int col,
  boolean[] usedDia, boolean[] usedRevDia, boolean[] usedCol){
    return !usedDia[row + col] && !usedRevDia[row - col + n - 1] && !usedCol[col];
  }
  private void mark(int n, int row, int col,
  boolean[] usedDia, boolean[] usedRevDia, boolean[] usedCol){
    usedDia[row + col] = !usedDia[row + col];
    usedRevDia[row - col + n - 1] = !usedRevDia[row - col + n - 1];
    usedCol[col] = !usedCol[col];
  }
}
