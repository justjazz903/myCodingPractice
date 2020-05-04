public class Solution {
  public String rightShift(String input, int n) {
    // Write your solution here
    if(input.length() == 0){
      return new String();
    }
    char[] arr = input.toCharArray();
    n %= arr.length;
    char prev = arr[0];
    for(int i = 1; i <= arr.length; i++){
      char tem = arr[(i * n) % arr.length];
      arr[(i * n) % arr.length] = prev;
      prev = tem;
    }
    return new String(arr);
  }
}
