public class Solution {
  private LinkedList<Integer> s;
  private LinkedList<Integer> minStack;
  public Solution() {
    // write your solution here
    s = new LinkedList<>();
    minStack = new LinkedList<>();
  }

  public int pop() {
    if(s.isEmpty()){
      return -1;
    }
    if(s.peekFirst().equals(minStack.peekFirst())){
      minStack.pollFirst();
    }
    return s.pollFirst();
  }

  public void push(int element) {
    if(minStack.isEmpty() || element <= minStack.peekFirst()){
      minStack.offerFirst(element);
    }
    s.offerFirst(element);
  }

  public int top() {
    return s.isEmpty() ? -1 : s.peekFirst();
  }

  public int min() {
    return minStack.isEmpty() ? -1 : minStack.peekFirst();
  }
}
