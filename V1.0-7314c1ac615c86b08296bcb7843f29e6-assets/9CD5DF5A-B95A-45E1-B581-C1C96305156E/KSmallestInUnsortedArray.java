public class Solution {
  public int[] kSmallest(int[] arr, int k) {
    // Write your solution here
    if(arr.length == 0 || k == 0){
      return new int[0];
    }
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k,
    new Comparator<Integer>(){
      @Override
      public int compare(Integer o1, Integer o2){
        if(o1.equals(o2)){
          return 0;
        }
        return o1 > o2 ? -1 : 1;
      }
    });
    for(int i = 0; i < k; i++){
      maxHeap.offer(arr[i]);
    }
    for(int i = k; i < arr.length; i++){
      if(arr[i] < maxHeap.peek()){
        maxHeap.poll();
        maxHeap.offer(arr[i]);
      }
    }
    int[] res = new int[k];
    for(int i = k - 1; i >= 0; i--){
      res[i] = maxHeap.poll();
    }
    return res;
  }
}
