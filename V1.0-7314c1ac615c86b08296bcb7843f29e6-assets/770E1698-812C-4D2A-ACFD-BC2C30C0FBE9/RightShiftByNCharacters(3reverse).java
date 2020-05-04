public class Solution {
  public String rightShift(String input, int n) {
    // Write your solution here
    if(input.length() == 0){
      return new String();
    }
    n %= input.length();
    char[] arr = input.toCharArray();
    reverse(arr, 0, arr.length - 1 - n);
    reverse(arr, arr.length - n, arr.length - 1);
    reverse(arr, 0, arr.length - 1);
    return new String(arr);
  }
  private void reverse(char[] arr, int left, int right){
    while(left < right){
      char tem = arr[left];
      arr[left] = arr[right];
      arr[right] = tem;
      left++;
      right--;
    }
  }
}
