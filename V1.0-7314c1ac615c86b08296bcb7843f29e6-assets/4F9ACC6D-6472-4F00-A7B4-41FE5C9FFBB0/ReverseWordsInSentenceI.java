public class Solution {
  public String reverseWords(String input) {
    // Write your solution here
    if(input == null){
      return null;
    }
    char[] arr = input.toCharArray();
    for(int i = 0; i < arr.length / 2; i++){
      swap(arr, i, arr.length - i - 1);
    }
    int slow = 0;
    for(int fast = 0; fast < arr.length; fast++){
      if(fast == 0 || arr[fast - 1] == ' '){
        slow = fast;
      }
      if(fast == arr.length - 1 || arr[fast + 1] == ' '){
        reverse(arr, slow, fast);
      }
    }
    return new String(arr);
  }
  private void swap(char[] arr, int i, int j){
    char tem = arr[i];
    arr[i] = arr[j];
    arr[j] = tem;
  }
  private void reverse(char[] arr, int left, int right){
    while(left < right){
      swap(arr, left, right);
      left++;
      right--;
    }
  }
}
