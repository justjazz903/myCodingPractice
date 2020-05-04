public class Solution {
  public int[] reorder(int[] arr) {
    // Write your solution here
    if(arr.length % 2 == 0){
      reorder(arr, 0, arr.length - 1);
    }else{
      reorder(arr, 0 , arr.length - 2);
    }
    return arr;
  }
  private void reorder(int[] arr, int left, int right){
    int len = right - left + 1;
    if(len <= 2){
      return;
    }
    int mid = left + len / 2;
    int lmid = left + len / 4;
    int rmid = left + 3 * len / 4;
    reverse(arr, lmid, mid - 1);
    reverse(arr, mid, rmid - 1);
    reverse(arr, lmid, rmid - 1);
    reorder(arr, left, left + 2 * (lmid - left) - 1);
    reorder(arr, left + 2 * (lmid - left), right);
  }
  private void reverse(int[] arr, int left, int right){
    while(left < right){
      int tem = arr[left];
      arr[left] = arr[right];
      arr[right] = tem;
      left++;
      right--;
    }
  }
}
