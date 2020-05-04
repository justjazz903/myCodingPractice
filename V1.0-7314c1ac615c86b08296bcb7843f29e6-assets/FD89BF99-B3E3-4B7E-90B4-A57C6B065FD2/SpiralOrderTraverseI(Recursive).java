public class Solution {
  public List<Integer> spiral(int[][] matrix) {
    // Write your solution here
    List<Integer> res = new ArrayList<>();
    spiral(matrix, 0, matrix.length - 1, res);
    return res;
  }
  private void spiral(int[][] matrix, int start, int size, List<Integer> res){
    if(size < 0){
      return;
    }
    if(size == 0){
      res.add(matrix[start][start]);
      return;
    }
    for(int i = 0; i < size; i++){
      res.add(matrix[start][start + i]);
    }
    for(int i = 0; i < size; i++){
      res.add(matrix[start + i][start + size]);
    }
    for(int i = 0; i < size; i++){
      res.add(matrix[start + size][start + size - i]);
    }
    for(int i = 0; i < size; i++){
      res.add(matrix[start + size - i][start]);
    }
    spiral(matrix, start + 1, size - 2, res);
  }
}
