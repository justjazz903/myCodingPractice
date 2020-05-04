public class Solution {
  public int largest(int[][] matrix) {
    // Write your solution here
    int N = matrix.length;
    if(N == 0){
      return 0;
    }
    int res = 0;
    int[][] largest = new int[N][N];
    for(int i = 0; i < N; i++){
      for(int j = 0; j < N; j++){
        if(i == 0 || j == 0){
          largest[i][j] = matrix[i][j];
        }else if(matrix[i][j] == 1){
          largest[i][j] = Math.min(largest[i][j - 1], largest[i - 1][j]) + 1;
          largest[i][j] = Math.min(largest[i - 1][j - 1] + 1, largest[i][j]);
        }
        res = Math.max(res, largest[i][j]);
      }
    }
    return res;
  }
}
