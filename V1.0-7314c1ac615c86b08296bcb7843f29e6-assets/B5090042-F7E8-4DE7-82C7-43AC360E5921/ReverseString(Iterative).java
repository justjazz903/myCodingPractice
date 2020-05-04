public class Solution {
  public String reverse(String input) {
    // Write your solution here
    char[] arr = input.toCharArray();
    for(int i = 0; i < arr.length / 2; i++){
      swap(arr, i, arr.length - i - 1);
    }
    return new String(arr);
  }
  private void swap(char[] arr, int i, int j){
    char tem = arr[i];
    arr[i] = arr[j];
    arr[j] = tem;
  }
}
