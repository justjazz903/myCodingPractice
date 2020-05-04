public class Solution {
  public int longest(String input) {
    // Write your solution here
    char[] arr = input.toCharArray();
    int slow = 0;
    int fast = 0;
    Set<Character> set = new HashSet<>();
    int res = 0;
    while(fast < arr.length){
      if(set.contains(arr[fast])){
        set.remove(arr[slow]);
        slow++;
      }else{
        set.add(arr[fast]);
        fast++;
        res = res > set.size() ? res : set.size();
      }
    }
    return res;
  }
}
