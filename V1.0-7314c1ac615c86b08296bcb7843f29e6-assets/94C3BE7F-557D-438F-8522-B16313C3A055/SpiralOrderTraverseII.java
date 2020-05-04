public class Solution {
  public List<Integer> spiral(int[][] matrix) {
    // Write your solution here
    List<Integer> res = new ArrayList<>();
    spiral(matrix, 0, matrix.length - 1, matrix[0].length - 1, res);
    return res;
  }
  private void spiral(int[][] matrix, int start, int rowSize, int colSize, List<Integer> res){
    if(rowSize < 0 || colSize < 0){
      return;
    }
    if(rowSize == 0 && colSize > 0){
      for(int n = 0; n <= colSize; n++){
        res.add(matrix[start][start + n]);
      }
      return;
    }
    if(rowSize > 0 && colSize == 0){
      for(int n = 0; n <= rowSize; n++){
        res.add(matrix[start + n][start + colSize]);
      }
      return;
    }
    if(rowSize == 0 && colSize == 0){
      res.add(matrix[start][start]);
      return;
    }
    for(int n = 0; n < colSize; n++){
      res.add(matrix[start][start + n]);
    }
    for(int n = 0; n < rowSize; n++){
      res.add(matrix[start + n][start + colSize]);
    }
    for(int n = 0; n < colSize; n++){
      res.add(matrix[start + rowSize][start + colSize - n]);
    }
    for(int n = 0; n < rowSize; n++){
      res.add(matrix[start + rowSize - n][start]);
    }
    spiral(matrix, start + 1, rowSize - 2, colSize - 2, res);
  }
}
