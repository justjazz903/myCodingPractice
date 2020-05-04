public class Solution {
  public int[] kClosest(int[] array, int target, int k) {
    // Write your solution here
    int[] res = new int[k];
    int left = 0;
    int right = array.length - 1;
    while(left < right - 1){
      int mid = left + (right - left) / 2;
      if(array[mid] > target){
        right = mid;
      }
      else{
        left = mid;
      }
    }
    //中心开花，每次都要检查是否出界
    for(int i = 0; i < k; i++){
      if(left < 0 || right < array.length && target - array[left] > array[right] - target){
        res[i] = array[right];
        right++;
      }
      else{
        res[i] = array[left];
        left--;
      }
    }
    return res;
  }
}
