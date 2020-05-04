public class Solution {
  public boolean match(String input, String pattern) {
    // Write your solution here
    int si = 0;
    int sp = 0;
    while(si < input.length() && sp < pattern.length()){
      if(pattern.charAt(sp) >= '0' && pattern.charAt(sp) <= '9'){
        int count = 0;
        while(sp < pattern.length() && pattern.charAt(sp) >= '0' && pattern.charAt(sp) <= '9'){
          count = 10 * count + (int)(pattern.charAt(sp) - '0');
          sp++;
        }
        si += count;
      }else{
        if(pattern.charAt(sp) == input.charAt(si)){
          sp++;
          si++;
        }else{
          return false;
        }
      }
    }
    return si == input.length() && sp == pattern.length();
  }
}
