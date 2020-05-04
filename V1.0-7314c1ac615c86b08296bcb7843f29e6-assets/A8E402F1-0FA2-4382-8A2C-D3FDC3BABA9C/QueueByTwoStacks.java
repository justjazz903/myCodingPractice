public class Solution {
  private LinkedList<Integer> in, out;

  public Solution() {
    // Write your solution here.
    in = new LinkedList<Integer>();
    out = new LinkedList<Integer>();
  }
  public Integer poll() {
    move();
    return out.isEmpty() ? null : out.pollFirst();
  }

  public void offer(int element) {
    in.offerFirst(element);
  }

  public Integer peek() {
    move();
    return out.isEmpty() ? null : out.peekFirst();
  }

  public int size() {
    return in.size() + out.size();
  }

  public boolean isEmpty() {
    return in.isEmpty() && out.isEmpty();
  }

  private void move(){
    if(out.isEmpty()){
      while(!in.isEmpty()){
        out.offerFirst(in.pollFirst());
      }
    }
  }
}
