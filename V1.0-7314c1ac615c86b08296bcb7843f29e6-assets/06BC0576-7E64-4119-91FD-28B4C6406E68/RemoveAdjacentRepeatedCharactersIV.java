public class Solution {
  public String deDup(String input) {
    // Write your solution here
    if(input == null || input.length() == 0){
      return new String();
    }
    char[] arr = input.toCharArray();
    int slow = 0;
    for(int fast = 1; fast < arr.length; fast++){
      if(slow == -1 || arr[slow] != arr[fast]){
        slow++;
        arr[slow] = arr[fast];
      }else{
        slow--;
        while(fast + 1 < arr.length && arr[fast] == arr[fast + 1]){
          fast++;
        }
      }
    }
    return new String(arr, 0, slow + 1);
  }
}
