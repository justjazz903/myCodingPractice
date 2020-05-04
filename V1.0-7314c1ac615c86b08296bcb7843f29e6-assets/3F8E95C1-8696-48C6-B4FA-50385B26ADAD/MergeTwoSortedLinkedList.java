/**
 * class ListNode {
 *   public int value;
 *   public ListNode next;
 *   public ListNode(int value) {
 *     this.value = value;
 *     next = null;
 *   }
 * }
 */
public class Solution {
  public ListNode merge(ListNode one, ListNode two) {
    // Write your solution here
    ListNode dummy = new ListNode(0);
    ListNode cur = dummy;
    while(one != null && two != null){
      if(one.value > two.value){
        cur.next = two;
        two = two.next;
      }
      else{
        cur.next = one;
        one = one.next;
      }
      cur = cur.next;
    }
    if(one != null){
      cur.next = one;
    }
    else{
      cur.next = two;
    }
    return dummy.next;
  }
}
