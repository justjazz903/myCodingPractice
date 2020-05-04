public class Solution {
  public String removeSpaces(String input) {
    // Write your solution here
    char[] arr = input.toCharArray();
    int slow = 0;
    for(int fast = 0; fast < arr.length; fast++){
      if(arr[fast] != ' ' || (arr[fast] == ' ' && fast - 1 >= 0 && arr[fast - 1] != ' ')){
        arr[slow] = arr[fast];
        slow++;
      }
    }
    if(slow - 1 >= 0 && arr[slow - 1] == ' '){
      slow--;
    }
    return new String(arr, 0 , slow);
  }
}
