public class Solution {
  public int maxProduct(int length) {
    // Write your solution here
    int[] arr = new int[length + 1];
    for(int i = 1; i <= length; i++){
      for(int j = 0; j < i; j++){
        arr[i] = Math.max(arr[i], Math.max(j, arr[j]) * (i - j));
      }
    }
    return arr[length];
  }
}
