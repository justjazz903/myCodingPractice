public class Solution {
  public int minJump(int[] arr) {
    // Write your solution here
    int[] res = new int[arr.length];
    for(int i = 1; i < arr.length; i++){
      res[i] = -1;
      for(int j = i - 1; j >= 0; j--){
        if(arr[j] + j >= i && res[j] != -1){
          if(res[i] == -1 || res[i] > res[j] + 1){
            res[i] = res[j] + 1;
          }
        }
      }
    }
    return res[arr.length - 1];
  }
}
