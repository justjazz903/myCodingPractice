public class Solution {
  public long power(int a, int b) {
    // Write your solution here
    if(b == 0){
      return 1;
    }
    long tem = power(a, b / 2);
    if(b % 2 == 0){
      return tem * tem;
    }
    else{
      return tem * tem * a;
    }
  }
}
