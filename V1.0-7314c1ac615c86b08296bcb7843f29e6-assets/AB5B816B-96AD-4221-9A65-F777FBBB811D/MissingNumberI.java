public class Solution {
  public int missing(int[] array) {
    // Write your solution here
    int res = 0;
    for(int i = 1; i <= array.length + 1; i++){
      res ^= i;
    }
    for(int n : array){
      res ^= n;
    }
    return res;
  }
}
