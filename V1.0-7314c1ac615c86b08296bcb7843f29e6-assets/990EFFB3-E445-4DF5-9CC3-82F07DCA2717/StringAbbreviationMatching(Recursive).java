public class Solution {
  public boolean match(String input, String pattern) {
    // Write your solution here
    return match(input, 0, pattern, 0);
  }
  private boolean match(String input, int si, String pattern, int sp){
    if(si == input.length() && sp == pattern.length()){
      return true;
    }else if(si >= input.length() || sp >= pattern.length()){
      return false;
    }
    if(pattern.charAt(sp) >= '0' && pattern.charAt(sp) <= '9'){
      int count = 0;
      while(sp < pattern.length() && pattern.charAt(sp) >= '0' && pattern.charAt(sp) <= '9'){
        count = 10 * count + (int)(pattern.charAt(sp) - '0');
        sp++;
      }
      return match(input, si + count, pattern, sp);
    }else{
      if(pattern.charAt(sp) == input.charAt(si)){
        return match(input, si + 1, pattern, sp + 1);
      }else{
        return false;
      }
    }
  }
}
