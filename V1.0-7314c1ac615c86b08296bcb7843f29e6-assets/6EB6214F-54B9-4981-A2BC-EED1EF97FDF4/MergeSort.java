public class Solution {
  public int[] mergeSort(int[] arr) {
    // Write your solution here
    int[] buf = new int[arr.length];
    mergeSort(arr, buf, 0, arr.length - 1);
    return arr;
  }

  private void mergeSort(int[] arr, int[] buf, int left, int right){
    if(left >= right){
      return;
    }
    int mid = left + (right - left) / 2;
    mergeSort(arr, buf, left, mid);
    mergeSort(arr, buf, mid + 1, right);
    merge(arr, buf, left, mid, right);
  }

  private void merge(int[] arr, int[] buf, int left, int mid, int right){
    for(int i = left; i <= right; i++){
      buf[i] = arr[i];
    }
    int leftIndex = left;
    int rightIndex = mid + 1;
    while(leftIndex <= mid && rightIndex <= right){
      if(buf[leftIndex] < buf[rightIndex]){
        arr[left] = buf[leftIndex];
        leftIndex++;
      }
      else{
        arr[left] = buf[rightIndex];
        rightIndex++;
      }
      left++;
    }
    while(leftIndex <= mid){
      arr[left] = buf[leftIndex];
      left++;
      leftIndex++;
    }
  }
}
