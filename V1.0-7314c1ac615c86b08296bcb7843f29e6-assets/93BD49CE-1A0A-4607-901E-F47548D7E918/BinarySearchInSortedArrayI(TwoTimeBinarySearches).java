public class Solution {
  public int[] search(int[][] matrix, int target) {
    // Write your solution here
    //
    int[] res = {-1, -1};
    int row = findRow(matrix, 0, matrix.length - 1, target);
    if(row == -1){
      return res;
    }
    int col = findCol(matrix[row], 0, matrix[row].length - 1, target);
    if(col == -1){
      return res;
    }
    res[0] = row;
    res[1] = col;
    return res;
  }
  private int findRow(int[][] matrix, int up, int down, int target){
    while(up <= down){
      int mid = up + (down - up) / 2;
      if(matrix[mid].length < 1){
        return -1;
      }
      if(matrix[mid][0] > target){
        down = mid - 1;
      }
      else{
        up = mid + 1;
      }
    }
    return down;
  }
  private int findCol(int[] row, int left, int right, int target){
    while(left <= right){
      int mid = left + (right - left) / 2;
      if(row[mid] == target){
        return mid;
      }
      else if(row[mid] > target){
        right = mid - 1;
      }
      else{
        left = mid + 1;
      }
    }
    return -1;
  }
}
