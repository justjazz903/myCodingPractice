public class Solution {
  public int[] solve(int[] arr) {
    // Write your solution here
    if(arr == null){
      return null;
    }
    for(int i = 0; i < arr.length - 1; i++){
      int min = i;
      for(int j = i + 1; j < arr.length; j++){
        if(arr[j] < arr[min]){
          min = j;
        }
      }
      int tem = arr[i];
      arr[i] = arr[min];
      arr[min] = tem;
    }
    return arr;
  }
}
