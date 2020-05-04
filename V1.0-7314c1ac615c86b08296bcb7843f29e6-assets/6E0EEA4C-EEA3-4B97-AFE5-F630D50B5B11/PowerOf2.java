public class Solution {
  public boolean isPowerOfTwo(int number) {
    // Write your solution here
    return number > 0 && (number & (number - 1)) == 0;
  }
}
