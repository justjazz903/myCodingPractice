public class Solution {
  public int[] search(int[][] matrix, int target) {
    // Write your solution here
    int[] res = {-1, -1};
    int left = 0;
    int right = matrix.length * matrix[0].length - 1;
    while(left <= right){
      int mid = left + (right - left) / 2;
      int row = mid / matrix[0].length;
      int col = mid % matrix[0].length;
      if(matrix[row][col] == target){
        res[0] = row;
        res[1] = col;
        return res;
      }
      else if(matrix[row][col] > target){
        right = mid - 1;
      }
      else{
        left = mid + 1;
      }
    }
    return res;
  }
}
