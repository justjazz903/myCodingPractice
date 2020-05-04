public class Solution {
  public int longestConsecutiveOnes(int[] nums, int k) {
    // Write your solution here
    int res = 0;
    int slow = 0;
    int fast = 0;
    int num_zeros = 0;
    while(fast < nums.length){
      if(nums[fast] == 1){
        res = res > fast - slow + 1 ? res : fast - slow + 1;
        fast++;
      }else if(num_zeros < k){
        res = res > fast - slow + 1 ? res : fast - slow + 1;
        num_zeros++;
        fast++;
      }else{
        if(nums[slow] == 0){
          num_zeros--;
        }
        slow++;
      }
    }
    return res;
  }
}
