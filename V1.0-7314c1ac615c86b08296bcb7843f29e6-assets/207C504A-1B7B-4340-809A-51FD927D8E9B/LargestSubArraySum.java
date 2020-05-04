public class Solution {
  public int largestSum(int[] arr) {
    // Write your solution here
    int res = arr[0];
    int cur = arr[0];
    for(int i = 1; i < arr.length; i++){
      cur = Math.max(cur + arr[i], arr[i]);
      res = Math.max(res, cur);
    }
    return res;
  }
}
