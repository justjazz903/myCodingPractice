public class Solution {
  public List<String> validParentheses(int n) {
    // Write your solution here
    List<String> res = new ArrayList<>();
    char[] cur = new char[2 * n];
    validParentheses(0, n, n, cur, res);
    return res;
  }
  private void validParentheses(int index, int left, int right, char[] cur, List<String> res){
    if(left == 0 && right == 0){
      res.add(new String(cur));
      return;
    }
    if(left > 0){
      cur[index] = '(';
      validParentheses(index + 1, left - 1, right, cur, res);
    }
    if(right > left){
      cur[index] = ')';
      validParentheses(index + 1, left, right - 1, cur, res);
    }
  }
}
