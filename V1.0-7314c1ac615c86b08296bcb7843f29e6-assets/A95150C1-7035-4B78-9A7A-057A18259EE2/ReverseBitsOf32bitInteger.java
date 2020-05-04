public class Solution {
  public long reverseBits(long n) {
    // Write your solution here
    int i = 0;
    int j = 31;
    long one = 1L;
    while(i < j){
      if((n >>> i & one) != (n >>> j & one)){
        n ^= one << i;
        n ^= one << j;
      }
      i++;
      j--;
    }
    return n;
  }
}
