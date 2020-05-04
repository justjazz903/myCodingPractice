public class Solution {
  public int longest(int[] arr) {
    // Write your solution here
    if(arr.length == 0){
      return 0;
    }
    int res = 1;
    int slow = 0;
    for(int fast = 1; fast < arr.length; fast++){
      if(arr[fast] > arr[fast - 1]){
        res = res > fast - slow + 1 ? res : fast - slow + 1;
      }else{
        slow = fast;
      }
    }
    return res;
  }
}
