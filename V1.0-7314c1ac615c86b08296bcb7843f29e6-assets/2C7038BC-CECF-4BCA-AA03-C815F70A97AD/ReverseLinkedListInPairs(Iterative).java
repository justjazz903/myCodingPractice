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
  public ListNode reverseInPairs(ListNode head) {
    // Write your solution here
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode cur = dummy;
    while(cur.next != null && cur.next.next != null){
      ListNode next = cur.next.next;
      cur.next.next = next.next;
      next.next = cur.next;
      cur.next = next;
      cur = next.next;
    }
    return dummy.next;
  }
}
