public class Solution {
  private Deque<Integer> left, right, buf;
  public Solution() {
    // Write your solution here.
    left = new LinkedList<>();
    right = new LinkedList<>();
    buf = new LinkedList<>();
  }

  public void offerFirst(int element) {
    left.push(element);
  }

  public void offerLast(int element) {
    right.push(element);
  }

  public Integer pollFirst() {
    check(right, left);
    return left.isEmpty() ? null : left.pop();
  }

  public Integer pollLast() {
    check(left, right);
    return right.isEmpty() ? null : right.pop();
  }

  public Integer peekFirst() {
    check(right, left);
    return left.isEmpty() ? null : left.peek();
  }

  public Integer peekLast() {
    check(left, right);
    return right.isEmpty() ? null : right.peek();
  }

  public int size() {
    return left.size() + right.size();
  }

  public boolean isEmpty() {
    return left.isEmpty() && right.isEmpty();
  }

  private void check(Deque<Integer> src, Deque<Integer> dst){
    if(dst.isEmpty()){
      for(int i = 0; i < src.size() / 2; i++){
        buf.push(src.pop());
      }
      while(!src.isEmpty()){
        dst.push(src.pop());
      }
      while(!buf.isEmpty()){
        src.push(buf.pop());
      }
    }
  }
}
