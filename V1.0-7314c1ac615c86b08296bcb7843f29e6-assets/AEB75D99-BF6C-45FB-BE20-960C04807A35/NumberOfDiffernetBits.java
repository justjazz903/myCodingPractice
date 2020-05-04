public class Solution {
  public int diffBits(int a, int b) {
    // Write your solution here
    a = a ^ b;
    b = 0;
    while(a != 0){
      b += a & 1;
      a = a >>> 1;
    }
    return b;
  }
}
