public class Solution {
  public int[] moveZero(int[] arr) {
    // Write your solution here
    int left = 0;
    int right = arr.length - 1;
    while(left <= right){
      if(arr[left] != 0){
        left++;
      }
      else if(arr[right] == 0){
        right--;
      }
      else{
        swap(arr, left, right);
        left++;
        right--;
      }
    }
    return arr;
  }

  private void swap(int[] arr, int left, int right){
    int tem = arr[left];
    arr[left] = arr[right];
    arr[right] = tem;
  }
}
