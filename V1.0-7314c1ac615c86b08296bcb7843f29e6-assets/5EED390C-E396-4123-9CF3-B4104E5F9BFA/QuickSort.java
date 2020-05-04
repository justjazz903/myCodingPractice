public class Solution {
  public int[] quickSort(int[] arr) {
    // Write your solution here
    if(arr == null){
      return arr;
    }
    quickSort(arr, 0, arr.length - 1);
    return arr;
  }

  private void quickSort(int[] arr, int left, int right){
    if(left >= right){
      return;
    }
    int pivotIndex = getPivot(left, right);
    int pivot = arr[pivotIndex];
    swap(arr, pivotIndex, right);
    int leftBound = left;
    int rightBound = right - 1;
    while(leftBound <= rightBound){
      if(arr[leftBound] <= pivot){
        leftBound++;
      }
      else if(arr[rightBound] >= pivot){
        rightBound--;
      }
      else{
        swap(arr, leftBound, rightBound);
        leftBound++;
        rightBound--;
      }
    }
    swap(arr, leftBound, right);//leftBound is the pivot's correct position
    quickSort(arr, left, leftBound - 1);
    quickSort(arr, leftBound + 1, right);
  }

  private int getPivot(int left, int right){
    return left + (int)(Math.random() * (right - left + 1));
  }

  private void swap(int[] arr, int left, int right){
    int tem = arr[left];
    arr[left] = arr[right];
    arr[right] = tem;
  }
}
