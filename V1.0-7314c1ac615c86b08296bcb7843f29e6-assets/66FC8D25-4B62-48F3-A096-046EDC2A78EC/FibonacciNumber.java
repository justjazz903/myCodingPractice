public class Solution {
  public long fibonacci(int K) {
    // Write your solution here
    long a = 0;
    long b = 1;
    if(K < 1){
      return a;
    }
    while(K > 1){
      long tem = a + b;
      a = b;
      b = tem;
      K--;
    }
    return b;
  }
}
