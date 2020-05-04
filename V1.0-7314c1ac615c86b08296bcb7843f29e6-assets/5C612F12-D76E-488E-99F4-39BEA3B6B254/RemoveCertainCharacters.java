public class Solution {
  public String remove(String input, String t) {
    // Write your solution here
    Set<Character> set = new HashSet<>();
    for(int i = 0; i < t.length(); i++){
      set.add(t.charAt(i));
    }
    char[] arr = input.toCharArray();
    int slow = 0;
    for(int fast = 0; fast < arr.length; fast++){
      if(!set.contains(arr[fast])){
        arr[slow] = arr[fast];
        slow++;
      }
    }
    return new String(arr, 0, slow);
  }
}
