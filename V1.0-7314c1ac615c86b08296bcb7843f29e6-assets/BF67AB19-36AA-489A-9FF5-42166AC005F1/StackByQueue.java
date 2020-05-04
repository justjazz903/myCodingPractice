class Solution {
    private Deque<Integer> q;
    /** Initialize your data structure here. */
    public Solution() {
       q = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q.add(x);
        for(int i = 0; i < q.size() - 1; i++){
          q.add(q.remove());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public Integer pop() {
        return q.isEmpty() ? null : q.remove();
    }

    /** Get the top element. */
    public Integer top() {
        return q.isEmpty() ? null : q.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean isEmpty() {
       return q.isEmpty();
    }
}
