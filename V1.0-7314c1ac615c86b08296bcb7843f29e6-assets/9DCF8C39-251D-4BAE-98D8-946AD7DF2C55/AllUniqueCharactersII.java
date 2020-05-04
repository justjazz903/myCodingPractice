public class Solution {
  public boolean allUnique(String word) {
    // Write your solution here
    int[] bool = new int[8];
    for(int i = 0; i < word.length(); i++){
      int k = (int)word.charAt(i);
      int index = k / 32;
      int bit = k % 32;
      if((bool[index] >> bit & 1) == 1){
        return false;
      }
      bool[index] |= 1 << bit;
    }
    return true;
  }
}
