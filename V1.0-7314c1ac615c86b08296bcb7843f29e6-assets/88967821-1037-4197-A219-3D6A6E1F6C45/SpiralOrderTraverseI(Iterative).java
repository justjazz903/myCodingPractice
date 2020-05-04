public class Solution {
  public List<Integer> spiral(int[][] matrix) {
    // Write your solution here
    int start = 0;
    int size = matrix.length - 1;
    List<Integer> res = new ArrayList<>();
    while(size > 0){
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
      size -= 2;
      start++;
    }
    if(size == 0){
      res.add(matrix[start][start]);
    }
    return res;
  }
}
