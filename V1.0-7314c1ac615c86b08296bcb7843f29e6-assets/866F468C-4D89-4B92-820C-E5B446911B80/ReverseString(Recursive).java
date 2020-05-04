public class Solution {
  public String reverse(String input) {
    // Write your solution here
    char[] arr = input.toCharArray();
    reverse(arr, 0, arr.length - 1);
    return new String(arr);
  }
  private void reverse(char[] arr, int left, int right){
    if(left >= right){
      return;
    }
    swap(arr, left, right);
    reverse(arr, left + 1, right - 1);
  }
  private void swap(char[] arr, int i, int j){
    char tem = arr[i];
    arr[i] = arr[j];
    arr[j] = tem;
  }
}
