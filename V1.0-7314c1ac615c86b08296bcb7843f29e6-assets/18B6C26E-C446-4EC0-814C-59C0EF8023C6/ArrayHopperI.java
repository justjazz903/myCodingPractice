public class Solution {
  public boolean canJump(int[] arr) {
    // Write your solution here
    if(arr.length == 1){
      return true;
    }
    boolean[] res = new boolean[arr.length];
    for(int i = arr.length - 2; i >= 0; i--){
      if(arr[i] + i >= arr.length - 1){
        res[i] = true;
      }else{
        for(int j = arr[i]; j >= 1; j--){
          if(res[i + j]){
            res[i] = true;
            break;
          }
        }
      }
    }
    return res[0];
  }
}
