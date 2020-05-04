public class Solution {
  public int[] rainbowSort(int[] arr) {
    // use 3 pointers
    int neg = 0;
    int zero = 0;
    int one = arr.length - 1;
    while(zero <= one){
      if(arr[zero] == -1){
        swap(arr, neg, zero);
        neg++;
        zero++;
      }
      else if(arr[zero] == 0){
        zero++;
      }
      else{
        swap(arr, zero, one);
        one--;
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
