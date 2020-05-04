public class Solution {
  public int longest(int[] arr) {
    // Write your solution here
    int res = 0;
    for(int fast = 0; fast < arr.length; fast++){
      if(arr[fast] == 1){
        int begin = fast;
        while(fast < arr.length && arr[fast] == 1){
          fast++;
        }
        res = Math.max(res, fast - begin);
      }
    }
    return res;
  }
}
