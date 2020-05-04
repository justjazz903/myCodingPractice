public class Solution {
  public void sort(LinkedList<Integer> s1) {
    LinkedList<Integer> s2 = new LinkedList<Integer>();
    // Write your solution here.
    while(!s1.isEmpty()){
      int count = 0;
      int curMin = Integer.MAX_VALUE;
      while(!s1.isEmpty()){
        int cur = s1.pollFirst();
        if(cur < curMin){
          curMin = cur;
          count = 1;
        }
        else if(cur == curMin){
          count++;
        }
        s2.offerFirst(cur);
      }
      while(!s2.isEmpty() && s2.peekFirst() >= curMin){
        int cur = s2.pollFirst();
        if(cur > curMin){
          s1.offerFirst(cur);
        }
      }
      while(count > 0){
        s2.offerFirst(curMin);
        count--;
      }
    }
    while(!s2.isEmpty()){
      s1.offerFirst(s2.pollFirst());
    }
  }
}
